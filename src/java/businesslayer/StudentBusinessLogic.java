
package businesslayer;

import dataaccesslayer.StudentDaoImpl;
import datatransferobjects.CredentialsDTO;
import datatransferobjects.StudentDTO;
import java.util.ArrayList;

/**
 * A business logic layer for the student table that handles exceptions when accessing database tutoring 
 * @author dongyuezhang
 * @version 1.0
 * @since 18.0.2.1
 */
public class StudentBusinessLogic {
    private final int FIRST_NAME_MAX_LENGTH = 45;
    private final int LAST_NAME_MAX_LENGTH = 45;
    private final int EMAIL_MAX_LENGTH = 45;
    private final int PHONE_NUMBER_MAX_LENGTH = 45;
    private StudentDaoImpl studentDao = null;
    
    /**
     * Constructor that instantiate a StudentDaoImpl for accessing the database with credentials to the database
     * @param cre credentials to the database
     */
    public StudentBusinessLogic(CredentialsDTO cre) {
        studentDao = new StudentDaoImpl(cre);
    }
    
    /**
     * Adds a new student to table student
     * @param student a new record in the form of StudentDTO 
     */
    public void addStudent(StudentDTO student) {
        cleanStudent(student);
        validateStudent(student);
        int rowsAffected = studentDao.addStudent(student);
        if (rowsAffected == 1) {
            System.out.println("Inserting successful");
        }
    }
    
    /**
     * Retrieve all student records from the database
     * @return An array list that contain all student records
     */
    public ArrayList<StudentDTO> getAllStudents() {
        return studentDao.getAllStudents();
    }
    
    /**
     * Deletes a student record in the table student
     * @param student a record that needs to be deleted
     */
    public void deleteStudent(StudentDTO student) {
        try {
            validateInteger(student.getStudentID(), "StudentID", Integer.MAX_VALUE, false, false);
            int rowsAffected = studentDao.deleteStudent(student);
            if (rowsAffected == 1) {
            System.out.println("Deleting successful");
            }
        } catch (ValidationException e) {
            System.out.println(e.toString());
        }
    }
    
    /**
     * Updates a student record
     * @param student a StudentDTO containing all the new information
     */
    public void updateStudent(StudentDTO student) {
        cleanStudent(student);
        validateStudent(student);
        int rowsAffected = studentDao.updateStudent(student);
        if (rowsAffected == 1) {
            System.out.println("Updating successful");
        }
    }
    
    /**
     * Retrieves a specific student record by its StudentID
     * @param student a StudentDTO that contains the StudnetID
     * @return the record found from the table
     */
    public StudentDTO getStudentByStudentID(StudentDTO student) {
        StudentDTO studentGot = new StudentDTO();
        try {
            validateInteger(student.getStudentID().intValue(), "StudentID", Integer.MAX_VALUE, false, false);
            studentGot = studentDao.getStudentByStudentID(student.getStudentID());
            
        } catch (ValidationException e) {
            System.out.println(e.toString());
        }
        
        return studentGot;
    }
    
    /**
     * A helper method that cleans up white spaces around perpoties of a StudentDTO
     * @param student a StudentDTO needs to be cleaned
     * @return a cleaned StudentDTO
     */
    private StudentDTO cleanStudent(StudentDTO student) {
        student.setFirstName(student.getFirstName().trim());
        student.setLastName(student.getLastName().trim());
        student.setEmail(student.getEmail().trim());
        student.setPhoneNumber(student.getPhoneNumber().trim());
        return student;
    }
    
    /**
     * Validates all perpoties of a StudentDTO based on constrains of the table
     * @param student a StudnetDTO needs to be validated
     */
    private void validateStudent(StudentDTO student) {
        try {
            validateInteger(student.getStudentID(), "StudentID", Integer.MAX_VALUE, false, false);
            validateString(student.getFirstName(), "FirstName", FIRST_NAME_MAX_LENGTH, false);
            validateString(student.getLastName(), "LastName", LAST_NAME_MAX_LENGTH, false);
            validateString(student.getEmail(), "Email", EMAIL_MAX_LENGTH, true);
            validateString(student.getPhoneNumber(), "PhoneNumber", PHONE_NUMBER_MAX_LENGTH, true);
        } catch (ValidationException e) {
            System.out.println(e.toString());
        }

    }
    
    /**
     * Validates Integer type data
     * @param value object needs to be validated
     * @param fieldName column name of the data in the table
     * @param maxValue maximum value the Integer can reach according the constrains of the table
     * @param isNullAllowed true if the field can be null in the table
     * @param isZeroAllowed true if the field can be zero in the table
     * @throws ValidationException run-time exception if the Integer violate constrains above
     */
    private void validateInteger(Integer value, String fieldName, int maxValue, boolean isNullAllowed, boolean isZeroAllowed) throws ValidationException {
        if (value == null && isNullAllowed){
        // return; // null permitted, nothing to validate
        }
        else if(value == null && !isNullAllowed){
            throw new ValidationException(String.format("%s cannot be null", fieldName));
        }
        else if(value == 0 && !isZeroAllowed){
            throw new ValidationException(String.format("%s cannot be zero", fieldName));
        }
        else if(value > maxValue){
            throw new ValidationException(String.format("%s cannot exceed %d", fieldName, maxValue));
        }
    }
    
    /**
     * Validate String type data
     * @param value String needs to be  validated
     * @param fieldName column name of the data in the table
     * @param maxLength maximum length the String can reach according the constrains of the table
     * @param isNullAllowed true if the field can be null in the table
     * @throws ValidationException ValidationException run-time exception if the Integer violate constrains above
     */
    private void validateString(String value, String fieldName, int maxLength, boolean isNullAllowed) throws ValidationException {
        
        if(value == null && isNullAllowed){
        // return; // null permitted, nothing to validate
        }
        else if(value == null && ! isNullAllowed){
            throw new ValidationException(String.format("%s cannot be null", fieldName));
        }
        else if(value.length() == 0){
            throw new ValidationException(String.format("%s cannot be empty or only whitespace", fieldName));
        }
        else if(value.length() > maxLength){
            throw new ValidationException(String.format("%s cannot exceed %d characters", fieldName, maxLength));
        }
    }
    
}
