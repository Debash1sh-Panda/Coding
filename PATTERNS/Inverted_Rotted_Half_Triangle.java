package PATTERNS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Ex:- 5
    *
   **
  ***
 ****
*****
*/

public class Inverted_Rotted_Half_Triangle {

    public static void invertedRottedHalfTriangle(int row){

        //Print Lines
        for (int i = 1; i <= row; i++) {
            //Print Spaces
            for (int j = 1; j <= row-i; j++) {
             System.out.print(" ");
            }
            //Print Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int row = Integer.parseInt(br.readLine());

        invertedRottedHalfTriangle(row);
    }
}
