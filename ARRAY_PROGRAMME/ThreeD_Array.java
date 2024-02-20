package ARRAY_PROGRAMME;

public class ThreeD_Array {

    public static void main(String[] args) {
        
        int[][][] arr = {
            {
                {1,2,3},
                {4,5,7}
            },
            {
                {4,5,6},
                {1,2,3}
            }
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int j2 = 0; j2 < arr[i][j].length; j2++) {
                }
            }
        }
         System.out.print(arr[1][0][2]);
    }
}