public class Inheritence {
    public static void main(String args[]) {
        // Fish shark = new Fish();
        // shark.eat();
        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);
    }
}
//Base class
class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathes");
    }
}
//Derived Class / subclass
class Fish extends Animal {
    int fins;
    void swim() {
        System.out.println("swims in water");
    }
}

class Mammal extends Animal {
    int legs;
    void walk() {
        System.out.println("walks");
    }
}

// class Dog extends Mammal {
//     String breed;
// }

class Bird extends Animal {
    void fly() {
        System.out.println("flies in air");
    }
}