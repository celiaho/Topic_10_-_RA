/******************************************
 *  File : Topic 10 Reading Assignment - Demo.java
 *  Author : Celia Ho   
 *  Last Modified : Sun May 05 2024
 *  Description : 
    Let's consider a scenario where we have a Box class that can hold two items of different types. We'll use generics to make the Box class flexible enough to hold any type of objects. 
    
    Implement class Box with with 4 constructors: (Default, one with the first item argument, another one for the second item argument, and one for both items as arguments.), Getters and Setters, and finally toString method.
    
    Create any two concrete classes (Example, Student, Circle, House, ....etc
    
    --> Create a Demo class to test your generic class Box.
 *******************************************/

 // Create a Demo class to test generic class Box
 public class Demo {
  public static void main(String[] args) {
    
    // Use no-arg constructor to create a Box, box1, to hold objects
    Box<Student, House> box1 = new Box<>();

    // Create House and Student instances
    Student student = new Student("Celia Ho", 9876543, "Object-Oriented Programming & Design");
    House house = new House("100 Shawmut Ave, PH B, Boston, MA 02118", 3, 3, 2153, 2799900, 75000);

    // Set instances in box1
    box1.setItem1(student);
    box1.setItem2(house);


    // Use two-parameter constructor to create a Box, box2
    Box<Student, House> box2 = new Box<>(new Student("William Randolph Hearst", 1234567, "Mathematics"), new House("750 Hearst Castle Rd, San Simeon, CA 93452", 38, 40, 68500, 89750000, 0));


  // Print contents of both boxes
  System.out.println("Box 1: " + box1 +"\n\nBox 2: " + box2);

  } // Main ends
} // Demo class ends