import java.util.*;
public class matrices {
    public static boolean search(int matrix[][], int key) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j]==key) {
                    System.out.println("The key is found at (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false; 
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of rows : ");
        // int m = sc.nextInt();
        // System.out.println("Enter the number of columns : ");
        // int n = sc.nextInt();
        int matrix[][] = new int[3][3];
        int m = matrix.length; int n = matrix[0].length;  
        System.out.println("Enter the elements of (" + m + "x" + n + ") matrix : ");
        int arr[][] = new int[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The final matrix is : ");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        search(arr, 5);
    }
}

// print a particular row or column from the matrix...
// find out the largest and the smallest element inside the matrix...
