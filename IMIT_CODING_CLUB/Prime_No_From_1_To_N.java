package IMIT_CODING_CLUB;

import java.util.Scanner;

public class Prime_No_From_1_To_N {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range : ");
        int range = sc.nextInt();

        for (int i = 1; i <= range; i++) {
            
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i+ " ");
            }
        }
    }
}
