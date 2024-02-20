package IMIT_CODING_CLUB;

import java.util.Scanner;

public class Find_Trailing_Zero_In_Factorial {
    
    public static void main(String[] args) {
        
        while (true){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the Factorial and Number of Zeros : ");
        int num = sc.nextInt();

        int fact=1;
        for (int i = 1; i <= num; i++) {
            fact*=i;
        }
        System.out.println(fact+" is the factorial number of "+ num);
        
        int sum =0, count = 0;
        while (fact > 0) {
            sum+= fact%10;
            if (fact%10 == 0) {
                count++;
            }
            fact/=10;
        }
        System.out.println(count+" Trailing Zero");
        }
    }
}
