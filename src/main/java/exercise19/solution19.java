/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Paez
 *
 * Pseudocode:
 * The program will run a Blood Alcohol calculator, using the formula
 * bmi = (weight / (height × height)) * 703. It will also show 3
 * outputs depending on how healthy the user is.
 *
 */
package exercise19;
import java.text.DecimalFormat;
import java.util.*;


public class solution19 {
   public static void main(String[] args){
       Scanner in = new Scanner(System.in); //user input

       System.out.println("Enter weight in pounds: ");
       double weight = in.nextDouble(); //here's what input becomes

       System.out.println("Enter height in inches: ");
       int heightIn = in.nextInt(); //here's what input becomes

       System.out.println("Enter height in feet: ");
       int heightFt = in.nextInt(); //here's what input becomes
       in.close(); //no more questions!!

       int maxHeight = (heightFt * 12) + heightIn; //makes stuff work
       DecimalFormat dF = new DecimalFormat("0.0");
       double BMI = weight/Math.pow(maxHeight,2)*703; //simple formula,math.pow makes it easier

       //the outputs are being made, please wait
        if (BMI < 18.5 ) {
        System.out.println("You are underweight, please see a doctor.");
        }
       else if(BMI >= 18.5 && BMI <25 ){
           System.out.println("You are in the ideal BMI!");

       } else if (BMI >=30 ){
            System.out.println("You are overweight, please consult a doctor.");
       } else {
            System.out.print("Please enter a valid BMI!!!");
        }
       System.out.println("Your BMI is: " + dF.format(BMI)); //looks clean

   }
}