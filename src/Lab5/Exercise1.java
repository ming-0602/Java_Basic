package Lab5;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String args[]){//void have no return
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a first number: ");
        double first_input = input.nextDouble();
        System.out.print("Please enter a second number: ");
        double second_input = input.nextDouble();

        System.out.print("The Smallest of 2 Number you entered is "+ minimum(first_input,second_input));
    }

    public static double minimum(double a , double b){//user define method //public & static method and return double value
        double min = Math.min(a,b);
        return min;
    }


}
