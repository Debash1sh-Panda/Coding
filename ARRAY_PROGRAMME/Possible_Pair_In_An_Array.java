package ARRAY_PROGRAMME;

import java.util.Arrays;
import java.util.Scanner;

public class Possible_Pair_In_An_Array {
    
    public static void pairInAnArray(int[] arr){

        int totalPair = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+arr[i]+","+arr[j]+") ");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs are : "+totalPair);
        //math ways to calculate totalnumber of pair n*(n-1)/2
    }
    public static void main(String[] args) {
        

        //Time Complexite O(n power 2) coz of nested loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your Array elements are "+ Arrays.toString(arr));

        pairInAnArray(arr);
    }
}
