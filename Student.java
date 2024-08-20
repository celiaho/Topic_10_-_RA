/******************************************
 *  File : Topic 10 Reading Assignment - Student.java
 *  Author : Celia Ho   
 *  Last Modified : Sun May 05 2024
 *  Description : 
    Let's consider a scenario where we have a Box class that can hold two items of different types. We'll use generics to make the Box class flexible enough to hold any type of objects. 
    
    Implement class Box with with 4 constructors: (Default, one with the first item argument, another one for the second item argument, and one for both items as arguments.), Getters and Setters, and finally toString method.
    
    --> Create any two concrete classes (Example, Student, Circle, House, ....etc
    
    Create a Demo class to test your generic class Box.
 *******************************************/

 // Create one of two concrete classes
 public class Student {
    // *****Member Attributes*****
    private String fullName;
    private int studentID;
    private String major;


    // *****Constructors*****

    public Student() {
        this.fullName = null;
        this.studentID = 0;
        this.major = null;
    }

    public Student(String fullName, int studentID, String major) {
        this.fullName = fullName;
        this.studentID = studentID;
        this.major = major;
    }


    // *****Getters & Setters*****

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        if (studentID > 0) {
            this.studentID = studentID;
        } else {
            throw new IllegalArgumentException("Student ID cannot be negative\n");
        }
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }


    // ****toString Method*****
    @Override
    public String toString() {
        return "Student [fullName=" + fullName + ", studentID=" + studentID + ", major=" + major + "]";
    }

}
