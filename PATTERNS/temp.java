package PATTERNS;

public class temp {
    
    public static void find(int size){

        //Print Lines
        for (int i = 1; i <= size; i++) {
            
            //Print Spaces before the numbers
            for (int j = 1; j <= size-i; j++) {
                System.out.print(" ");
            }
            //Print Decreasing Numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            //Print increasing numbers after the decreasing
            for (int j = 2; j <= i; j++) { 
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        

     int size = 6;
     find(size);
    }
}
