<%@page import="com.sharezone.vo.WorkspaceVo"%>
<%@page import="java.util.ArrayList"%>
<html>
<head>
    <title>User Page</title>
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
        
        
         #g li
        {
            
            display: inline;
            color: white;
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
        margin-top:80;
        margin-left:380;
        color:white;
        position:absolute;
        
        }
        #k
        {
        margin-top:-10;
        position:absolute;
        }
        #l
        {
         margin-top:-10;
        position:absolute;
        }
        #m
        {
         margin-top:-10;
        position:absolute;
        }
    
        </style>
    </head> 
    <body>
    <% ArrayList <WorkspaceVo> list=(ArrayList)request.getAttribute("wospacelist"); %>
    
    <div id="a">
        
        <img id="b" src="images/coworking9.jpg">
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
        <th>Workspace Name</th>
        <th>Location</th>
        <th>Total Chairs</th>
        <th>Description</th>
        <th>Facilities</th>
        <th>Action</th>
        <th>Rate</th>
        <th>Rating</th>
        </tr>
        <% for(int i=0;i<list.size();i++)
        { %>
        <tr>
        <td><%=i+1%></td>
        <td><%=list.get(i).getWorkspaceName()%></td>
        <td><%=list.get(i).getLocation()%></td>
        <td><%=list.get(i).getTotalChairs() %></td>
        <td><%=list.get(i).getDescription() %></td>
        <td><%=list.get(i).getFacilities()%></td>
        
        <td>
        <form action="MainController" method="post">
        <button  id="k" type="submit" name="actionFinder" value="bookMySpace">Book</button>
        <input type="hidden" name="workspaceFinder" value=<%=list.get(i).getId()%>>
        </form>
        </td>
       
        <td>
        <form action="MainController" method="post">
        <select id="m" name="rate">
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>
        </select>
        </td>
        <td>
        <button id="l" type="submit" name="actionFinder" value="rateme">Rate</button>
         <input type="hidden" name="workspaceFinder" value=<%=list.get(i).getId()%>>
        </td>
        </form>
         <td><%=list.get(i).getRating() %></td>
        <%} %>
        </table>
    </body>
</html>