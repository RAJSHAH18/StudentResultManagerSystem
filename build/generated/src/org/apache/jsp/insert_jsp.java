package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("        <title>INSERT PAGE</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                    margin:0;\n");
      out.write("                    padding:0;\n");
      out.write("                    background-color: #D071f9;\n");
      out.write("                }\n");
      out.write("                .center\n");
      out.write("                {\n");
      out.write("                    position:absolute;\n");
      out.write("                    top:50%;\n");
      out.write("                    left:50%;\n");
      out.write("                    transform:translate(-50%,-50%);\n");
      out.write("                    width:480px;\n");
      out.write("                    background-color: white;\n");
      out.write("                    border-radius:5px;\n");
      out.write("\n");
      out.write("                }\n");
      out.write("                .center h1{\n");
      out.write("                    text-align:center;\n");
      out.write("                    padding:20px;\n");
      out.write("                    border-bottom:2px solid silver;\n");
      out.write("                }\n");
      out.write("                .form{\n");
      out.write("                    padding-bottom: 15px;\n");
      out.write("                    margin:20px;\n");
      out.write("                    text-align: center;\n");
      out.write("\n");
      out.write("                }\n");
      out.write("                .textfield\n");
      out.write("                {\n");
      out.write("                    width:100%;\n");
      out.write("                    height:50px;\n");
      out.write("                    font-size:18px;\n");
      out.write("                    border:2px solid #D071f9;\n");
      out.write("                    border-radius:5px;\n");
      out.write("                    box-sizing: border-box;\n");
      out.write("                    padding-left:10px;\n");
      out.write("                    margin:7px 0px;\n");
      out.write("                }\n");
      out.write("                .btn\n");
      out.write("                {\n");
      out.write("                    width:100%;\n");
      out.write("                    height:50px;\n");
      out.write("                    background-color: #D071f9;\n");
      out.write("                    border-radius: 5px;\n");
      out.write("                    font-size: 20px;\n");
      out.write("                    margin:7px 0px;\n");
      out.write("                    color:white;\n");
      out.write("                    border:0;\n");
      out.write("                    cursor:pointer;\n");
      out.write("                }\n");
      out.write("                .btn:hover{\n");
      out.write("                    background-color: #0a63d8;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                .link\n");
      out.write("                {\n");
      out.write("                    font-size: 16px;\n");
      out.write("                    padding:4px 0px;\n");
      out.write("                    margin:3px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                @media (max-width:  420px)\n");
      out.write("                {\n");
      out.write("                    .center{\n");
      out.write("                        width:88%;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <form action=\"insert\" method=\"post\" autocomplete=\"OFF\">\n");
      out.write("            <div class=\"center\">\n");
      out.write("                <h1>INSERT STUDENT RESULT</h1>\n");
      out.write("            <div class=\"form\">\n");
      out.write("\n");
      out.write("                <input type=\"text\" name=\"rollno\" class=\"textfield\" placeholder=\"ROLL NO\" required>          \n");
      out.write("                    <input type=\"text\" name=\"namme\" class=\"textfield\" placeholder=\"NAME\" required>\n");
      out.write("                    <input type=\"text\" name=\"cgpa\" class=\"textfield\" placeholder=\"CGPA\" required> \n");
      out.write("                    <select name=\"dept\" class=\"textfield\" required>\n");
      out.write("                        <option value=\"\" disabled selected hidden>SELECT DEPARTMENT</option>\n");
      out.write("                        ");

                            Connection con=null;
                            Class.forName("com.mysql.jdbc.Driver");
                            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student result system","root","");
//                            if(con!=null)
//                            {
//                                out.println("Connected");
//                            }
                            String query="SELECT * FROM dept";
                            Statement st=con.createStatement();
                            ResultSet rs=st.executeQuery(query);
                            while(rs.next())
                            {
                        
      out.write("        \n");
      out.write("                                \n");
      out.write("                                    <option value=\"");
      out.print(rs.getInt("d_id"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("d_name"));
      out.write("</option>\n");
      out.write("                        ");
        
                            }
                            
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                    </select>\n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"submit\" class=\"btn\" name=\"submit\" value=\"INSERT\"> \n");
      out.write("                    </div>    \n");
      out.write("                    <div>\n");
      out.write("                        <!--<a href=\"home.jsp\"><button class=\"btn\" style=\"background-color:black\">BACK</button></a>--> \n");
      out.write("                        <button><a href=\"welcome.jsp\" style=\"text-decoration: none;color:black\">BACK</a></button>\n");
      out.write("\n");
      out.write("                        <!--<button class=\"btn\" formaction=\"home.jsp\">BACK</button>-->\n");
      out.write("                    </div>    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
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
