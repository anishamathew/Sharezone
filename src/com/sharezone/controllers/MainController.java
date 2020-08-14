package com.sharezone.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sharezone.bean.OrderDetailsBean;
import com.sharezone.bean.SignUpBean;
import com.sharezone.bean.WorkspaceDetailsBean;
import com.sharezone.implementation.MainServiceImpl;
import com.sharezone.services.MainService;
import com.sharezone.vo.WorkspaceVo;

/**
 * Servlet implementation class MainController
 */
@WebServlet("/MainController")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String actionFinder=request.getParameter("actionFinder");
		MainService service=new MainServiceImpl();
		HttpSession sessions=request.getSession();
		if(actionFinder.equals("SignUp")){
			
			String firstname=request.getParameter("fname");
			String lastname=request.getParameter("lname");
			String gender=request.getParameter("gender");
			String email=request.getParameter("emailid");
			String password=request.getParameter("pwd1");
			String confirmpassword=request.getParameter("pwd2");
			String usertype=request.getParameter("useType");
			SignUpBean signup=new SignUpBean();
			signup.setFirstname(firstname);
			signup.setLastname(lastname);
			signup.setGender(gender);
			signup.setEmail(email);
			signup.setPassword(password);
			signup.setUsertype(usertype);
			MainService mainService=new MainServiceImpl();
			String resp=mainService.setSignUp(signup);
			
			if(resp.equals("Success")){
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			else
			{
				request.getRequestDispatcher("signup.jsp").forward(request, response);
			}
		}
		
		
			else if(actionFinder.equals("login")){
				String email=request.getParameter("email");
				String password=request.getParameter("pwd");
				SignUpBean sess=new SignUpBean();
				sess.setEmail(email);
				sess.setPassword(password);
				MainService mainservice2=new MainServiceImpl();
				String resp=mainservice2.setlogin(sess);
				String usertype=sess.getUsertype();
				sessions.setAttribute("userid",sess.getId());
				if(resp.equals("success")){
					
				
				if(usertype.equals("user")){
					ArrayList<WorkspaceVo>list=service.getWorkspaceList();
					System.out.println(list.size());
					request.setAttribute("wospacelist", list);
					request.getRequestDispatcher("user.jsp").forward(request, response);
				}
				else if(usertype.equals("manager")){
					ArrayList<WorkspaceDetailsBean>list=service.getWorkspaceListForManager(sess.getId());
					request.setAttribute("man", list);
					request.getRequestDispatcher("manager.jsp").forward(request, response);
				}
				else if(usertype.equals("admin")){
					ArrayList <WorkspaceVo>list=mainservice2.getWorkspaceList();
					request.setAttribute("wslist", list);
					request.getRequestDispatcher("admin.jsp").forward(request, response);
					}
				
				}
				else
				{
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			}
				else if(actionFinder.equals("Create")){
					
					String Workspacename=request.getParameter("wsname");
					String Location=request.getParameter("loc");
					String Description=request.getParameter("desc");
					String Facilities=request.getParameter("facilities");
					int TotalChairs=Integer.parseInt(request.getParameter("no"));
					int ManagerId=Integer.parseInt(request.getParameter("managerid"));
					String username=request.getParameter("txt");
					String password=request.getParameter("pwd");
					WorkspaceDetailsBean workspaceDetails=new WorkspaceDetailsBean();
					
					workspaceDetails.setWorkspacename(Workspacename);
					workspaceDetails.setLocation(Location);
					workspaceDetails.setDescription(Description);
					workspaceDetails.setFacilities(Facilities);
					workspaceDetails.setTotalchairs(TotalChairs);
					workspaceDetails.setManagerid(ManagerId);
					workspaceDetails.setUsername(username);
					workspaceDetails.setPassword(password);
					
					MainService mainservice3=new MainServiceImpl();
					String resp3=mainservice3.setWorkspaceDetails(workspaceDetails);
					if(resp3.equals("Success")){
						request.getRequestDispatcher("SZHome.jsp").forward(request, response);
					}
					else
					{
						ArrayList<SignUpBean>list=service.getManagerList();
						request.setAttribute("managerlist", list);
						request.getRequestDispatcher("admincreate.jsp").forward(request, response);
					}
					
				}
				else if(actionFinder.equals("Addworkspace")){
					ArrayList<SignUpBean>list=service.getManagerList();
					for(int i=0;i<list.size();i++){
						System.out.println(list.get(i).getId());
						System.out.println(list.get(i).getFirstname());
						System.out.println(list.get(i).getLastname());
						
					}
					request.setAttribute("managerlist", list);
					request.getRequestDispatcher("admincreate.jsp").forward(request, response);
					
					
				}
				else if(actionFinder.equals("showmanagers")){
					
					ArrayList<SignUpBean>list=service.getManagers();
					request.setAttribute("managers", list);
					request.getRequestDispatcher("managers.jsp").forward(request,response);
				}
				else if(actionFinder.equals("bookMySpace")){
		String workspaceId=request.getParameter("workspaceFinder");
		Integer userId=(Integer)sessions.getAttribute("userid");
		OrderDetailsBean obj=new OrderDetailsBean();
		obj.setUserId(userId);
		obj.setWorkspaceId(Integer.valueOf(workspaceId));
		obj.setActive(1);
		String setOrder=service.setOrder(obj);
			}
			}
}

			
			
		
		
		
	





