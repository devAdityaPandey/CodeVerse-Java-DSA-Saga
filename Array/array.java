// import java.util.*;

// public class array {
//     public static void update(int marks[]) {
//         for(int i=0; i<marks.length; i++) {
//             marks[i] = marks[i] + 1;
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int marks[] = {77, 88, 99};
//         update(marks);  
//         for(int i=0; i<marks.length; i++) {
//             System.out.println(marks[i]+" ");
//         }
//     }
// }

// LINEAR SEARCH : 
// import java.util.*;
// public class array {
//    public static int linear_search(int arr[], int n) {
//         for(int i=0; i<arr.length; i++) {
//             if(arr[i]==n) {
//                 return i;
//             }
//         }
//         return -1;
//     }
    
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the elements of the array : ");
//         int arr[] = new int[5];
//         for(int i=0; i<arr.length; i++) {
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0; i<arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//         System.out.println("Enter the number you want to search in the array : ");
//         int n = sc.nextInt();
//         int index = linear_search(arr, n);
//         if(index == -1) {
//             System.out.println("The number is not present in the array.");
//         } else {
//             System.out.println("The number is present in the array and the index of the number is : " + index);
//         }
//     }
// }

// Have to do the same for a string ...

// LARGEST IN AN ARRAY : 

// import java.util.*;

// public class array {
//     public static int max(int arr[]) {
//         // int max = arr[0];
//         // acc to mam : 
//         // -infinity 
//         int max = Integer.MIN_VALUE; 
//         // +infinity
//         int min = Integer.MAX_VALUE;
//         for(int i = 0; i<arr.length; i++) {
//             if(arr[i]>max) {
//                 max = arr[i];
//             }
//             if(arr[i]<min) {
//                 min = arr[i];
//             }
//         }
//         System.out.println("The samllest number in the array is : " + min);
//         return max;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the elements of the array : ");
//         int arr[] = new int[5];
//         for(int i = 0; i<arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("The largest number in the array is : " + max(arr));
//     }
// }

// BINARY SEARCH : 

// public class array {
//     public static int binary_search(int nums[], int n) {
//         int start = 0, end = nums.length-1;
//         while(start<=end) {
//             int mid = (start + end)/2;
//             //comparisions : 
//             if(n==nums[mid]) {
//                 return mid;
//             }
//             if(n<nums[mid]) { //left
//                 end = mid-1;
//             } else { //right
//                 start = mid+1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14};
//         int key = 13;
//         int index = binary_search(numbers, key);
//         System.out.println("The index of the number in the array is : " + index);
//     }
// }

// REVERSE AN ARRAY : 

// import java.util.*;
// public class array {
//     public static void reverse(int arr[]) {
//         // for(int i = 0; i<arr.length; i++) {
//         //     arr[i] = arr[arr.length-1-i];
//         // }
//         // System.out.println("The reverse of the array is : ");
//         // for(int i = 0; i<arr.length; i++) {
//         //     System.out.println(arr[i]);
//         // }
//             // mine's wrong so acc to mam : 
//         int start = 0, end = arr.length-1;
//         while(start<end) {
//             // arr[start] = arr[end];
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             // swap : 
//             // int temp = arr[end];
//             // arr[end] = arr[start];
//             // arr[start] = temp;
//             start++;
//             end--;
//         }
//         System.out.println("The reverse of the array is : ");
//         for(int i = 0; i<arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the elements of the array : ");
//         int arr[] = new int[5];
//         for(int i = 0; i<arr.length; i++) {
//             arr[i]=sc.nextInt();
//         }
//         reverse(arr);
//         //print
//         // System.out.println("The reverse of the array is : ");
//         // for(int i = 0; i<arr.length; i++) {
//         //     System.out.println(arr[i]);
//         // }
//     }
// }

// PAIRS IN AN ARRAY : 

// public class array {
//     public static void pairs(int arr[]) {
//         int tp = 0;
//         for(int i=0; i<arr.length; i++) {
//             // int curr = arr[i];
//             for(int j=i+1; j<arr.length; j++) {
//                 System.out.print("("+arr[i]+","+arr[j]+") ");
//                 tp++;
//             }  
//             System.out.println();
//         }
//         System.out.println("The total number of pairs : "+tp);
//     }
//     public static void main(String args[]) {
//         int nums[] = {2, 4, 6, 8, 10};
//         pairs(nums);
//     }
// }

// SUBARRAYS : 
// a continous part of array...

// public class array {
//     public static void subarrays(int nums[]) {
//         int ts = 0;
//         int max = Integer.MIN_VALUE;
//         for(int i = 0; i<nums.length; i++) {
//             for(int j = i; j<nums.length; j++) {
//                 int sum = 0;
//                 for(int k = i; k<=j; k++) {
//                     System.out.print(nums[k]+ " ");
//                     sum = sum + nums[k];
//                 }
//                 ts++;
//                 System.out.println("(The sum of this subarray is : " + sum + ")");

//                 if(sum>max) {
//                     max = sum;
//                 }

//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("The total number of subarrays is : " + ts);
//         System.out.println("The maximum sum is : " + max);
//     }
//     public static void main(String args[]) {
//         int number[] = {1, -2, 6, -1, 3};
//         subarrays(number);
//     }
// }

// MAX SUM OF THE SUBARRAYS : 
 
// public class array {
//     // public static void prefix(int arr[]) {
//     //     arr[-1]=0;
//     //     for(int i=0; i<arr.length; i++) {
//     //         arr[i]=arr[i-1]+arr[i];
//     //     }
//     //     for(int i=0; i<arr.length; i++) {
//     //         System.out.println(arr[i]);
//     //     }
//     // }
//     public static void maxSubarraySum(int arr[]) {
//         int ts = 0; // total subarrays
//         int sum = 0; // current sum 
//         int max = Integer.MIN_VALUE; // max sum
//         int prefix[] = new int[arr.length];
//         prefix[0] = arr[0];
//         // calculate prefix array : 
//         for(int i=1; i<prefix.length; i++) {
//             prefix[i] = prefix[i-1] + arr[i];
//         }
//         // i is the start index and j is the end index...
//         for(int i=0; i<arr.length; i++) {
//             for(int j=i; j<arr.length; j++) {
//                 sum = i==0? prefix[j]: prefix[j] - prefix[i-1];
//                 // for(int k=i; k<=j; k++) {
//                 //     System.out.print(arr[k] + " ");
//                 //     sum = sum + arr[k];
//                 // }
//                 // System.out.print("The sum of the subarray is : " + sum);
//                 ts ++;
//                 // System.out.println();
//                 if(sum>max) {
//                     max = sum;
//                 }
//             }
//             // System.out.println();
//         }
//         for( int i=0; i<prefix.length; i++) {
//             System.out.print(prefix[i] + " ");
//         }
//         // System.out.println("The total number of subarrays is : " + ts);
//         System.out.println("The max sum of the subarray is : " + max);
//     }
//     public static void kadans(int arr[]) { 
//         int cs = 0;
//         int ms = Integer.MIN_VALUE;

//         for(int i=0; i<arr.length; i++) {
//             cs = cs + arr[i];
//             if(cs<0) {
//                 cs = 0;
//             }
//             ms = Math.max(cs, ms);
//         }
//         System.out.println("The max sum of the subarray is : " + ms);  
//     }
//     public static void main(String args[]) {
//         int nums[] = {2, 4, 6, 8, 10};
//         // subarrays(nums);
//         // maxSubarraySum(nums);
//         kadans(nums);
//     }
// }
// // what if all the elements in the array are negative in that case we can't return 0 instead we'll have to return the least negative number as the max sum of the subarrays. So complete the code for that case. 

// TRAPPED RAINWATER : 