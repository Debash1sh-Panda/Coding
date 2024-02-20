package IMIT_CODING_CLUB;

import java.util.Scanner;

public class Delete_Specific_Index_From_Array {

    public static void main(String[] args) {
        
        System.out.print("Enter size of an array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int darr[] = new int[size];

        System.out.println("Enter elements in an array: ");
        for (int i = 0; i < darr.length; i++) {
            darr[i] = sc.nextInt();
        }

        System.out.println("Enter a position to delete value: ");
        int dvalue = sc.nextInt();
        if (dvalue >= 0 && dvalue < darr.length) {
            int newarr[] = new int[darr.length - 1];
            int newIndex = 0;

            for (int i = 0; i < darr.length; i++) {
                if (i != dvalue) {
                    newarr[newIndex] = darr[i];
                    newIndex++;
                }
            }
        
        System.out.println("After delete a specific element: ");
        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }
    }
    }
}