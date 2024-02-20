package ARRAY_PROGRAMME;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_An_Array {
    
    private static void reverseAnArray(int[] arr){

        int first = 0;
        int last = arr.length-1;

        while (first < last) {
            
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first ++;
            last --;
        }

        System.out.println("Your reverse Array elements are "+ Arrays.toString(arr));
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
    }

    //Time Complexite O(n) Space Complexite O(1)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your Array elements are "+ Arrays.toString(arr));

        reverseAnArray(arr);
    }
}
