package IMIT_CODING_CLUB;

import java.util.Scanner;

public class Number_To_EnglishWord_O_9 {
    
    public static void main(String[] args) {
        
        while (true) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (0-9) to convert it into Alphabets : ");
        int num = sc.nextInt();

        String arr[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        if (num > 9) {
            System.out.println("Invalid Number");
        }
        for (int i = 0; i < arr.length; i++) {
            if (num == i) {
                System.out.println(i+ "'s Alphabetic is " +arr[i]);
            }
        }
    }
    }
}
