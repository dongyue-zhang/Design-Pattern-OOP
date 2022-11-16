
package datatransferobjects;

/**
 * A data transfer object of credentials for database tutoring
 * @author dongyuezhang
 * @version 1.0
 * @since 18.0.2.1
 */
public class CredentialsDTO {
    private String username;
    private String password;
    
    /**
     * Non-argument constructor for the class
     */
    public CredentialsDTO() {}

    /**
     * Gets username to access the database
     * @return username to the database
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gets password to access the database
     * @return password to the database
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets username to access the database
     * @param username username to the database
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Sets password to access the database
     * @param password password to the database
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
