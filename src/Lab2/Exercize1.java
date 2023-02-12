package Lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercize1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int index = 0;
        int value_entered = 0;
        int odd = 0;
        int larger_than_100 = 0;
        int tem = 100;
        ArrayList list = new ArrayList();

        while(index <= tem){

            System.out.print("Please Enter a first +ve whole number (-1 to exit): ");
            int value = input.nextInt();
            if(value == -1){
                tem = -1;
            }
            value_entered++;

            if(value % 2 != 0){
                odd++;
            }
            if(value > 100){
                larger_than_100++;
            }

            list.add(value);
        }

        int sum = 0;
        for (int index2 = 0; index2 < value_entered; index2++){
            sum +=(int) list.get(index2);

        }
        int avg = sum / value_entered;


        System.out.print("======Result======\n");
        System.out.print("Number of odd vales entered: " + odd + "\n");
        System.out.print("Number of values > 100 entered: " + larger_than_100 + "\n");
        System.out.print("Average of the values entered: " + avg + "\n");














    }


}
