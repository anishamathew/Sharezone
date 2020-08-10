package com.sharezone.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.sharezone.bean.SignUpBean;
import com.sharezone.bean.WorkspaceDetailsBean;
import com.sharezone.jdbc.JdbcProperties;
import com.sharezone.services.MainService;
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
			obj.setFirstName(RS.getString("signup.Firstname"));
			obj.setLastName(RS.getString("signup.Lastname"));
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
	
	
	

}
