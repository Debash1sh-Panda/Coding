package PATTERNS;

import java.util.Scanner;

/*Ex:- 3 5 (3, 3*2-1)
  *
 ***
*****
*   *
*   *
*   *
*   *
*****
 */

public class Temple_Pattern {

    public static void templePattern(int headrow, int bodyrow){

        //Temple Head
        //Print Lines
        for (int i = 1; i <= headrow; i++) {
            //Print Spaces
            for (int j = 1; j <= headrow-i; j++) {
                System.out.print(" ");
            }
            //Print Stars
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Temple Body
        //Print Lines
        for (int i = 1; i <= bodyrow; i++) {
            //Print Spaces
            // for (int j = 1; j <= bodyrow; j++) {
            //     System.out.print(" ");
            // }
            //Print Stars
            for (int j = 1; j <= bodyrow; j++) {
                if (i==bodyrow || j==1 || j==bodyrow) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int headrow = sc.nextInt();
        int bodyrow = sc.nextInt();



        templePattern(headrow, bodyrow);

    }
}