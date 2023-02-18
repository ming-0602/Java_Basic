package Lab13;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        String playerName[] = {"M", "B" , "K", " L", "I", "O" };
        String player;
        boolean found;

        Arrays.sort(playerName);

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Name of Player: ");
        player = input.nextLine();

        found = find(player,playerName);
        if(found){
            System.out.println("Is in the list!");
        }else {
            System.out.println("Is not in the list");
        }

    }


    public static boolean find(String player, String playerName[]){
        int lowsub = 0; int highsub = playerName.length-1; int middlesub;
        while(lowsub < highsub){
            middlesub = (lowsub + highsub)/2; //bisically whole thing divide by 2
            if(playerName[middlesub].compareTo(player) < 0){
                lowsub = middlesub+1;
            } else if (playerName[middlesub].compareTo(player) > 0 ) {
                highsub = middlesub-1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
