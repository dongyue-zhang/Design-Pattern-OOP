
package datatransferobjects;

/**
 * A data transfer object of the Experience table
 * @author dongyuezhang
 * @version 1.0
 * @since 18.0.2.1
 */
public class ExperienceDTO {
    private int experienceID;
    private String description;

    /**
     * Non-argument constructor
     */
    public ExperienceDTO(){}
    
    /**
     * Gets ExperienceTD of the experience
     * @return ExperienceTD of the experience
     */
    public int getExperienceID() {
        return experienceID;
    }

     /**
     * Gets description of the experience
     * @return description of the experience
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets ExperienceTD of the experience
     * @param experienceID ExperienceTD of the experience
     */
    public void setExperienceID(int experienceID) {
        this.experienceID = experienceID;
    }

    /**
     * Sets description of the experience
     * @param description description of the experience
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
}
