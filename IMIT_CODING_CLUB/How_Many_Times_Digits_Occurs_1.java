package IMIT_CODING_CLUB;

import java.util.Scanner;

public class How_Many_Times_Digits_Occurs_1 {
    
    public static void main(String[] args) {
        
        while(true){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number 1 to __ for find no.of 1's : ");
        int num = sc.nextInt();
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= num; i++) {

            int temp = i;
            while( temp > 0) {
            sum += temp % 10;

            if (temp % 10 == 1) {
                count++;
            }

            temp /= 10;
            }

        }
        System.out.println("Return " + count + ", because digit \"1\" occurred " + count + " times");
        }
    }
}
