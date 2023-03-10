/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author sungwoopark
 */
public class Freshman extends Student {

    public Freshman(String name, int age, int credits) {
        super(name, age, credits);
    }

    @Override
    public String toString() {
        return "Freshman {"
                + "name = " + getName()
                + ", age = " + getAge()
                + ", address = " + getAddress()
                + ", credits = " + getCredits()
                + ", gpa = " + getGpa()
                + '}';
    }
}