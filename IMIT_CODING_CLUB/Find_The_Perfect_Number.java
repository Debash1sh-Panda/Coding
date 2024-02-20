package IMIT_CODING_CLUB;

import java.util.Scanner;

//ex:- num=6 -> 1+2+3(all are divisor with num)
public class Find_The_Perfect_Number {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a limit of the number to find all the perfect number : ");

        int limit = sc.nextInt();

        for (int i = 1; i <= limit; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i + " is a perfect number");
            }
        }
    }

    public static boolean isPerfectNumber(int num){

        int sum = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num%i == 0) {
                sum+=i;
            }
        }
        return num==sum;
    }
}
