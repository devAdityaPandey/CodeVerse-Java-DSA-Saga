import java.util.*;
public class BasicSorting {
    //bubble sort
    public static void bubbleSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    //selection sort  
    public static void selectionSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int minPos = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minPos]>arr[j]) {
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    //insertion sort 
    public static void insertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct pos to insert
            while(prev>=0 && arr[prev]>curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion 
            arr[prev+1] = curr;
        }
    }
    //counting sort
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for(int i=0; i<arr.length; i++) {
            while(count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--; 
            }
        }
    }
    //print the sorted array 
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
       System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {3, 1, 5, 4, 2};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3);
        // Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);
    }
}

// Time Complexity:
// Bubble Sort: O(n^2)
// Selection Sort: O(n^2)
// Insertion Sort: O(n^2)
// Counting Sort: O(n+k) where k is the range of the input

// Space Complexity:
// Bubble Sort: O(1)
// Selection Sort: O(1)
// Insertion Sort: O(1)
// Counting Sort: O(n+k) where k is the range of the input

