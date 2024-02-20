package PATTERNS;

import java.util.Scanner;

/*Ex:- 5
*********
 *******
  *****
   ***
    *
 */

public class Reverse_Triangle {
    
    public static void ReverseTrianglePattern(int row){

        //Print Lines
        for (int i = row; i >= 1; i--) {
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

        ReverseTrianglePattern(row);
    }
}
