package STRING_PROGRAMME;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse_A_String_In_Three_Different_Ways{

    private static void firstLogicUsingForLoopToReverse(String str, String rev){
        
        for(int i = str.length()-1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Your reverse String is : "+ rev);
    }

    private static void secondLogicusing_toCharArrayMethod(String str, String rev){

        char[] ch = str.toCharArray();

        for(int i = str.length()-1; i>=0; i--){
            rev += ch[i];
        }
        System.out.println("Your reverse String is : "+ rev);
    }

    private static void thirdLogicUsingReverseMethod(String str, String rev){

        StringBuffer br = new StringBuffer(str);
        System.out.println("Your reverse String is : "+ br.reverse());
    } 
    //Main Method
    public static void main(String[] args) throws IOException {

        while(true){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String to Reverse ...");
        String str = br.readLine();
        String rev = "";

        firstLogicUsingForLoopToReverse(str,rev);
        secondLogicusing_toCharArrayMethod(str,rev);
        thirdLogicUsingReverseMethod(str,rev);
    }
}}