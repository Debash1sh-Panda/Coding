package PATTERNS;

import java.util.Scanner;

/*Ex:- 5
    *****
   *****
  *****
 *****
*****
 */

public class Solid_Rhombus {
    
    public static void solidRhombus(int row){

        //Print Lines
        for (int i = 1; i <= row; i++) {
          //Print Spaces
          for (int j = 1; j <= row-i; j++) {
            System.out.print(" ");
          }
          //Print Stars  
          for (int j = 1; j <= row; j++) {
            System.out.print("*");
          }
          System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        solidRhombus(row);
    }
}
