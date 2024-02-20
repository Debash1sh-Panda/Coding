package PATTERNS;

import java.util.Scanner;

/*Ex:- 5
1
01
101
0101
10101
*/

public class O_l_Triangle_1{
    
    public static void OlTriangle(int row){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int row =sc.nextInt();

        OlTriangle(row);
    }
}
