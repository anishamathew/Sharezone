<%@page import="com.sharezone.bean.WorkspaceDetailsBean"%>
<%@page import="java.util.ArrayList"%>
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
            margin-left: 650;
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
        #j
        {
        margin-top:300;
        }
    
        </style>
    </head> 
    <body>
     <% ArrayList <WorkspaceDetailsBean> list=(ArrayList)request.getAttribute("man"); %>
    <div id="a">
        
        <img id="b" src="images/coworking7.jpg">
        </div>
        <div id="c">
        <img id="d" src="images/SZ%20Logo1.jpg">
<h4 id="f">Logout</h4>
        </div>
        
<ul id="g" type="none">
    <li>Location</li> &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
    <li>Requests</li>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
    <li>View</li> &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
    <li>Employement Details</li>
            </ul>
            
        <div id="h">
            <h1 id="i"> Connect. Collaborate. Grow </h1>
        </div>
        <table id="j">
        <tr>
        <th>sl.no</th>
        <th>workspacename</th>
        <th>location</th>
        <th>totalchairs</th>
        <th>description</th>
        <th>facilities</th>
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
        <%} %>
        </table>
    </body>
</html>