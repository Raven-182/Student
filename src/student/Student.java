/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;

/**
 *
 * @author raven
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
    Student1[] studentList = new Student1[4];
    
    studentList[0] = new Student1("s1", "Raven");
    studentList[1] = new Student1("s2", "Anna");
    studentList[2] = new Student1("s3", "Peter");
    
    for(int i =0; i<3; i++)
    {
        System.out.println(studentList[i]);
       
    }
    
}
}