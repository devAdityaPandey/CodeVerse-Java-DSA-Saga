import java.util.ArrayList;

public class MultidimensionalArrayLists {
    public static void main(String[] args) {
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1); list.add(2);
        // mainList.add(list);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(3); list2.add(4);
        // mainList.add(list2);

        // for(int i=0; i<mainList.size(); i++) {
        //     ArrayList<Integer> currList = mainList.get(i);
        //     for(int j=0; j<currList.size(); j++) {
        //         System.out.print(currList.get(j) + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println(mainList);
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(1);
        // list1.add(2);
        // list1.add(3);
        // list1.add(4);
        // list1.add(5);
        // mainList.add(list1);
        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(2);
        // list2.add(4);
        // list2.add(6);
        // list2.add(8);
        // list2.add(10);
        // mainList.add(list2);
        // ArrayList<Integer> list3 = new ArrayList<>();
        // list3.add(3);
        // list3.add(6);
        // list3.add(9);
        // list3.add(12);
        // list3.add(15);
        // mainList.add(list3);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for(int i=1; i<=5; i++) {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        list2.remove(3);
        list2.remove(2);
        System.out.println(mainList);
        for(int i=0; i<mainList.size(); i++) {
            for(int j=0; j<mainList.get(i).size(); j++) {
                System.out.print(mainList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
