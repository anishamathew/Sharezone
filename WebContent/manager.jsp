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
        margin-left:400;
        
        }
        #k
        {
         margin-top:500;
         position:absolute;
         margin-left:600;
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
<a id="f" href="login.jsp">Logout</a>
        </div>
        

            <form action="MainController" method="post">
            <button id="k" type="submit" value="newreq" name="actionFinder">NewRequests</button>
            </form>
            
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
        <th>Action</th>
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
        <td>
        <form action="MainController" method="post">
        <button type="submit" name="actionFinder" value="expired">Expired</button>
         <input type="hidden" name="ordersFinder" value=<%=list.get(i).getId() %>>
         </td>
        </form>
        <%} %>
        </table>
    </body>
</html>