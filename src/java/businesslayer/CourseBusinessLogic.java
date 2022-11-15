/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslayer;

import dataaccesslayer.CourseDaoImpl;
import datatransferobjects.CourseDTO;
import datatransferobjects.CredentialsDTO;
import java.util.ArrayList;

/**
 *
 * @author dongyuezhang
 */
public class CourseBusinessLogic {
    
    private CourseDaoImpl courseDao = null;
    
    public CourseBusinessLogic(CredentialsDTO cre) {
        courseDao = new CourseDaoImpl(cre);
    }
    public ArrayList<CourseDTO> getAllCourses() {
        return courseDao.getAllCourse();
    }
}
