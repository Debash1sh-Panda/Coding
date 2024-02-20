package PATTERNS;

import java.util.Scanner;

/*Ex:- 5
0
10
010
1010
01010
*/

public class O_l_Triangle_2 {
    
    public static void OlTriangle2(int row){

        for(int i = 1; i <= row; i++){
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int row =sc.nextInt();

        OlTriangle2(row);
    }
}
