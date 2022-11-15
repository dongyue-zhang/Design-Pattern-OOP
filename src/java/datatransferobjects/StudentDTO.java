
package datatransferobjects;

/**
 * A data transfer object of the student table
 * @author dongyuezhang
 * @version 1.0
 * @since 18.0.2.1
 */
public class StudentDTO {
    private Integer studentID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    /**
     * Gets StudentID
     * @return StudentID
     */
    public Integer getStudentID() {
        return studentID;
    }

    /**
     * Gets first name of the student
     * @return first name of the student
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets last name of the student
     * @return last name of the student
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets Email address of the student
     * @return Email address of the student
     */
    public String getEmail() {
        return email;
    }

     /**
     * Gets phone number of the student
     * @return phone number  of the student
     */ 
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets StudentID of the student
     * @param studentID StudentID of the student
     */
    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    /**
     * Set first name of the student
     * @param firstName first name of the student
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Set last name of the student
     * @param lastName last name of the student
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets Email address of the student
     * @param email Email address of the student
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Sets phone number of the student
     * @param phoneNumber phone number of the student
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }   
    
}
