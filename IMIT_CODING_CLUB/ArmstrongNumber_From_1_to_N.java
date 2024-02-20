package IMIT_CODING_CLUB;

import java.util.Scanner;

public class ArmstrongNumber_From_1_to_N {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Armstrong numbers from 1 to __ : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (isArmstrongNumber(i)) {
            System.out.println(i + " is an Armstrong Number");
            }
        }
    }
    public static boolean isArmstrongNumber(int num){

        int temp=num, count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        int sum = 0;
        int originalValue = temp;
            while (originalValue > 0) {
                int rem = originalValue%10;
                    sum += Math.pow(rem, count);
                    originalValue /= 10;
            }
            originalValue = temp;
        return originalValue == sum;
    }                   
}
