/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author sungwoopark
 */
public class MainClass {

    public static void main(String[] args) {
        // ToDo 5: Fix the error
        // ToDo 6: Fix the constructor of Student class -
        // Todo 7: Create two classes for Freshman and Senior -
        // ToDo 8: The senior class should have a minimum of 85 credits - 
        // ToDo 7: Add a toString method for Student class - 
        // ToDo 9: Add a toString method for Freshman class - 
        // ToDo 10: Add a toString method for Senior class - 

        Student std1 = new Student("James", 20, 20);
        Freshman fr1 = new Freshman("Johnathon", 20, 12); // name, age, credits
        Senior sr1 = new Senior("John", 30, 90);

        Scanner scanner = new Scanner(System.in);
        // ToDo 8: Set the gpa of the student using the scanner and user
        // ToDo 11: Set the gpa of the student using the scanner and user
        //             input and then print the output.

        System.out.print("Enter the GPA of " + std1.getName() + ": ");
        double gpa = scanner.nextDouble();
        std1.setGpa(gpa);
        System.out.println(std1);

        System.out.print("Enter the GPA of " + fr1.getName() + ": ");
        gpa = scanner.nextDouble();
        fr1.setGpa(gpa);
        System.out.println(fr1);

        System.out.print("Enter the GPA of " + sr1.getName() + ": ");
        gpa = scanner.nextDouble();
        sr1.setGpa(gpa);
        System.out.println(sr1);

        // ToDo 9: add comments and explain your code
        // ToDo 12: add comments and explain your code
        // ToDo 10: submit using a pull request.
        // ToDo 13: submit using a pull request.
    }

}