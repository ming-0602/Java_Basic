package Lab1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        System.out.print("Please enter the type of the first investment: ");
        String first_invesment = input.nextLine();

        System.out.print("Please enter the number of shares purchased: ");
        int shares_purchased = input.nextInt();

        System.out.print("Please enter the share price: ");
        float shares_price = input.nextFloat();

        System.out.print("\n\nPlease enter the type of the second investment: ");
        String second_invesment = input.next();

        System.out.print("Please enter the number of shares purchased: ");
        int shares_purchased2 = input.nextInt();

        System.out.print("Please enter the share price: ");
        float shares_price2 = input.nextFloat();

        System.out.print("\n\n\n==================================\nInvestment Details\n==================================\n");
        System.out.println(String.format("%-10s%-10d%-5f",first_invesment,shares_purchased,shares_price));
        System.out.print(String.format("%-10s%-10d%-5f",second_invesment,shares_purchased2,shares_price2));


    }
}
