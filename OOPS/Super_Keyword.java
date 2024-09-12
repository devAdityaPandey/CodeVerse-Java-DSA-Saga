public class Super_Keyword {
    public static void main(String args[]) {
        Horse h = new Horse();
        System.out.println(h.color);
        Dog d = new Dog();
        System.out.println(d.color);
    }
}

class Animal {
    String color;
    Animal() {
        System.out.println("animal constructor called");
    }
}
class Horse extends Animal {
    Horse() {
        super();
        super.color = "brown";
        System.out.println("horse constructor called");
    }
}
class Dog extends Horse {
    Dog() {
        System.out.println("dog constructor called");
    }
}
// doubts...* 
