    //    ENROLL NO. : SR21BSIT156
    //    NAME       : RAJ JIGNESHBHAI
    //    CLASS      : SYIT (SEM 3)
    //    DIV        : B
    //    FACULTY    : DR. RUPAL MAM
    //    SUBJECT    : JSP ASS 9
    //    AIM        : STUDENT RESULT MANAGER SYSTEM
    //    DATE       : 19/11/2022

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class delete extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            try 
            {
                HttpSession session;
                Connection con=null;
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student result system","root","");
//                    if(con!=null)
//                    {
//                        out.println("Connected");
//                    }
                     int sid=Integer.parseInt(request.getParameter("sid"));
                     String query="DELETE FROM student_results WHERE s_id="+sid;
                     PreparedStatement ps=con.prepareStatement(query);
                     int i=ps.executeUpdate();
                     if(i>0)
                     {
                        session=request.getSession();
                        session.setAttribute("deleted", "DELETED SUCCESSFULLY");
                        response.sendRedirect("home.jsp");
                     }
                     else
                     {
                        session=request.getSession();
                        session.setAttribute("failed", "DELETED FAILED");
                        response.sendRedirect("home.jsp");
                     }
            
            
            
            }   
            catch (Exception e) 
            {
                out.println(e.getMessage());
               
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
