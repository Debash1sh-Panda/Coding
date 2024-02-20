package    ARRAY_PROGRAMME;

import java.util.Arrays;
import java.util.Scanner;

public class Shorted_Array{
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size = sc.nextInt();

    int[] arr = new int[size];
    System.out.print("Enter Numbers you wants to store in array : ");
    for(int k = 0; k < size; k++){
        arr[k] = sc.nextInt();
    }

    System.out.print("After  :");
    // for(int k=0; k<arr.length; k++){
    //     // System.out.print(arr[k]);
    // }
    System.out.print(Arrays.toString(arr));
    System.out.println();

    //Outer forLoop
    for(int i = 0; i < arr.length-1; i++){
        //Inner forLoop
        for(int j = 0;j < arr.length-1; j++){
            if(arr[j] > arr[j+1]){
            int swap = arr[j+1];
            arr[j+1] = arr[j];
            arr[j] = swap;
        }
        }
    }

    //this forLoop used for print the array values 
    System.out.print("Before :");
    // for (int i = 0; i < arr.length; i++){ 
    //     // System.out.print(arr[i]);
    // }
    System.out.println(Arrays.toString(arr));
}

}