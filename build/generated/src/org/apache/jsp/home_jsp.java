package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navbar.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Page</title>\n");
      out.write("        <style>\n");
      out.write("        .center\n");
      out.write("            {\n");
      out.write("                position:absolute;\n");
      out.write("                top:50%;\n");
      out.write("                left:50%;\n");
      out.write("                transform:translate(-50%,-50%);\n");
      out.write("                width:450x;\n");
      out.write("<!--                background-color: white;\n");
      out.write("                border-radius:5px;-->\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Navbar Page</title>\n");
      out.write("         <style>\n");
      out.write("            *{\n");
      out.write("                margin: 0;\n");
      out.write("                font-family: \"Poppins\", Sans-serif;\n");
      out.write("            }\n");
      out.write("            .nav-bar{\n");
      out.write("                /*width: 98%;*/\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: row;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                align-items: center;\n");
      out.write("                background-color: #34495e;\n");
      out.write("                padding: 1.2rem;\n");
      out.write("                /*position: fixed;*/\n");
      out.write("            }       \n");
      out.write("            \n");
      out.write("            a{\n");
      out.write("                all: unset;\n");
      out.write("                font-size: 1.2rem;\n");
      out.write("                font-weight: 600;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            a:hover{\n");
      out.write("                cursor: pointer;\n");
      out.write("                color: steelblue;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("            ul{\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                list-style: none;\n");
      out.write("                gap: 1.2rem;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");

         String username = (String) session.getAttribute("username");
         if(username==null)
         {
    
      out.write("\n");
      out.write("            <nav class=\"nav-bar\">\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"logo\" style=\"font-size:2rem; font-weight: 800; color: white;\">Result Manager</li>\n");
      out.write("                </ul>\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"active\"><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"login.jsp\">LOGIN</a></li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("    ");

       }
       else
        {
    
      out.write("\n");
      out.write("            <nav class=\"nav-bar\">\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"logo\" style=\"font-size:2rem; font-weight: 800; color: white;\">Result Manager</li>\n");
      out.write("                </ul>\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"active\"><a href=\"home.jsp\">HOME</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"logout\">LOGOUT</a></li>\n");
      out.write("                    <li class=\"active\" style=\"font-weight:bold;font-size: 25px;color: #666dff; \"> WELCOME ");
      out.print(username);
      out.write("</li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");

        }        
    
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("        <div class=\"center\">\n");
      out.write("            <center><h1>Student Result Manager</h1></center>\n");
      out.write("            <table border=\"2px\"  cellspacing=\"0px\" cellpadding=\"30px\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>ROLL NO</th>\n");
      out.write("                    <th>NAME</th>\n");
      out.write("                    <th>CGPA</th>\n");
      out.write("                    <th>DELETE</th>\n");
      out.write("                    <th>UPDATE</th>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");

                    
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
                        
                
      out.write("        \n");
      out.write("                        \n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(rs.getInt("s_id"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("s_name"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getDouble("s_cgpa"));
      out.write("</td>\n");
      out.write("                            <td><a href=\"delete?sid=");
      out.print(rs.getInt("s_id"));
      out.write("\"><button>DELETE</button></a></td>\n");
      out.write("                            <td><a href=\"update.jsp?sid=");
      out.print(rs.getInt("s_id"));
      out.write("\"><button>UPDATE</button></a></td>\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                ");
        
                    }

                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <center><a href=\"insert.jsp\" style=\"color:blue\"><u>INSERT STUDENT RESULT</u></a></center>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
