package ARRAY_PROGRAMME;

import java.util.Arrays;
import java.util.Scanner;

// it will be updated
public class Remove_A_Specific_Element {
    public static int[] removeNumber(int[] arr,int value) {

        int len=arr.length;
        int[] newarr={};
        for(int i = 0 ; i < len; i++){
            if(arr[i]==value){
                newarr[i]=arr[i+1];
            }
        for(int j=0;j<newarr.length;j++){
          return newarr;
        }}
    return new int []{};
}
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr size of an array");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter Numbers you wants to store in array");
        for(int i= 0; i<size;i++){
            arr[i]=sc.nextInt(); }

        System.out.println("Your Arrays elements are: "+Arrays.toString(arr));
        System.out.println("Enter a number from array you want to remove");
        int num =sc.nextInt();
        // System.out.println("delete"+removeNumber(arr,num));
        int[] storage=removeNumber(arr,num);
        for(int i = 0 ; i < storage.length;i++){
            System.out.println(storage[i]);
        }
    }
}
