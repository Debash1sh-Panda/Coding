package IMIT_CODING_CLUB;

import java.util.Scanner;

public class Pyramid_Pattern_Value_Increased_By_1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int range = sc.nextInt();

        int count = 1;
        for (int i = 0; i < range ; i++) {
            System.out.println();
            for (int j = 0; j <= range-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(count++ +" ");
            }
        }
    }
}
