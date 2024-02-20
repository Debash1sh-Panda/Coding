package IMIT_CODING_CLUB;

import java.util.Scanner;

public class Find_Strong_Numbers_Within_A_Range {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting range of number: ");
        int startingvalue = sc.nextInt();
        System.out.print("Enter starting range of number: ");
        int endingvalue = sc.nextInt();

        
        for (int i = startingvalue; i <= endingvalue; i++) {

            int testvalue = i;
            int sum = 0;
            int originalValue = i;

            while (testvalue > 0) {
                int rem = testvalue % 10;
                sum += factorial(rem);
                testvalue /= 10;
            }
                
            if (sum == originalValue) {
                System.out.println("The strong numbers are: "+ originalValue);
            }
        }
    }

    public static int factorial(int rem){
        if (rem == 0 || rem == 1) {
            return 1;
        }
        return rem*factorial(rem-1);       
    }

}