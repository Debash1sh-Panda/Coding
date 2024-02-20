package ARRAY_PROGRAMME;

import java.util.Scanner;

public class Find_Largest_Element {

    public int findLargest(int[] arr){

        int largest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size of an array");
        int size = sc.nextInt();
        
        int[] arr = new int[size];

        System.out.println("Enetr Elements in array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        Find_Largest_Element FLE = new Find_Largest_Element();
        System.out.println("The Largest Element is : "+FLE.findLargest(arr));
    }
}
