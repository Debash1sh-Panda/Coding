package ARRAY_PROGRAMME;

import java.util.Scanner;

public class Find_Smallest_Element{
    public static void main(String[] args) {
        
        int arr[] = {4,5,7,3,8};
        int min = arr[0];

        for (int i = 0; i<arr.length;i++){
            if(arr[i] < min){  //OR if(min > arr[i])
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}