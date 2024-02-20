package IMIT_CODING_CLUB;

import java.util.Scanner;

public class Separate_Even_And_Odd_From_Array {

    public static void main(String[] args) {

        System.out.print("Enter Size of an Array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];
        int evenarr[] = new int[size];
        int oddarr[] = new int[size];
        

        System.out.println("Enter values in Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
             if (arr[i] % 2 == 0) {
                evenarr[i] = arr[i];
                count++;
            }
            else{
                oddarr[i] = arr[i];
            }
        }

        System.out.println("Even");
        for (int i = 1; i <= count; i++) {
            System.out.println(evenarr[i]);
        }
        System.out.println("Odd");
        for (int i = 0; i < arr.length-count; i++) {
            System.out.println(oddarr[i]);
        }

    }
}