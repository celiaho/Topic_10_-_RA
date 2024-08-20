/******************************************
 *  File : Topic 10 Reading Assignment - House.java
 *  Author : Celia Ho   
 *  Last Modified : Sun May 05 2024
 *  Description : 
    Let's consider a scenario where we have a Box class that can hold two items of different types. We'll use generics to make the Box class flexible enough to hold any type of objects. 
    
    Implement class Box with with 4 constructors: (Default, one with the first item argument, another one for the second item argument, and one for both items as arguments.), Getters and Setters, and finally toString method.
    
    --> Create any two concrete classes (Example, Student, Circle, House, ....etc
    
    Create a Demo class to test your generic class Box.
 *******************************************/

 // Create one of two concrete classes
 public class House {
    // *****Member Attributes*****
    private String address;
    private int bedrooms;
    private int bathrooms;
    private int sqFt;
    private double askingPrice;
    private double rebateAmount;
    private double rebatePrice;


    // *****Constructors*****

    public House() {
        this.address = null;
        this.bedrooms = 0;
        this.bathrooms = 0;
        this.sqFt = 0;
        this.askingPrice = 0;
        this.rebateAmount = 0;
        this.rebatePrice = 0;
    }

    public House(String address, int bedrooms, int bathrooms, int sqFt, double askingPrice, double rebateAmount) {
        this.address = address;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.sqFt = sqFt;
        this.askingPrice = askingPrice;
        this.rebateAmount = rebateAmount;
        this.rebatePrice = askingPrice - rebateAmount;
    }

    // *****Getters & Setters*****

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public int getSqFt() {
        return sqFt;
    }

    public void setSqFt(int sqFt) {
        if (sqFt > 0) {
            this.sqFt = sqFt;
        } else {
            throw new IllegalArgumentException("Square footage cannot be negative\n");
        }
    }

    public double getAskingPrice() {
        return askingPrice;
    }

    public void setAskingPrice(double askingPrice) {
        this.askingPrice = askingPrice;
    }

    public double getRebatePrice() {
        return rebatePrice;
    }

    public void setRebatePrice(double rebatePrice) {
        if (rebatePrice > 0) {
            this.rebatePrice = rebatePrice;
        } else {
            throw new IllegalArgumentException("Rebate price cannot be negative\n");
        }
    }


    // *****Other Method Definitions*****

    public double calculateRebatePrice(double askingPrice, double rebateAmount) {
        return askingPrice - rebateAmount;
    }


    // ****toString Method*****
    @Override
    public String toString() {
        return "House [address=" + address + ", bedrooms=" + bedrooms + ", bathrooms=" + bathrooms + ", sqFt=" + sqFt + ", askingPrice=" + askingPrice + ", rebateAmount=" + rebateAmount + ", rebatePrice=" + rebatePrice + "]";
    }
}