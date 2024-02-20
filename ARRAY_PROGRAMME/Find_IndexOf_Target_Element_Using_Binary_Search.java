package ARRAY_PROGRAMME;

import java.util.Arrays;
import java.util.Scanner;

public class Find_IndexOf_Target_Element_Using_Binary_Search {
    
    private static int findIndexOfTargetelementUsingBinarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            
            int mid = (start + end)/2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }else{
                start = mid -1 ;
            }
            start ++;
            end --;
        }
        return -1;
    }

    //Time Complexite of BinnarySearch is O(log n) *best case for searching as compaire to linnear search
    //Time Complexite of LinnearSearch is O(n)
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
        System.out.println("Enter a target element");
        int targetValue = sc.nextInt();

        //We can find by using inbuilt binary search method
        // System.out.println("Index of target element is : "+ Arrays.binarySearch(arr,targetValue));

        System.out.println("Index of target element is : "+findIndexOfTargetelementUsingBinarySearch(arr, targetValue));
    }
}
