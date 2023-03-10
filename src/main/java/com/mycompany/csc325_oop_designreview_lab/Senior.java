/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author sungwoopark
 */
public class Senior extends Student {

    public Senior(String name, int age, int credits) {
        super(name, age, credits);
        if (credits < 85) {
            throw new IllegalArgumentException("A Senior must have at least 85 credits");
        }
    }

    @Override
    public String toString() {
        return "Senior {" +
                "name = " + getName() +
                ", age = " + getAge() +
                ", address = " + getAddress() +
                ", credits = " + getCredits() +
                ", gpa = " + getGpa() +
                '}';
    }
}