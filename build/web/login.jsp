<!--ENROLL NO. : SR21BSIT156
    NAME       : RAJ JIGNESHBHAI SHAH
    CLASS      : SYIT (SEM 3)
    DIV        : B
    FACULTY    : DR. RUPAL MAM
    SUBJECT    : JSP ASS 9
    AIM        : STUDENT RESULT MANAGER SYSTEM
    DATE       : 19/11/2022
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login Form </title>
                    <style>
            body{
                margin:0;
                padding:0;
                background-color:#D071f9;
            }
            .center
            {
                position:absolute;
                top:50%;
                left:50%;
                transform:translate(-50%,-50%);
                width:470px;
                height:446px;
                background-color: white;
                border-radius:5px;

            }
            .center h1{
                text-align:center;
                padding:20px;
                border-bottom:2px solid silver;
            }
            .form{
                padding-bottom: 15px;
                margin:20px;
                text-align: center;

            }
            .textfield
            {
                width:100%;
                height:50px;
                font-size:18px;
                border:2px solid #D071f9;
                border-radius:5px;
                box-sizing: border-box;
                padding-left:10px;
                margin:12px 0px;
            }
            .btn
            {
                width:100%;
                height:50px;
                background-color:#D071f9;
                border-radius: 5px;
                font-size: 20px;
                margin:16px 0px;
                color:white;
                border:0;
                cursor:pointer;
            }
            .btn:hover{
                background-color: #0a63d8;
            }




            .link
            {
                font-size: 16px;
                padding:4px 0px;
                margin:3px;
            }



            @media (max-width:  420px)
            {
                .center{
                    width:88%;
                }
            }

        </style>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"> 

    </head>
    <body style="background-color: #D071f9">
          <%@include file="navbar.jsp"%>
    <form action="login" method="post" autocomplete="OFF">
        <div class="center">
                <h1>ADMIN LOGIN FORM</h1>
        <%
            String pass_fail=(String)session.getAttribute("pass_fail");
            if(pass_fail!= null)
            {
        %>  
        <div class="alert alert-danger" role="alert"><%=pass_fail%></div>
            
        <%        
            }
            session.removeAttribute("pass_fail");

        %>
        
         <%
            String username_fail=(String)session.getAttribute("username_fail");
            if(username_fail!= null)
            {
        %>  
        <div class="alert alert-danger" role="alert"><%=username_fail%></div>
            
        <%        
            }
            session.removeAttribute("username_fail");

        %>
          <div class="form">

                            <input type="text" name="username" class="textfield" placeholder="USERNAME" required>
                            <input type="password" name="password" class="textfield" placeholder="PASSWORD" required>
                        <div class="forget">
                            <a href="#" class="link" onclick="alert('PLEASE THINK YOUR PASSWORD')">Forget Your Password ?</a>
                        </div>
                        <div>
                            <input type="submit" class="btn" name="submit" value="LOGIN"> 
                        </div>    
                        <div class="signup">
                            New Member <a href="register.jsp" class="link">Sign Up Here?</a>
                        </div>      
            </div>

        </div>
    </form>
    </body>
</html>
