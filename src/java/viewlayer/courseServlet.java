/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package viewlayer;

import businesslayer.CourseBusinessLogic;
import datatransferobjects.CourseDTO;
import datatransferobjects.CredentialsDTO;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Properties;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dongyuezhang
 */
public class courseServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        CredentialsDTO cre = new CredentialsDTO();
        cre.setUsername(request.getParameter("username"));
        cre.setPassword(request.getParameter("password"));
        
//        OutputStream output = new FileOutputStream("src/main/java/dataaccesslayer/database.properties");
//        prop.store(output, null);
        CourseBusinessLogic courseBL = new CourseBusinessLogic(cre);
        ArrayList<CourseDTO> courses = courseBL.getAllCourses();
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Courses</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Courses in Tutoring Database</h1>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<th>");
            out.println("Course Code");
            out.println("</th>");
            out.println("<th>");
            out.println("Course Name");
            out.println("</th>");
            out.println("<th>");
            out.println("Course Description");
            out.println("</th>");
            out.println("</tr>");
            for (CourseDTO course : courses) {
                out.println("<tr>");
                out.println("<td>" + course.getCourseCode() + "</td>");
                out.println("<td>" + course.getCourseName() + "</td>");
                out.println("<td>" + course.getCourseDescription() + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
