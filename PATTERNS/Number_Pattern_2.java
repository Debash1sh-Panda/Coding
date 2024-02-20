package PATTERNS;

import java.util.Scanner;

/* Ex:-5
1
22
333
4444
55555
*/

public class Number_Pattern_2 {
    
    public static void numberPattern2(int row){

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(); 

        numberPattern2(row);
    }
}
