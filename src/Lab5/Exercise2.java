package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a piece of text: ");
        String text = input.nextLine();
        System.out.print("The rever of that piece of text: "+ reverse(text));

    }

    public static String reverse(String a){

        String[] splited = a.split("");
        int len = a.length();
        int index = len-1;
        ArrayList revered_array = new ArrayList<>();
        for(int i = 0; i < len; i++){
            revered_array.add(splited[index]);
            index--;
        }
        String result = String.join("", revered_array);
        return result;

    }






}
