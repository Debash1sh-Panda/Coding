package PATTERNS;

import java.util.Scanner;

/* Ex:- 5
12345
1234
123
12
1
 */

public class Reverse_Number_Pattern_1 {
    
    public static void findReversePattern1(int row){

        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(); 

        findReversePattern1(row);
    }
}
