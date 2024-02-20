package BASIC_PROGRAMME;

import java.util.Random;
import java.util.Scanner;

public class Generate_Random_Number{
    public static void main(String[] args) {
        while(true){
        
        //Approach-1
        usingMathClassMethod();
        //Approach-2
        usingRandomClass();
        break;
    }
}
    private static void usingMathClassMethod(){
    System.out.println("Random doubles: " + Math.random());
    }

    private static void usingRandomClass(){

        Random rd = new Random();

        int rd_int = rd.nextInt(100);
        System.out.println(rd_int);

        double rd_double = rd.nextDouble(); // range 0.0 and less than 1.0
        System.out.println(rd_double);
    }
}