public class Staircase_Search {
    public static boolean staircaseSearch(int matrix[][], int key) {
        int i = 0; int j = matrix[0].length-1;
        while(i<matrix.length && j>=0) {
            if(key == matrix[i][j]) {
                System.out.print("The key is found at (" + i + "," + j + ")");
                return true;
            } else if(key < matrix[i][j]) {
                j--;
            } else {
                i++;
            }
        }
        System.out.print("key not found...");
        return false;
    }
    public static void main(String args[]) {
        int matrix[][] = {{10, 20, 30, 40},
                            {15, 25, 35, 45},
                            {27, 29, 37, 48}, 
                            {32, 33, 39, 50}};
        int key = 33;
        staircaseSearch(matrix, key);
    }
}

// Clear the concepts of binary search...
// Perform staircase search from n-1, 0 to 0, n-1 and dry run the code...