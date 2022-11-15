
package datatransferobjects;

/**
 * A data transfer object of the Course table
 * @author dongyuezhang
 * @version 1.0
 * @since 18.0.2.1
 */
public class CourseDTO {
    private String courseCode;
    private String courseName;
    private String courseDescription;

    /**
     * Gets course code of the course
     * @return course code of the course
     */
    public String getCourseCode() {
        return courseCode;
    }
    /**
     * Gets course name of the course
     * @return course name of the course
     */
    public String getCourseName() {
        return courseName;
    }

     /**
     * Gets course description of the course
     * @return course description of the course
     */
    public String getCourseDescription() {
        return courseDescription;
    }
    
    /**
     * Sets course code of the course
     * @param courseCode course code of the course
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    /**
     * Sets course name of the course
     * @param courseName course name of the course
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Sets course description of the course
     * @param courseDescripetion course description of the course
     */
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
    
}
