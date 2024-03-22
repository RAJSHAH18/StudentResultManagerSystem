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
        <title>Navbar Page</title>
         <style>
            *{
                margin: 0;
                font-family: "Poppins", Sans-serif;
            }
            .nav-bar{
                /*width: 98%;*/
                display: flex;
                flex-direction: row;
                justify-content: space-between;
                align-items: center;
                background-color: #34495e;
                padding: 1.2rem;
                /*position: fixed;*/
            }       
            
            a{
                all: unset;
                font-size: 1.2rem;
                font-weight: 600;
            }
            
            a:hover{
                cursor: pointer;
                color: steelblue;
            }
           
            ul{
                display: flex;
                align-items: center;
                list-style: none;
                gap: 1.2rem;
            }
           
            
        </style>
        
    </head>
    <body>
    <%
         String username = (String) session.getAttribute("username");
         if(username==null)
         {
    %>
            <nav class="nav-bar">
                <ul>
                    <li class="logo" style="font-size:2rem; font-weight: 800; color: white;">Result Manager</li>
                </ul>
                <ul>
                    <li class="active"><a href="index.jsp">HOME</a></li>
                    <li class="active"><a href="login.jsp">LOGIN</a></li>

                </ul>

            </nav>
    <%
       }
       else
        {
    %>
            <nav class="nav-bar">
                <ul>
                    <li class="logo" style="font-size:2rem; font-weight: 800; color: white;">Result Manager</li>
                </ul>
                <ul>
                    <li class="active"><a href="home.jsp">HOME</a></li>
                    <li class="active"><a href="logout">LOGOUT</a></li>
                    <li class="active" style="font-weight:bold;font-size: 25px;color: #666dff; "> WELCOME <%=username%></li>
                </ul>

            </nav>


    <%
        }        
    %>
    </body>
</html>
