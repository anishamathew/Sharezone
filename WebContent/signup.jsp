<html>
<head>
    <title>SignUp Page</title>
    <style>
    #a
            {
            height:650;
                width:1350;
                background-color: black;
            
            }
            #b
            {
                width: 1350;
                height:650;
                opacity: 0.5;
            }
            #c
            {
                margin-top: -600;
                margin-left: 530;
        }
        #d
        {
        background-color: gray;
                width:400;
                height:500;
                margin-top: -500;
                margin-left: 450;
            position: absolute;
            opacity: 0.7;
        }
        #e
        {
         margin-left: 120;
                margin-top:70;
                position: absolute;
                font-size: 20;
                color: black;
        }
        #f
        {
           margin-left:150;
            position: absolute;
        }
    
        #h
        {
                    margin-left: 120;
                margin-top:130;
                position: absolute;
                font-size: 20;
                color: black;
 
        }
        #i
        {
             margin-left: 120;
                margin-top:185;
                position: absolute;
                font-size: 20;
                color: black;
        }
        #j
        {
         margin-left: 120;
                margin-top:240;
                position: absolute;
                font-size: 20;
                color: black;   
        }
        #k
        {
          margin-left: 120;
                margin-top:300;
                position: absolute;
                font-size: 20;
                color: black;  
        }
        #l
        {
            margin-left: 120;
                margin-top:360;
                position: absolute;
                font-size: 20;
                color: black;  
        }
        #m
        {
           margin-left: 50;
                margin-top:20;
                position: absolute;
                font-size: 20;
                  
        }
        #n
        {
        
        }
    </style>
    </head>
    <body>
        <div id="a">
          <img id="b" src="images/coworking1.jpg">
        <img id="c" src="images/SZ%20Logo1.jpg">
        </div>
        <div id="d">
    <form action="MainController" method="post">
        <div id="g">
            <h2 id="f"><center>SignUp</center></h2>
        </div>
        <div id="e">
        <label>First Name:</label><br>
        <input type="text"name="fname"required><br><br>
        </div>
        <div id="h">
        <label>Last Name:</label><br>
        <input type="text"name="lname"required><br><br>
        </div>
        <div id="i">
        <label>Gender:</label><br>
        <label>Male</label>
        <input type="radio"name="gender" value="male" required>
        <label>Female</label>
        <input type="radio"name="gender" value="female" required><br><br>
        </div>
        <div id="j">
        <label>Email:</label><br>
        <input type="email"name="emailid"required><br><br>
        </div>
        <div id="k">
        <label>Password:</label><br>
        <input type="password"name="pwd1"required><br><br>
        </div>
        <div id="l">
        <label>Confirm Password:</label><br>
        <input type="password"name="pwd2"required><br><br>
        <div id="n">
        <select name="useType"><option value="user">User</option><option value="manager">Manager</option></select>
        </div>
         <div id="m">
        <button type="Submit" name="actionFinder" Value="SignUp">SignUp</button>
        </div>
        </form>
        </div>
    </body>
</html>