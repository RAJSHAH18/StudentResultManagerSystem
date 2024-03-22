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
        <title>UPDATE Page</title>
           <style>
            body{
                    margin:0;
                    padding:0;
                    background-color: #D071f9;
                }
                .center
                {
                    position:absolute;
                    top:50%;
                    left:50%;
                    transform:translate(-50%,-50%);
                    width:480px;
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
                    margin:7px 0px;
                }
                .btn
                {
                    width:100%;
                    height:50px;
                    background-color: #D071f9;
                    border-radius: 5px;
                    font-size: 20px;
                    margin:7px 0px;
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
    </head>
    <body>
        <%
                            Connection con=null;
                            Class.forName("com.mysql.jdbc.Driver");
                            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student result system","root","");
                            if(con!=null)
                            {
                                out.println("Connected");
                            }
                            int sid=Integer.parseInt(request.getParameter("sid"));
                            String query="SELECT * FROM student_results WHERE s_id="+sid;
                            Statement st=con.createStatement();
                            ResultSet rs=st.executeQuery(query);
                            while(rs.next())
                            {
                                
           %>                     
                                
                                
                                
        <form action="update" method="POST" autocomplete="OFF">
            <div class="center">
                <h1>INSERT STUDENT RESULT</h1>
            <div class="form">

                <input type="text" name="rollno" class="textfield" value="<%=rs.getInt("s_id")%>" placeholder="ROLL NO" required readonly>          
                    <input type="text" name="name" class="textfield" value="<%=rs.getString("s_name")%>" placeholder="NAME" required>
                    <input type="text" name="cgpa" class="textfield" value="<%=rs.getDouble("s_cgpa")%>" placeholder="CGPA" required> 
                    <select name="dept" class="textfield" required>
                        <option value="" disabled selected hidden>SELECT DEPARTMENT</option>
                        <%
                                String qry="SELECT * FROM dept";
                                Statement s=con.createStatement();
                                ResultSet r=s.executeQuery(qry);
                                while(r.next())
                                {
                                    String select="";
                                    if(rs.getInt("d_id")==r.getInt("d_id"))
                                    {
                                    select="SELECTED";
                                    }
                                    else
                                    {
                                    select="";
                                    }
                        %>        
                                    
                            
                                    <option <%= select%> value="<%=r.getInt("d_id")%>" > <%=r.getString("d_name")%></option>
                        <%        
                                }
                            
                        %>
                        
                    </select>
                    <div>
                        <input type="submit" class="btn" name="submit" value="UPDATE"> 
                    </div>
                       
                    <div>
                        <!--<a href="home.jsp"><button class="btn" style="background-color:black">BACK</button></a>--> 
                        <button class="btn" class="btn" style="background-color:black"><a href="home.jsp"style="color:white; text-decoration:none">BACK</a></button>

                        <!--<button class="btn" formaction="home.jsp">BACK</button>-->
                    </div>    
                </div>
            </div>
        </form>
                    <%
                            
                        }  
                    %>         

                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
             
    </body>
</html>
