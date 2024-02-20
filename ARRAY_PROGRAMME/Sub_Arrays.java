package ARRAY_PROGRAMME;

import java.util.Scanner;

public class Sub_Arrays{

    public void subArrays(int[] arr){

        int totalSubArrays = 0;
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                }
                totalSubArrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of subArray is : "+totalSubArrays);
        //math ways to calculate totalnumber of sub Array n*(n+1)/2
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();

        System.out.println("Enter elements in array");
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Sub_Arrays sub = new Sub_Arrays();
        sub.subArrays(arr);

    }
}