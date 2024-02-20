package PATTERNS;

import java.util.Scanner;

/* Ex:-5
*****
****
***
**
*
*/

public class Reverse_Left_Half_Triangle {
    
    public static void findReverseLeftHalfTriangle(int row){

        for (int i = row; i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        findReverseLeftHalfTriangle(row);
    }
}
