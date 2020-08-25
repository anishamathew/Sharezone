<%@page import="com.sharezone.vo.OrderDetailsVo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
    <title>Manager Page</title>
    <style>
    #a
        {
            background-color: black;
            width:1350;
            height:600
        }
        #b
        {
            width:1350;
            height:600;
            opacity:0.4;
        }
        #c
        {
          width:1350;
            height:40;
            background-color: orange;
            margin-top: -600;
            
        }
        #d
        {
            width:200;
            height:30;
            margin-top: 5;
            margin-left: 6;
        }
        
        
        #f
        {
          margin-left:1070;
          margin-top:10;
            position:absolute;
            color:black;
        }
        
        #i
        {
            font-size: 50;
            font-family: fantasy;
            margin-left: 380;
            margin-top: 200;
            color: white;
        }
        #j
        {
         color:white;
        position:absolute;
        margin-left:300;
        }
    
        </style>
    </head> 
    <body>
     <% ArrayList <OrderDetailsVo> list=(ArrayList)request.getAttribute("req"); %>
    <div id="a">
        
        <img id="b" src="images/coworking7.jpg">
        </div>
        <div id="c">
        <img id="d" src="images/SZ%20Logo1.jpg">
<a id="f" href="login.jsp">Logout</a>
        </div>
        
            
            
        <div id="h">
            <h1 id="i"> Connect. Collaborate. Grow </h1>
        </div>
        <table id="j">
        <tr>
        <th>Sl.no</th>
        <th>WorkspaceName</th>
        <th>Location</th>
        <th>TotalChairs</th>
        <th>Description</th>
        <th>Facilities</th>
        <th>Email</th>
        <th>Username</th>
        <th>Gender</th>
        <th>Userid</th>
        <th>Workspaceid</th>
        </tr>
        <% for(int i=0;i<list.size();i++)
        { %>
        <tr>
        <td><%=i+1%></td>
        <td><%=list.get(i).getWorkspacename()%></td>
        <td><%=list.get(i).getLocation()%></td>
        <td><%=list.get(i).getTotalchairs() %></td>
        <td><%=list.get(i).getDescription() %></td>
        <td><%=list.get(i).getFacilities()%></td>
        <td><%=list.get(i).getEmail() %></td>
        <td><%=list.get(i).getFirstname() %><%=list.get(i).getLastname() %></td>
        <td><%=list.get(i).getGender() %></td>
        <td><%=list.get(i).getUserId() %></td>
        <td><%=list.get(i).getWorkspaceId() %></td>
        <td>
        <form action="MainController" method="post">
        <button type="submit" name="actionFinder" value="approve">Approve</button>
        <button type="submit" name="actionFinder" value="reject">Reject</button>
        <input type="hidden" name="orderFinder" value=<%=list.get(i).getOrderDetailsId() %>>
        </form>
        </td>
        <%} %>
        </table>
    </body>
</html>