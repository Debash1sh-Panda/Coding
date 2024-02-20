package ARRAY_PROGRAMME;

import java.util.Arrays;

public class Move_Zeros_to_End {

    public static void moveZeros(int[] arr){

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        while (count < arr.length) {
            arr[count++]= 0;
        }

        System.out.print(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1,0,3,4,6,0};
        System.out.println(Arrays.toString(arr));
        moveZeros(arr);
    }
}