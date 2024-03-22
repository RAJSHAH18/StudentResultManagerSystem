<!--ENROLL NO. : SR21BSIT156
    NAME       : RAJ JIGNESHBHAI SHAH
    CLASS      : SYIT (SEM 3)
    DIV        : B
    FACULTY    : DR. RUPAL MAM
    SUBJECT    : JSP ASS 9
    AIM        : STUDENT RESULT MANAGER SYSTEM
    DATE       : 19/11/2022
-->
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <style>
        .center
            {
                position:absolute;
                top:50%;
                left:50%;
                transform:translate(-50%,-50%);
                width:450x;
<!--                background-color: white;
                border-radius:5px;-->

            }
            
            
        </style>
    </head>
    <body>
        <%@include file="navbar.jsp"%>
        
        
        <%
            String deleted=(String)session.getAttribute("deleted");
            if(deleted!= null)
            {
                out.println("<script>alert('"+deleted+"')</script>");
                session.removeAttribute("deleted");
            }
                

            String failed=(String)session.getAttribute("failed");
            if(failed!= null)
            {
                out.println("<script>alert('"+failed+"')</script>");
                session.removeAttribute("failed");
            }
            

            String updated=(String)session.getAttribute("updated");
            if(updated!= null)
            {
                out.println("<script>alert('"+updated+"')</script>");
                session.removeAttribute("updated");
            }
                

            String fail=(String)session.getAttribute("fail");
            if(fail!= null)
            {
                out.println("<script>alert('"+fail+"')</script>");
                session.removeAttribute("fail");
            }
        %>
        <div class="center">
            <center><h1>Student Result Manager</h1></center>
            <table border="2px"  cellspacing="0px" cellpadding="30px">
                <tr>
                    <th>ROLL NO</th>
                    <th>NAME</th>
                    <th>CGPA</th>
                    <th>DELETE</th>
                    <th>UPDATE</th>
                </tr>

                <%
                    
                    Connection con=null;
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student result system","root","");
//                    if(con!=null)
//                    {
//                        out.println("Connected");
//                    }
                    String query="SELECT * FROM student_results";
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery(query);
                    
                    while(rs.next())
                    {
                        
                %>        
                        

                        <tr>
                            <td><%=rs.getInt("s_id")%></td>
                            <td><%=rs.getString("s_name")%></td>
                            <td><%=rs.getDouble("s_cgpa")%></td>
                            <td><a href="delete?sid=<%=rs.getInt("s_id")%>"><button>DELETE</button></a></td>
                            <td><a href="update.jsp?sid=<%=rs.getInt("s_id")%>"><button>UPDATE</button></a></td>
                            
                        </tr>
                        
                        
                        
                        
                        
                        
                        
                        
                       
                        
                <%        
                    }

                %>



            </table>
                <br>
                <br>
                <center><a href="insert.jsp" style="color:blue"><u>INSERT STUDENT RESULT</u></a></center>


        </div>


    </body>
</html>
