<%@page import="com.sharezone.bean.SignUpBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
    <title> Admin-Create</title>
    <style>
        #a
        {
            background-color: black;
            width:1350;
            height:800;
        }
        #b
        {
            width:1350;
            height:800;
            opacity:0.4;
        }
        #c
        {
          width:1350;
            height:40;
            background-color: orange;
            margin-top: -800;
            
        }
        #d
        {
            width:200;
            height:30;
            margin-top: 5;
            margin-left: 6;
        }
        #e
        {
            
            width:600;
            height: 730;
            background-color:black;
            margin-left: 20;
            position: absolute;
            margin-top: 20;
            opacity: 0.7;
        }
        #f
        {
          font-family: cursive; 
            margin-left: 20;
            color: white;
            position: absolute;
        }
        #g
        {
            margin-left: 20;
            margin-top: 70;
            width: 550;
        }
        #h
        {
            margin-left: 20;
            margin-top: 20;
            width: 550;
        }
        #i
        {
            font-family: cursive; 
            margin-left: 20;
            color: white;
            margin-top:10;
            
        }
        #j
        {
          margin-left: 20;
            margin-top:-10;
            width: 550;
            height: 80;
        }
        #k
        {
          font-family: cursive; 
            margin-left: 20;
            color: white;
            margin-top:10;  
        }
        #l
        {
            margin-left: 20;
            margin-top:-10;
            width: 550;
            height: 80;
        }
        #m
        {
        font-family: cursive; 
            margin-left: 20;
            color: white;
            margin-top:10;
        }
        #n
        {
          margin-left: 120;
            margin-top: -40;
        }
        #o
        {
            font-family: cursive; 
            margin-left: 20;
            color: white;
            position: absolute;
        }
        #p
        {
           margin-left: 20;
            margin-top:50;
            width: 550; 
        }
        #q
        {
            margin-left: 20;
            margin-top: 20;
            width: 550;
        }
        #r
        {
            margin-left: 20;
            margin-top: 20;
            width: 550;
        }
        #s
        {
            margin-left: 20;
            margin-top: 20;
            width: 550;
        }
        #t
        {
            margin-left: 20;
            margin-top: 20;
            width: 550;
        }
        #u
        {
            margin-left: 250;
            margin-top: 15;
            width: 80;
            height: 30;
        }
        #e
        {
            margin-left: 350;
        }
    </style>
</head> 
    <body>
    
    <div id="a">
         <img id="b" src="images/coworking5.jpg">
        </div>
        <div id="c">
        <img id="d" src="images/SZ%20Logo1.jpg">
        </div>
        <div id="e">
            <h2 id="f">Workspace Details</h2>
        <form action="MainController" method="post">
        <input id="g" type="text"name="wsname" placeholder="Workspace Name"required>
            <input id="h" type="text"name="loc" placeholder="Location"required>
            <h4 id="i">Description</h4>
            <input id="j" type="text"name="desc"required>
            <h4 id="k">Facilities</h4>
            <input id="l" type="text"name="facilities"required>
            <h4 id="m">Total Chairs</h4>
            <input id="n" type="number"name="no"required>
            <h2 id="o">Manager Details</h2>
            <%ArrayList <SignUpBean>list=(ArrayList)request.getAttribute("managerlist"); %>
            <select id="p" name="managerid">
            <%for(int i=0;i<list.size();i++){ %>
            <option value="<%=list.get(i).getId()%>">
             <%=list.get(i).getFirstname() %>
             <%=list.get(i).getLastname() %>
             </option>
             <%} %>
            </select>
            <input id="s" type="text"name="txt" placeholder="Username"required>
            <input id="t" type="password"name="pwd" placeholder="Password"required>
            <button id="u" type="submit" name="actionFinder" value="Create">Create</button>
            </form>
        </div>
    </body>
</html>