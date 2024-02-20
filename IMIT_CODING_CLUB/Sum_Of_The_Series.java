package IMIT_CODING_CLUB;

import java.util.Scanner;

public class Sum_Of_The_Series {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            StringBuilder value = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                value.append(9);
            }
            
            sum += Integer.parseInt(value.toString());
            System.out.print( value + " ");
        }
            System.out.println();
            System.out.println("The sum of the series = " + sum);
    } 
}

