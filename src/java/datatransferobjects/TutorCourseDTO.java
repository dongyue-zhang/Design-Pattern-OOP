
package datatransferobjects;

/**
 * A data transfer object of the Tutor Course table
 * @author dongyuezhang
 * @version 1.0
 * @since 18.0.2.1
 */
public class TutorCourseDTO {
    private int tutor_TutorID;
    private String course_CourseCode;
    
    /**
     * Non-argument constructor
     */
    public TutorCourseDTO() {}

    /**
     * Gets TutorID that tutors the course
     * @return TutorID that tutors the course
     */
    public int getTutor_TutorID() {
        return tutor_TutorID;
    }

    /**
     * Gets course code of the course the tutor tutors
     * @return course code of the course the tutor tutors
     */
    public String getCourse_CourseCode() {
        return course_CourseCode;
    }

    /**
     * Sets TutorID that tutors the course
     * @param tutor_TutorID TutorID that tutors the course
     */
    public void setTutor_TutorID(int tutor_TutorID) {
        this.tutor_TutorID = tutor_TutorID;
    }

    /**
     * Sets course code of the course the tutor tutors
     * @param course_CourseCode course code of the course the tutor tutors
     */
    public void setCourse_CourseCode(String course_CourseCode) {
        this.course_CourseCode = course_CourseCode;
    }
}
