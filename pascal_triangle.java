import java.util.Map;
import java.util.HashMap;
// public class pascal_triangle{
    //  create cache map with key type integer, value type integer
//     private static Map<Integer,Integer> cache = new HashMap<>();
//     public static void main(String[] args) {
        
//         int rows = 5;

//         // iterations
//         for (int i = 0; i < rows; i++) {
//             int coefficient = 1;
//             // System.out.printf("%" + (rows - i) * 2 + "s", ""); // For spacing

//             for (int j = 0; j <= i; j++) {
//                 System.out.printf("%4d", coefficient);
//                 coefficient = coefficient * (i - j) / (j + 1);
//             }

//             System.out.println();
//         }
        
//         // recursions

//     }
// }


// public class PascalTriangleIteration {

//     public static void main(String[] args) {
//         int rows = 5;

//         for (int i = 0; i < rows; i++) {
//             int coefficient = 1;
//             System.out.printf("%" + (rows - i) * 2 + "s", ""); // For spacing

//             for (int j = 0; j <= i; j++) {
//                 System.out.printf("%4d", coefficient);
//                 coefficient = coefficient * (i - j) / (j + 1);
//             }

//             System.out.println();
//         }
//     }
// }


// import java.util.HashMap;
// import java.util.Map;

public class pascal_triangle {

    private static Map<String, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                int coefficient = calculateCoefficient(i, j);
                System.out.print(coefficient + " ");
            }
            System.out.println();
        }
    }

    private static int calculateCoefficient(int row, int col) {
        String key = row + "," + col;

        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        if (col == 0 || col == row) {
            memo.put(key, 1);
            return 1;
        }

        int coefficient = calculateCoefficient(row - 1, col - 1) + calculateCoefficient(row - 1, col);
        memo.put(key, coefficient);
        return coefficient;
    }
}







