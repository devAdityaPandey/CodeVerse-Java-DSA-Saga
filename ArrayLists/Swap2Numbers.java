import java.util.ArrayList;

public class Swap2Numbers {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);
        int idx1 = 1;
        int idx2 = 3;

        //swap 2 numbers 
        // int temp;
        // temp = list.get(idx1);
        // list.set(idx1, list.get(idx2));
        // list.set(idx2, temp);
        // System.out.println(list);

        swap(list, idx1, idx2);
    }
}
