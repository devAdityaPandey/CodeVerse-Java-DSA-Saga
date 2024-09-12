import java.util.ArrayList;
public class Classroom {
    public static void main(String args[]) {
        //Java Collection Framework
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // Operatioins : 
        // add operation : 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // get operation : 
        int element = list.get(2);
        System.out.println(element);

        // remove operation :
        list.remove(2);
        System.out.println(list);

        // set operation : 
        list.add(2, 3);
        System.out.println(list);
        list.set(2, 10);
        System.out.println(list);

        // contain operation : 
        System.out.println(list.contains(10));
        System.out.println(list.contains(11));

        //size of arraylist :
        System.out.println(list.size());
        //iteration using size : 
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }
}
