<%@page import="com.sharezone.vo.WorkspaceVo" %>
<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
    <title>Admin Page</title>
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
        a{text-decoration:none;position:absolute;color: white;margin-left: 50;}
        #j
        {
         text-decoration:none;position:absolute;color:white;margin-left:1050;font-size:18;margin-top:22; background:transparent;border:none;  
        }
        #k
        {
            text-decoration:none;position:absolute;color: white;margin-left: 120;
        }
        #l
        {
            text-decoration:none;position:absolute;color: white;margin-left: 1250;margin-top:-10;font-size:20;
        }
        #m{
        text-decoration:none;position:absolute;color: white;margin-left:30; margin-top:5;font-size:18; background:transparent;border:none; visibility:hidden;
        }
        #o
        {
        margin-left: 80;
        margin-top:300;
        }
        #p{
        margin-left:500;
        margin-top:-300;
        color:white;
        
        }
        #q{
        margin-left:550;
        margin-top:-150;
        position:absolute;
        }
        </style>
    </head> 
    <body>
    
    <% ArrayList <WorkspaceVo> list=(ArrayList)request.getAttribute("wslist"); %>
   
    <div id="a">
        
        <img id="b" src="images/coworking6.jpg">
        </div>
        <div id="c">
        <img id="d" src="images/SZ%20Logo1.jpg">
<a id="f" href="login.jsp">Logout</a>
        </div>
        
     

<form action="MainController" method="post">
    <button id="m" value="wsn" >Workspace</button> &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
    <button id="j" name="actionFinder" value="showmanagers" >Managers</button>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
    </form>
     <a id="l" href="admininfo.jsp">Info</a>
    
            
        
        <div id="h">
            <h1 id="i"> Connect. Collaborate. Grow </h1>
        </div>
        <div id="o">
        <form action="MainController" method="post">
        <button id="q" type="submit" name="actionFinder" value="Addworkspace" >Add Workspace </button>
        
        </form>
        </div>
        <table id="p">
        <tr>
        <th>Sl.no</th>
        <th>Workspacename</th>
        <th>Location</th>
        <th>Manager</th>
        <th>Rating</th>
        </tr>
        <% for(int i=0;i<list.size();i++)
        { %>
        <tr>
        <td><%=i+1%></td>
        <td><%=list.get(i).getWorkspaceName()%></td>
        <td><%=list.get(i).getLocation() %></td>
        <td><%=list.get(i).getFirstName() %><%=list.get(i).getLastName() %></td>
        <td><%=list.get(i).getRating() %></td>
        <%} %>
        </table>
    </body>
</html>