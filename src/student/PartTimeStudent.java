/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;
//zomething
/**
 *
 * @author raven
 */
public class PartTimeStudent extends Student1 {
    private int numCourses ;

    public PartTimeStudent(int numCourses, String studentID, String studentName) {
        super(studentID, studentName);
        this.numCourses = numCourses;
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
    
}
