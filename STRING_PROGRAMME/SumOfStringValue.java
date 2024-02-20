package STRING_PROGRAMME;

// public class Vtring {
    
//     public static void main(String[] args) {
        
//         String str = "hell123wr";

//         int sum = 0;
//         for(int i = 0; i <= str.length(); i++){
//             if (str.charAt(i) == str.charAt(i+1)) {
//                 int temp = i;
//                 sum += temp;
//             }
//         }
//         System.out.println(sum);
//     }
// }

// public class Vtring {
    
//     public static void main(String[] args) {
        
//         String str = "12";

//         int sum = 0;
//         for (int i = 0; i < str.length(); i++) {
//             if (Character.isDigit(str.charAt(i))) {
//                 int temp = i;
//                 sum += temp;
//             }
//         }
//         System.out.println(sum);
//     }
// }


public class SumOfStringValue {
    
    public static void main(String[] args) {
        
        String str = "helo1n3m4mn6";

        int digitSum = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (Character.isDigit(currentChar)) {
                // Convert the character to an integer and add it to the sum
                int digitValue = Character.getNumericValue(currentChar);
                digitSum += digitValue;
            }
        }
        System.out.println("The sum of digits in the string is: " + digitSum);
    }
}

