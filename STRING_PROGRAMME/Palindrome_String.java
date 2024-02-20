package STRING_PROGRAMME;

import java.util.Scanner;

class Palindrome_String {

    public static void main(String[] args) {
        while (true){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to Check Palindrome or Not");
        String str = sc.nextLine();

        Palindrome_String.checkPalindrome(str);
        System.out.println(isPalindrome(str));

         }   
    }

    private static boolean isPalindrome(String str) {

        for (int i = 0; i < str.length()/2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }


    private static void checkPalindrome(String str) {
        if(str == str.toLowerCase() || str == str.toUpperCase()){

        String emptyStr = str;
        String rev = "";

        char[] ch = str.toCharArray();
        for(int i = str.length()-1; i >= 0; i--){
            rev = rev + ch[i];
        }
        if (rev.equals(emptyStr)){
            System.out.println("Your entered number " + rev + " is a pallindrome :");
            }else{
                System.out.println("Your entered number " + emptyStr + " is not a palindrome");
            }
    }}
     
}