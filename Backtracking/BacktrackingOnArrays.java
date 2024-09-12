public class BacktrackingOnArrays {
    public static void printArr(int arr[]) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void changeArr(int arr[], int si) {
        //base case
        if(si==arr.length) {
            printArr(arr);
            return;
        }
        //recursion
        arr[si] = si+1;
        // si++;
        changeArr(arr, si+1); //fnx call step
        arr[si] = arr[si] - 2; //backtracking step
    }
    public static void main(String args[]) {
        int arr[] = new int[5];
        changeArr(arr, 0);
        System.out.println();
        printArr(arr);
    }
}
