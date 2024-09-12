import java.util.LinkedList; //JCF -> optimized
// import java.util.*;

public class LLinCollectionsFramework {
    public static void main(String[] args) {
       //create - objects int, flaoat, boolean -> Integer, Float, Character
       LinkedList<Integer> ll  = new LinkedList<>();
       //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //0->1->2
        System.out.println(ll);
       //remove
       ll.removeLast();
       ll.removeFirst();
       System.out.println(ll);
    }
}

//We can only store objects. We can't use int, float, boolean instead we'll have to use Integer class, Float class, Character class. We have to use classes as our datatype not our primitive datatypes
