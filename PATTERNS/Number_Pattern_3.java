package PATTERNS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Ex:- 5
1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/

public class Number_Pattern_3 {
    
    public static void patternNumber3(int row){

        int sum = 0;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                sum++;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int row = Integer.parseInt(br.readLine());

        patternNumber3(row);
    }
}
