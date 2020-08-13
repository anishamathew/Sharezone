
<%@page import="com.sharezone.bean.SignUpBean"%>
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
          margin-left: 1250;
            margin-top: -25;
        }
         #g li
        {
            
            display: inline;
            color: white;
        }
        #g
        {
            margin-left: 760;
            font-family: cursive;
            font-size: 20;
            color:white;
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
         text-decoration:none;position:absolute;color: white;margin-left: 80;font-size:18;margin-top:5; background:transparent;border:none;  
        }
        #k
        {
            text-decoration:none;position:absolute;color: white;margin-left: 120;
        }
        #l
        {
            text-decoration:none;position:absolute;color: white;margin-left: 180;
        }
        #m{
        text-decoration:none;position:absolute;color: white;margin-left:30; margin-top:5;font-size:18; background:transparent;border:none; 
        }
        #o
        {
        margin-left: 80;
        margin-top:300;
        }
        </style>
    </head> 
    <body>
    
    <% ArrayList <SignUpBean> list=(ArrayList)request.getAttribute("managers"); %>
    
   
    <div id="a">
        
        <img id="b" src="images/coworking6.jpg">
        </div>
        <div id="c">
        <img id="d" src="images/SZ%20Logo1.jpg">
<h4 id="f">Logout</h4>
        </div>
        
        
<ul id="g" type="none">
    <button id="m" value="wsn">Workspace</button> &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
    <button id="j" value="showmanagers">Managers</button>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
    <a id="k" href="login.html">Reviews</a> &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
    <a id="l" href="admininfo.html">Info</a>
            </ul>
        
        <div id="h">
            <h1 id="i"> Connect. Collaborate. Grow </h1>
        </div>
        <div id="o">
        
        </div>
        <table>
        <tr>
        <th>sl.no</th>
        <th>name</th>
        <th>email</th>
        <th>password</th>
        </tr>
        <% for(int i=0;i<list.size();i++)
        { %>
        <tr>
        <td><%=i+1%></td>
      
        <td><%=list.get(i).getFirstname() %><%=list.get(i).getLastname() %></td>
        <td><%=list.get(i).getEmail()%></td>
        <td><%=list.get(i).getPassword() %></td>
        <%} %>
        </table>
    </body>
</html>