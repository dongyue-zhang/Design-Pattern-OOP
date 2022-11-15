
package datatransferobjects;

import java.sql.Timestamp;
import java.sql.Date;

/**
 * A data transfer object of the Session table
 * @author dongyuezhang
 * @version 1.0
 * @since 18.0.2.1
 */
public class SessionDTO {
    private Date dateKey;
    private Timestamp timeKey;
    private String studentLastName;
    private int sessionStatus;
    private String sessionTopic;
    private int tutor_TutorID;
    private String course_CourseCode;
    private int student_StudentID;

    /**
     * Gets DateKey of the session
     * @return DateKey of the session
     */
    public Date getDateKey() {
        return dateKey;
    }
    
    /**
     * Gets TimeKey of the session
     * @return TimeKey of the session
     */
    public Timestamp getTimeKey() {
        return timeKey;
    }

    /**
     * Gets student's last name
     * @return student's last name
     */
    public String getStudentLastName() {
        return studentLastName;
    }

    /**
     * Gets status of the session
     * @return status of the session
     */
    public int getSessionStatus() {
        return sessionStatus;
    }

    /**
     * Gets the topic of the session
     * @return topic of the session
     */
    public String getSessionTopic() {
        return sessionTopic;
    }

    /**
     * Gets tutor's TutorID of the session
     * @return tutor's TutorID of the session
     */
    public int getTutor_TutorID() {
        return tutor_TutorID;
    }

    /**
     * Gets course code of session
     * @return course code of session
     */
    public String getCourse_CourseCode() {
        return course_CourseCode;
    }

    /**
     * Gets StudentID of the tutee
     * @return StudentID of the tutee
     */
    public int getStudent_StudentID() {
        return student_StudentID;
    }

    /**
     * Sets DateKey of the session
     * @param dateKey DateKey of the session
     */
    public void setDateKey(Date dateKey) {
        this.dateKey = dateKey;
    }

    /**
     * Sets TimeKey of the session
     * @param timeKey TimeKey of the session
     */
    public void setTimeKey(Timestamp timeKey) {
        this.timeKey = timeKey;
    }

    /**
     * Sets last name of the tutee
     * @param studentLastName last name of the tutee
     */
    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    /**
     * Sets status of the session
     * @param sessionStatus status of the session
     */
    public void setSessionStatus(int sessionStatus) {
        this.sessionStatus = sessionStatus;
    }

    /**
     * Sets the topic of the session
     * @param sessionTopic the topic of the session
     */
    public void setSessionTopic(String sessionTopic) {
        this.sessionTopic = sessionTopic;
    }

    /**
     * Sets TutorID of the tutor of the session
     * @param tutor_TutorID TutorID of the tutor of the session
     */
    public void setTutor_TutorID(int tutor_TutorID) {
        this.tutor_TutorID = tutor_TutorID;
    }

    /**
     * Sets course code of the session
     * @param course_CourseCode course code of the session
     */
    public void setCourse_CourseCode(String course_CourseCode) {
        this.course_CourseCode = course_CourseCode;
    }

    /**
     * Sets StudentID of the tutee
     * @param student_StudentID StudentID of the tutee
     */
    public void setStudent_StudentID(int student_StudentID) {
        this.student_StudentID = student_StudentID;
    }
    
    
    
}
