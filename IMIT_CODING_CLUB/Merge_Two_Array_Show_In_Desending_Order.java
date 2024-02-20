package IMIT_CODING_CLUB;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_Two_Array_Show_In_Desending_Order {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Two arrays: ");
        int size = sc.nextInt();

        System.out.print("Enter only Integer value in Array-1 : ");
        int arr1[] = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        
        System.out.print("Enter only Integer value in Array-2 : ");
        int arr2[] = new int[size];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int arr3[] = new int[size*2];
        int k = 0;

        for (int i = arr1.length-1; i >= 0; i--) {
            for (int j = arr2.length-1; j >= 0; j--) {
                
                if (arr1[i] == arr2[j]) {
                    arr3[k++] = arr1[i];
                    arr3[k++] = arr2[j];
                }
            }
        }
        
        System.out.println("After merging two arrays of the same size sorted in descending order : "+Arrays.toString(arr3));
    }
}
