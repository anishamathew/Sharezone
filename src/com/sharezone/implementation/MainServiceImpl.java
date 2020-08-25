package com.sharezone.implementation;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.sharezone.bean.OrderDetailsBean;
import com.sharezone.bean.RatingBean;
import com.sharezone.bean.SignUpBean;
import com.sharezone.bean.WorkspaceDetailsBean;
import com.sharezone.jdbc.JdbcProperties;
import com.sharezone.services.MainService;
import com.sharezone.vo.OrderDetailsVo;
import com.sharezone.vo.WorkspaceVo;

public class MainServiceImpl implements MainService {
	
	JdbcProperties jdbc=new JdbcProperties();
    Connection con=jdbc.getConnection();
    String query=null;
	PreparedStatement PS;
	@Override
	public String setSignUp(SignUpBean signup) {
		
		try{
			query="insert into signup(Firstname,Lastname,Gender,Email,Password,UserType)values(?,?,?,?,?,?)";
			PS=con.prepareStatement(query);
			PS.setString(1, signup.getFirstname());
			PS.setString(2, signup.getLastname());
			PS.setString(3, signup.getGender());
			PS.setString(4, signup.getEmail());
			PS.setString(5, signup.getPassword());
			PS.setString(6, signup.getUsertype());
			int resp=PS.executeUpdate();
			
			if(resp!=0){
				return "Success";
			}
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		return "Failed";
	}
	@Override
	public String setlogin(SignUpBean sess) {
		try{
			
			query="select * from signup where Email=? AND Password=?";
			PS=con.prepareStatement(query);
			PS.setString(1,sess.getEmail());
			PS.setString(2,sess.getPassword());
			ResultSet RS=PS.executeQuery();
			while(RS.next()){
				String usertype=RS.getString("UserType");
				Integer userid=Integer.valueOf(RS.getString("id"));
				sess.setUsertype(usertype);
				sess.setId(userid);
				System.out.println(RS.getString("email"));
				return "success";
			}
		}
		catch(Exception e){
			
			System.out.println(e);
		}
		return "Failed";
		
	}
	@Override
	public String setWorkspaceDetails(WorkspaceDetailsBean workspaceDetails) {
try{
			
	query="insert into workspacedetails(workspacename,location,description,facilities,totalchairs,managerid,username,password)values(?,?,?,?,?,?,?,?)";
	PS=con.prepareStatement(query);
	PS.setString(1, workspaceDetails.getWorkspacename());
	PS.setString(2, workspaceDetails.getLocation());
	PS.setString(3, workspaceDetails.getDescription());
	PS.setString(4, workspaceDetails.getFacilities());
	PS.setLong(5, workspaceDetails.getTotalchairs());
	PS.setLong(6, workspaceDetails.getManagerid());
	PS.setString(7,workspaceDetails.getUsername() );
	PS.setString(8, workspaceDetails.getPassword());
	
	
	int resp=PS.executeUpdate();	
	if(resp!=0){
		return "Success";
	}
	
				
			}
		
		catch(Exception e){
			
			System.out.println(e);
		}
		return null;
	}
	@Override
	public ArrayList<WorkspaceVo> getWorkspaceList() {
		try
		{
		query="select * from workspacedetails join signup ON workspacedetails.managerid=signup.id";
		PS=con.prepareStatement(query);
		ResultSet RS=PS.executeQuery();
		ArrayList<WorkspaceVo>list=new ArrayList();
		while(RS.next()){
			WorkspaceVo obj=new WorkspaceVo();
			obj.setId(Integer.valueOf(RS.getString("workspacedetails.id")));
			obj.setWorkspaceName(RS.getString("workspacedetails.workspacename"));
			obj.setLocation(RS.getString("workspacedetails.location"));
			obj.setTotalChairs(Integer.valueOf(RS.getString("workspacedetails.totalchairs")));
			obj.setDescription(RS.getString("workspacedetails.description"));
			obj.setFacilities(RS.getString("workspacedetails.facilities"));
			obj.setFirstName(RS.getString("signup.Firstname"));
			obj.setLastName(RS.getString("signup.Lastname"));
			obj.setRating(RS.getString("currentrating"));
			list.add(obj);
			
		}
		return list;
		}
		catch(Exception e)
		{
			
		}
		return null;
	}
	@Override
	public ArrayList<SignUpBean> getManagerList() {
		ArrayList <SignUpBean> list=new ArrayList();
		try
		{
		query="select * from signup where UserType='manager'";
		PS=con.prepareStatement(query);
		ResultSet RS=PS.executeQuery();
		while(RS.next()){
			
			SignUpBean obj=new SignUpBean();
			obj.setId(Integer.valueOf(RS.getString("signup.id")));
			obj.setFirstname(RS.getString("signup.Firstname"));
			obj.setLastname(RS.getString("signup.Lastname"));
			list.add(obj);
		}
		return list;
		}
		catch(Exception e){
			System.out.println(e);
		}
		return list;
	}
	@Override
	public ArrayList<SignUpBean> getManagers() {
		ArrayList <SignUpBean> list=new ArrayList();
		try{
			query="select * from signup where UserType='manager'";
			PS=con.prepareStatement(query);
			ResultSet RS=PS.executeQuery();
			
			while(RS.next()){
				
				SignUpBean obj=new SignUpBean();
				obj.setId(Integer.valueOf(RS.getString("id")));
				obj.setFirstname(RS.getString("Firstname"));
				obj.setLastname(RS.getString("Lastname"));
				obj.setEmail(RS.getString("Email"));
				obj.setPassword(RS.getString("Password"));
				list.add(obj);			
				}
			return list;
		}
		catch(Exception e){
			
			System.out.println(e);
			
			
		}
		return list;
	}
	@Override
	public ArrayList<WorkspaceDetailsBean> getWorkspaceListForManager(Integer id) {
		ArrayList<WorkspaceDetailsBean>list=new ArrayList();
		try{
			query="select * from workspacedetails where managerid=?";
			PS=con.prepareStatement(query);
			PS.setString(1,id.toString());
ResultSet RS=PS.executeQuery();
			
			while(RS.next()){
			WorkspaceDetailsBean obj=new WorkspaceDetailsBean();
			obj.setId(Integer.valueOf(RS.getString("id")));
			obj.setWorkspacename(RS.getString("workspacename"));
			obj.setLocation(RS.getString("location"));
			obj.setTotalchairs(Integer.valueOf(RS.getString("totalchairs")));
			obj.setDescription(RS.getString("description"));
			obj.setFacilities(RS.getString("facilities"));
			list.add(obj);
			}
			return list;
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		return list;
	}
	@Override
	public String setOrder(OrderDetailsBean obj) {
		try{
			query="insert into orderdetails(userId,workspaceId,active)values(?,?,?)";
			PS=con.prepareStatement(query);
			PS.setLong(1, obj.getUserId());
			PS.setLong(2, obj.getWorkspaceId());
			PS.setLong(3, obj.getActive());
int resp=PS.executeUpdate();
			
			if(resp!=0){
				return "Success";
			}
			
		}
		catch(Exception e){
			
			System.out.println(e);
		}
		return "failed";
	}
	@Override
	public ArrayList<OrderDetailsVo> getRequestList(Integer managerId) {
		
		ArrayList<OrderDetailsVo>list=new ArrayList();
		
		try{
			query="select * from orderdetails join"
					+ " signup on orderdetails.userId=signup.id join "
					+ "workspacedetails on orderdetails.workspaceId=workspacedetails.id where orderdetails.active=1 AND workspacedetails.managerId=?";
			PS=con.prepareStatement(query);
			PS.setString(1,String.valueOf(managerId));
ResultSet RS=PS.executeQuery();
			
			while(RS.next()){
			OrderDetailsVo obj=new OrderDetailsVo();
			obj.setOrderDetailsId(Integer.valueOf(RS.getString("orderdetails.id")));
			obj.setUserId(Integer.valueOf(RS.getString("orderdetails.userId")));
			obj.setWorkspaceId(Integer.valueOf(RS.getString("orderdetails.workspaceId")));
			obj.setActive(Integer.valueOf(RS.getString("orderdetails.active")));
			obj.setSignUpId(Integer.valueOf(RS.getString("signup.id")));
			obj.setFirstname(RS.getString("signup.Firstname"));
			obj.setLastname(RS.getString("signup.Lastname"));
			obj.setGender(RS.getString("signup.Gender"));
			obj.setEmail(RS.getString("signup.Email"));
			obj.setSUPassword(RS.getString("signup.Password"));
			obj.setUsertype(RS.getString("signup.UserType"));
			obj.setWorkspaceDetailsId(Integer.valueOf(RS.getString("workspacedetails.id")));
			obj.setWorkspacename(RS.getString("workspacedetails.workspacename"));
			obj.setLocation(RS.getString("workspacedetails.location"));
			obj.setDescription(RS.getString("workspacedetails.description"));
			obj.setFacilities(RS.getString("workspacedetails.facilities"));
			obj.setTotalchairs(Integer.valueOf(RS.getString("workspacedetails.totalchairs")));
			obj.setManagerid(Integer.valueOf(RS.getString("workspacedetails.managerid")));
			obj.setUsername(RS.getString("workspacedetails.username"));
			obj.setWSPassword(RS.getString("workspacedetails.password"));
			list.add(obj);
			}
			return list;
		}
		catch(Exception e){
			System.out.println(e);
		}
		return null;
	}
	@Override
	public String setapproveRequest(String orderId) {
		try{
			query="update orderdetails set active=2 where id=? ";
			PS=con.prepareStatement(query);
			PS.setString(1, orderId);
			int resp=PS.executeUpdate();
			if(resp!=0){
				return "Success";
			}
		}
		catch(Exception e){
			
			System.out.println(e);
		}
		return null;
	}
	@Override
	public String setrejectRequest(String orderId) {
		try{
			query="update orderdetails set active=0 where id=? ";
			PS=con.prepareStatement(query);
			PS.setString(1, orderId);
			int resp=PS.executeUpdate();
			
		}
		catch(Exception e){
			
			System.out.println(e);
		}
		return null;
	}
	@Override
	public String setexpireRequest(String ordersId) {
		
		try{
			query="update orderdetails set active=3 where workspaceId=? AND active=2 ";
			PS=con.prepareStatement(query);
			PS.setString(1, ordersId);
			int resp=PS.executeUpdate();
			if(resp!=0){
				return "Success";
			}
		}
		catch(Exception e){
			
			System.out.println(e);
		}
		
		return null;
	}
	@Override
	public String setrateMe(RatingBean obj) {
		try{
			query="insert into rating(userid,workspaceid,rating)values(?,?,?)";
			PS=con.prepareStatement(query);
			PS.setString(1,String.valueOf(obj.getUserid()));
			PS.setString(2,String.valueOf(obj.getWorkspaceid()));
			PS.setString(3,String.valueOf(obj.getRating()));
int resp=PS.executeUpdate();
			
			if(resp!=0){
				return "Success";
			}
			
		}
		
		catch(Exception e){
			
			System.out.println(e);
		}
		return "failed";
	}
	@Override
	public ArrayList<RatingBean> getAllReviews(String workspaceid) {
		
		ArrayList<RatingBean>list=new ArrayList();
	try{
		query="select * from rating where workspaceid=?";
		PS=con.prepareStatement(query);
		PS.setString(1, workspaceid);
		ResultSet RS=PS.executeQuery();
		
		while(RS.next()){
			
			RatingBean obj=new RatingBean();
			obj.setRating(Integer.valueOf(RS.getString("rating")));
			list.add(obj);
			
		}
		
		return list;
	}
	catch(Exception e){
		System.out.println(e);
		
	}
		return list;
	}
	@Override
	public String updateRating(String workspaceid, float avgrating) {
		try{
			query="update workspacedetails set currentrating=? where id=?";
			PS=con.prepareStatement(query);
			PS.setString(1, String.valueOf(avgrating));
			PS.setString(2, workspaceid);
int resp=PS.executeUpdate();
			
			if(resp!=0){
				return "Success";
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return "failed";
		
	}
	
		
	
	
	

}
