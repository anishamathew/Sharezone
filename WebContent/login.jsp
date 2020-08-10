<html>
    <head>
    <title>Login Page</title>
        <style>
        #a
            {
            height:650;
                width:1350;
                background-color: black;
            
            }
            #k
            {
                width: 1350;
                height:650;
                opacity: 0.5;
            }
            #b
            {
                margin-top: -600;
                margin-left: 530;
            }
            #c
            {
             background-color: gray;
                width:400;
                height:400;
                margin-top: -500;
                margin-left: 450;
            }
            #d
            {
                margin-left: 150;
                position: absolute;
                color: black;
            }
            #e
            {
                margin-left: 120;
                margin-top: 100;
                position: absolute;
                font-size: 20;
                color: black;
            
            }
            #f
            {
               margin-left: 120;
                margin-top: 200;
                position: absolute;
                font-size: 20;
                color: black;
            }
            #g
            {
                margin-left:165 ;
                margin-top:300;
             position: absolute;
                
            }
            #h
            {
              width: 80;
                height:30;
            }
            #i
            {
              margin-left:220 ;
                margin-top:312;
             position: absolute; 
                
            }
            a:link,a:visited
            {
                color: black;
               font-size: 15;
                }
            
            #j
            {
              width: 80;
                height:30;  
            }
            #l
            {
             margin-left: -140;
                margin-top: 40;
            }
            #m
            {
              margin-top: -40;
                margin-left:30;
            }
        </style>
    </head>
    <body>
      <div id="a">
          <img id="k" src="images/coworking1.jpg">
        <img id="b" src="images/SZ%20Logo1.jpg">
        </div>
        <div id="c">
    <form action="MainController" method="post">
        <h1 id="d">Login</h1>
        <div id="e">
        <label>Email:</label><br><br>
        <input type="text"name="email" required><br><br>
        </div>
        <div id="f">
        <label>Password:</label><br><br>
        <input type="password"name="pwd" required><br><br>
        </div>
        <div id="g">
        <button id="h" type="Submit"  name="actionFinder" Value="login">Login</button>
        </div>
        <div id="i">
            <h4 id="l">Don't have an account?</h4>
            <a  href="signup.jsp"><h4 id="m"> SignUp </h4></a>
        </div>
        </form>
        </div>
    </body>
</html>