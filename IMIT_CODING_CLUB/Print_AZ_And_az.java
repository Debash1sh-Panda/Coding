package IMIT_CODING_CLUB;

public class Print_AZ_And_az {

    public static void main(String[] args) {
        
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }

        System.out.println("----------------- way 1");

        //Another way
        System.out.println();
        for (int i = 65; i <= 90; i++) {
            System.out.print((char)i + " ");
        }
        System.out.println();
        for (int i = 97; i <= 122 ; i++) {
            System.out.print((char)i+ " ");
        }

        System.out.println("----------------- way 2");


        //Another way
        System.out.println();
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.print((char)i+" ");
        }
        System.out.println();
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.print((char)i+" ");
        }
        
        System.out.println("----------------- way 3");
    }
}