package BASIC_PROGRAMME;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Check_Even_or_Not {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
        System.out.println();
        System.out.println("Enter a number to check it is an Even or Not !");
        int num = Integer.parseInt(br.readLine());

        if(num%2==0)
        System.out.println(num+": is an Even number");
        else
        System.out.println(num+": is not an Even number ");
    }
}}
