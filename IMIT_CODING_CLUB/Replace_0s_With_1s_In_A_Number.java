package IMIT_CODING_CLUB;

import java.util.Scanner;

public class Replace_0s_With_1s_In_A_Number {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to switch all the 0's with 1's : ");
        int num = sc.nextInt();

        int sum = 0;
        int oneValue = 1;

        while (num > 0) {
            int rem = num % 10;
            if (rem == 0) {
                sum += oneValue;
            }else{
                sum += rem * oneValue;
            }
            oneValue *= 10;
            num/=10;
        }
        System.out.println(sum);
    }
}
