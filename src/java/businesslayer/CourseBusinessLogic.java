
package businesslayer;

import dataaccesslayer.CourseDaoImpl;
import datatransferobjects.CourseDTO;
import datatransferobjects.CredentialsDTO;
import java.util.ArrayList;

/**
 * A business logic layer for the course table that handles exceptions when accessing database tutoring
 * @author dongyuezhang
 * @version 1.0
 * @since 18.0.2.1
 */
public class CourseBusinessLogic {
    
    private CourseDaoImpl courseDao = null;
    
    /**
     * Constructor that instantiate a CourseDaoImpl for accessing the database with credentials to the database
     * @param cre a CredentialsDTO that holds username and password to the database
     */
    public CourseBusinessLogic(CredentialsDTO cre) {
        courseDao = new CourseDaoImpl(cre);
    }
    /**
     * Retrieves all courses from table course
     * @return  All courses in an ArrayList
     */
    public ArrayList<CourseDTO> getAllCourses() {
        return courseDao.getAllCourse();
    }
}
