
package viewlayer;

import businesslayer.CourseBusinessLogic;
import datatransferobjects.CourseDTO;
import datatransferobjects.CredentialsDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * A servlet that listens to requests for url pattern /courses, 
 * and responses according to methods used by requests
 * @author dongyuezhang
 * @version 1.0
 * @since 18.0.2.1
 */
public class CourseServlet extends HttpServlet {
    
    /**
     * Non-argument constructor
     */
    public CourseServlet() {}

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods. Renders a table which contains all courses from the tutoring database 
     * by using credentials input from the client side to access the database
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
        
        CourseBusinessLogic courseBL = new CourseBusinessLogic(cre);
        ArrayList<CourseDTO> courses = courseBL.getAllCourses();
        try ( PrintWriter out = response.getWriter()) {
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

    /**
     * Handles the HTTP <code>GET</code> method by calling processRequest()
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
     * Handles the HTTP <code>POST</code> method by calling processRequest()
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
    }

}
