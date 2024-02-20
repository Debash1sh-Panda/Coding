package ARRAY_PROGRAMME;

import java.util.Scanner;

// BETTER APPROACH BUT NOT OPTIMAL APPROACH

public class Find_Second_Largest_Element {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size of an array");
        int size = sc.nextInt();
        
        int[] arr = new int[size];

        System.out.println("Enetr Elements in array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The First Largest Element is : "+findFirstLargest(arr));

    }

    public static int findFirstLargest(int[] arr) {
        int Firstlargest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > Firstlargest){
                Firstlargest = arr[i];
            }
        } 
        System.out.println("The Second Largest Element is: "+findSecondLargēst(arr,Firstlargest));
        return Firstlargest;
    }
    public static int findSecondLargēst(int[] arr, int Firstlargest){
        int SecondLargestElement = -1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] > SecondLargestElement && arr[i] != Firstlargest){
                SecondLargestElement = arr[i];
            }
        }

        return SecondLargestElement;
    }
}