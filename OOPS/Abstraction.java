public class Abstraction {
    public static void main(String args[]) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        // System.out.println(h.color);
        Mustang myHorse = new Mustang();
    }
}

abstract class Animal {
    String color;  
    // Animal() {
    //     color = "brown";
    // } 
    Animal() {
        System.out.println("animal constructor called");
    }
    void eat() {
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("horse constructor called");
    }
    void changeColor() {
        color = "dark brown";
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("mustang constructor called");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("walks on 2 legs");
    }
}