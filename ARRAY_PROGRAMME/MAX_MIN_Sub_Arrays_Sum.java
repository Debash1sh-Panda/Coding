    
package ARRAY_PROGRAMME;

import java.util.Scanner;

public class MAX_MIN_Sub_Arrays_Sum{

    public void subArraysI(int[] arr){

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                    sum += arr[k];
                }
                System.out.print("----->Sum is : "+sum);
                if ( sum > max ) {
                    max = sum;
                }
                if( sum < min ) { 
                    min = sum;
                }
                System.out.println();
            }
            System.out.println();
        }
    System.out.println("Maximum sum is : "+max);
    System.out.print("Minimum sum is : "+min);  
  
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

        MAX_MIN_Sub_Arrays_Sum sub = new MAX_MIN_Sub_Arrays_Sum();
        sub.subArraysI(arr);

    }
}
