
package datatransferobjects;

/**
 * A data transfer object of the Student Course table
 * @author dongyuezhang
 * @version 1.0
 * @since 18.0.2.1
 */
public class StudentCourseDTO {
    private int student_StudentID;
    private String course_CourseCode;

    /**
     * Non-argument constructor
     */
    public StudentCourseDTO() {}
    /**
     * Gets StudentID of the student that attends the course
     * @return StudentID of the student that attends the course
     */
    public int getStudent_StudentID() {
        return student_StudentID;
    }

     /**
     * Gets course code of the student that attends the course
     * @return course code of the student that attends the course
     */
    public String getCourse_CourseCode() {
        return course_CourseCode;
    }

    /**
     * Sets StudentID of the student that attends the course
     * @param student_StudentID StudentID of the student that attends the course
     */
    public void setStudent_StudentID(int student_StudentID) {
        this.student_StudentID = student_StudentID;
    }

    /**
     * Sets course code of the student that attends the course
     * @param course_CourseCode course code of the student that attends the course
     */
    public void setCourse_CourseCode(String course_CourseCode) {
        this.course_CourseCode = course_CourseCode;
    }

}
