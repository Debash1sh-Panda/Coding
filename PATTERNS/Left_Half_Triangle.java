package PATTERNS;

import java.util.Scanner;

public class Left_Half_Triangle {
    
/* Ex:-5
*
**
***
****
*****
*/
    
    public static void findHalfTriangle(int row){

        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
                System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        findHalfTriangle(row);
    }
}
