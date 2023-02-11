package Lab1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Please enter the tube radius of the torus: ");
        double tube = input.nextDouble();

        System.out.print("Please enter the cross-sectional radisu of the torus: ");
        double cross = input.nextDouble();

        System.out.print("Please enter the mass of the torus: ");
        double mass = input.nextDouble();
        double v = ((4 * tube * tube) + (5 * cross * cross)) * mass;
        double diameter = 1 / (8 * v);
        
        System.out.print("\n\n======Results======\n");
        System.out.print("Moment of inertia about a diameter is: " + diameter);
        
        
        
        
        
        
        
        
        
        
    }
    
    
}
