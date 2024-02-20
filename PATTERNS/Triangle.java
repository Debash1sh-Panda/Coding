package PATTERNS;

import java.util.Scanner;

/*Ex:- 5
    *
   ***
  *****
 *******
*********
 */

public class Triangle {
    
    public static void findTrianglePattern(int row){

        //Print Lines
        for (int i = 1; i <= row; i++) {
            //Print Spaces
            for (int j = 1; j <=row-i; j++) {
                System.out.print(" ");
            }
            //Print Stars
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        findTrianglePattern(row);
    }
}
