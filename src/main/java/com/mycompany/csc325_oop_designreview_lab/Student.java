/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author sungwoopark
 */
public class Student extends Human {
    // ToDo 1: Make this class a child of Person
    // ToDo 1: Make this class a child of Human

    private double gpa;
    private int credits;

    // ToDo 2: Fix the resulting errors
    public Student(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    // ToDo 3: Add a field for GPA and create setter and getter
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // getter and setter for credits
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{"
                + "name='" + getName() + '\''
                + ", age=" + getAge()
                + ", address='" + getAddress() + '\''
                + ", credits='" + getCredits() + '\''
                + ", gpa=" + gpa
                + '}';
    }
    // ToDo 4: Add comments to your code
}