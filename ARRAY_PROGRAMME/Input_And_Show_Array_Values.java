package ARRAY_PROGRAMME;


import java.util.Arrays;
import java.util.Scanner;

public class Input_And_Show_Array_Values {
   public static void main(String[] args) {
    
    while(true){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enetr size of an array");
      int size = sc.nextInt();
      
      int[] arr = new int[size];
      System.out.print("Enter numbers: ");

      for(int i=0 ; i < size; i++){
      arr[i] = sc.nextInt();
      }
      System.out.println(Arrays.toString(arr));


      System.out.println("Your Elements are: ");
      try{
      for (int j=0; j < arr.length;j++){
        // System.out.println(arr[j]);
      }
      System.out.println(Arrays.toString(arr));
    }catch(Exception e){//Excepton because of (your index count is wrong!
        System.out.println("Error! ArrayIndexOutOfBoundsException");
    }
   }
}}
