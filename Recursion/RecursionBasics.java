// Print numbers form n to 1 (Decreasing Order)

// import java.util.*;
// public class RecursionBasics {
//     public static void printDec(int n) {
//             if(n == 1) {
//                 System.out.println(n);
//                 return;
//             }
//             System.out.print(n + " ");
//             printDec(n-1);
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number : ");
//         int n = sc.nextInt();
//         printDec(n);
//     }
// }

// Print numbers from 1 to n (Increasing Order)

// import java.util.*;
// public class RecursionBasics {
//     public static void printInc(int n) {
//         // for(int i=1; i<=n; i++) {
//         //     System.out.println(i);
//         // }
//         if(n==1) {
//             System.out.print(n + " ");
//             return;
//         }
//         printInc(n-1);
//         System.out.print(n + " ");

//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number : ");
//         int n = sc.nextInt();
//         printInc(n);
//     }
// }


// Find factorial of n
// Print sum of first n natural numbers
// Print nth fibonacci number
// Check if array is sorted or not
// First occurence
// Last occurence

import java.util.*;
public class RecursionBasics {
    public static int factorial(int n) {
        if(n==0) {
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn = n*fnm1;
        return fn;
    }
    public static int calcSum(int n) {
        if(n==1) {
            return 1;
        }
        int Snm1 = calcSum(n-1);
        int Sn = n+Snm1;
        return Sn;
    }
    public static int fib(int n) {
        if(n==0) {
            return 0;
        }
        if(n==1) {
            return 1;
        }
        int fibNm1 = fib(n-1);
        int fibNm2 = fib(n-2);
        int fibN = fibNm1 + fibNm2;
        return fibN;
    }
    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length-1) {
            return true;
        }
        if(arr[i]>arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int firstOccurence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static int lastOccurence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number : ");
        // int n = sc.nextInt();
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 6, 5, 3};
        System.out.println(firstOccurence(arr, 5, 0));
    }
}
// cleear the concepts of last occurence 