package BASIC_PROGRAMME;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

// prime means => it will divisible by 1 or itself

public class Print_1_to_N_Prime_Number {
    public static void main(String[] args) throws IOException{
        while(true){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number to check prime");
        int N= Integer.parseInt(br.readLine());
        if(N<0){
            System.out.println(" sorry your number is < 0");
        }
        for (int i=1;i<=N;i++){
            int count=0;
        for (int j=1;j<=i;j++){
            if (i%j==0){
                count++;
            }
            }
            if(count==2){
                System.out.println("prime: "+i);
            }
    }
}
} 
}
