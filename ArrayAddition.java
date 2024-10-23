public class ArrayAddition {
    public static void main(String[] args) {
        // Define two 2D arrays
        int[][] array1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] array2 = {
            {7, 8, 9},
            {10, 11, 12}
        };

        // Check if arrays have the same dimensions
        if (array1.length != array2.length || array1[0].length != array2[0].length) {
            System.out.println("Arrays must have the same dimensions.");
            return;
        }

        // Create a new array to store the sum
        int[][] sumArray = new int[array1.length][array1[0].length];

        // Add the two arrays
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                sumArray[i][j] = array1[i][j] + array2[i][j];
            }
        }

        // Print the resulting sum array
        System.out.println("Sum of the two arrays:");
        for (int i = 0; i < sumArray.length; i++) {
            for (int j = 0; j < sumArray[i].length; j++) {
                System.out.print(sumArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
