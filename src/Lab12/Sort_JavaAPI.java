package Lab12;

import java.util.ArrayList;
import java.util.Arrays;
public class Sort_JavaAPI {
    public static void main(String[] args) {
        int value[] = {5,7,2,1,9,2};

        for(int i =0; i < value.length-1;i++){
            System.out.println("Unsorted value : " + value[i] + " ");
        }

        Arrays.sort(value);
        for(int i =0; i < value.length-1;i++){//it will remove duplicate value
            System.out.println("Sorted value : " + value[i] + " ");
        }

    }


}
