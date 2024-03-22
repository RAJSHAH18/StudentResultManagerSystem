package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

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
                                
           
      out.write("                     \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("        <form action=\"insert\" method=\"POST\" autocomplete=\"OFF\">\n");
      out.write("            <div class=\"center\">\n");
      out.write("                <h1>INSERT STUDENT RESULT</h1>\n");
      out.write("            <div class=\"form\">\n");
      out.write("\n");
      out.write("                <input type=\"text\" name=\"rollno\" class=\"textfield\" value=\"");
      out.print(rs.getInt("s_id"));
      out.write("\" placeholder=\"ROLL NO\" required>          \n");
      out.write("                    <input type=\"text\" name=\"name\" class=\"textfield\" value=\"");
      out.print(rs.getString("s_name"));
      out.write("\" placeholder=\"NAME\" required>\n");
      out.write("                    <input type=\"text\" name=\"cgpa\" class=\"textfield\" value=\"");
      out.print(rs.getInt("s_cgpa"));
      out.write("\" placeholder=\"CGPA\" required> \n");
      out.write("                    <select name=\"dept\" class=\"textfield\" required>\n");
      out.write("                        <option value=\"\" disabled selected hidden>SELECT DEPARTMENT</option>\n");
      out.write("                        ");

                                String qry="SELECT * FROM dept";
                                Statement s=con.createStatement();
                                ResultSet r=st.executeQuery(qry);
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
                        
      out.write("        \n");
      out.write("                                    \n");
      out.write("                            \n");
      out.write("                                    <option ");
      out.print( select);
      out.write(" value=\"");
      out.print(r.getInt("d_id"));
      out.write("\" > ");
      out.print(r.getString("d_name"));
      out.write("</option>\n");
      out.write("                        ");
        
                                }
                            
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                    </select>\n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"submit\" class=\"btn\" name=\"submit\" value=\"INSERT\"> \n");
      out.write("                    </div>\n");
      out.write("                       \n");
      out.write("                    <div>\n");
      out.write("                        <!--<a href=\"home.jsp\"><button class=\"btn\" style=\"background-color:black\">BACK</button></a>--> \n");
      out.write("                        <button class=\"btn\" class=\"btn\" style=\"background-color:black\"><a href=\"home.jsp\"style=\"color:white; text-decoration:none\">BACK</a></button>\n");
      out.write("\n");
      out.write("                        <!--<button class=\"btn\" formaction=\"home.jsp\">BACK</button>-->\n");
      out.write("                    </div>    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("                    ");

                            
                        }  
                    
      out.write("         \n");
      out.write("\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("             \n");
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
