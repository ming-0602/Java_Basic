package Lab1;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Please Enter Your Weight: ");
        double weight = scn.nextDouble();
        System.out.print("Please Enter Your Height in Meters: ");
        double height = scn.nextDouble();

        double bmi = weight / (height * height);

        if(18.5 > bmi){
            System.out.print("Your are Underwight " + bmi);
        } else if (bmi > 18.5 && bmi < 24.99) {
            System.out.print("Your weight is Normal");
        } else if (bmi > 25.0 && bmi < 29.99) {
            System.out.print("Your are OverWeight!");
        }else{
            System.out.print("Your are Obese");
        }


    }
}
