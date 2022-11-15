
package datatransferobjects;

/**
 * A data transfer object of the Tutor table
 * @author dongyuezhang
 * @version 1.0
 * @since 18.0.2.1
 */
public class TutorDTO {
    private int tutorID;
    private String lastName;
    private String firstname;
    private String email;
    private String status;
    private int experience_ExperinceID;

    /**
     * Gets TutorID of the tutor
     * @return TutorID of the tutor
     */
    public int getTutorID() {
        return tutorID;
    }

    /**
     * Gets last name of the tutor
     * @return last name of the tutor
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets first name of the tutor
     * @return first name of the tutor
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Gets Email address of the tutor
     * @return Email address of the tutor
     */
    public String getEmail() {
        return email;
    }

    /**
     * Gets the status of the tutor
     * @return the status of the tutor
     */
    public String getStatus() {
        return status;
    }

    /**
     * Gets ExperienceID of the tutor in Experience table
     * @return ExperienceID of the tutor in Experience table
     */
    public int getExperience_ExperinceID() {
        return experience_ExperinceID;
    }

    /**
     * Sets TutorID of the tutor
     * @param tutorID TutorID of the tutor
     */
    public void setTutorID(int tutorID) {
        this.tutorID = tutorID;
    }

    /**
     * Sets last name of the tutor
     * @param lastName last name of the tutor
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets first name of the tutor
     * @param firstname first name of the tutor
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Sets Email address of the tutor
     * @param email Email address of the tutor
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Sets the status of the tutor
     * @param status the status of the tutor
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Sets ExperienceID of the tutor in Experience table
     * @param experience_ExperinceID ExperienceID of the tutor in Experience table
     */
    public void setExperience_ExperinceID(int experience_ExperinceID) {
        this.experience_ExperinceID = experience_ExperinceID;
    }
    
    
}
