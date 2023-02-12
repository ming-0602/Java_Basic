package Lab2;

import java.util.Scanner;

import static java.lang.System.exit;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the students t-number: ");
        String tnum = input.nextLine();

        String[] splited = tnum.split("");

        if(tnum.length() != 9){
            System.out.print("Invalid Input!");
            exit(1);
        }

        if(splited[0] == "T" || splited[0] == "t"){
            System.out.print("Your T-Number is Valid! ");
        }
        else {
            System.out.print("Invalid Input!");
            exit(1);
        }






    }
}
