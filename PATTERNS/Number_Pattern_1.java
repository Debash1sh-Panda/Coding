package PATTERNS;

import java.util.Scanner;

/* Ex:-5
1
12
123
1234
12345
*/

public class Number_Pattern_1 {
    
    public static void numberPattern1(int row){

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(); 

        numberPattern1(row);
    }
}
