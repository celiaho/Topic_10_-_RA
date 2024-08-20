/******************************************
 *  File : Topic 10 Reading Assignment - Box.java
 *  Author : Celia Ho   
 *  Last Modified : Sun May 05 2024
 *  Description : 
    --> Let's consider a scenario where we have a Box class that can hold two items of different types. We'll use generics to make the Box class flexible enough to hold any type of objects. 

    --> Implement class Box with with 4 constructors: (Default, one with the first item argument, another one for the second item argument, and one for both items as arguments.), Getters and Setters, and finally toString method.
    
    Create any two concrete classes (Example, Student, Circle, House, ....etc
    
    Create a Demo class to test your generic class Box.
 *******************************************/

 // Create Box class that holds 2 items of different types
 public class Box<T, U> {
    // *****Member attributes*****
    private T item1;
    private U item2;


    // *****Constructors*****
    
    public Box() {
        this.item1 = null;
        this.item2 = null;
    }

    // Use static function to counter generic erasure error: "[access modifier] static [generic type declaration] [return_type] methodName(parameters) {}"
    public static <T, U> Box<T, U> BoxWithItem1(T item1) {
        Box<T, U> box = new Box<>();    // Create an empty box
        box.setItem1(item1);    // Use setter to set the item using the argument passed to the function 
        return box;
    }

    public static <T, U> Box<T, U> BoxWithItem2(U item2) {
        Box<T, U> box = new Box<>();
        box.setItem2(item2);
        return box;
    } 

    /* A second workaround for generic erasure issue
    // Constructor with varargs to work around generic erasure
    @SuppressWarnings("unchecked")
    public Box(Object... items) {
        if (items.length > 0) {
            this.item1 = (T) items[0];
        }
        if (items.length > 1) {
            this.item2 = (U) items[1];
        }  
    }

    public Box(T item1, U item2) {
        this.item1 = item1;
        this.item2 = item2;
    } 
    */


    // *****Getters & Setters*****

    public T getItem1() {
        return item1;
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }
    
    public U getItem2() {
        return item2;
    }

    public void setItem2(U item2) {
        this.item2 = item2;
    }


    // *****toString Method*****/
    @Override
    public String toString() {
        return "Box [\n   item1=" + item1 + ", \n   item2=" + item2 + "\n]";
    }
// Box class ends
}
