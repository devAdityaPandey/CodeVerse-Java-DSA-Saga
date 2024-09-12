
// public class OOPS {
//     public static void main(String args[]) {
//         Pen p1 = new Pen();
//         p1.setColor("black");
//         System.out.println(p1.getColor());
//         p1.setTip(5);
//         System.out.println(p1.getTip());
//         p1.setColor("darker");
//         System.out.println(p1.getColor());
//     }
// }
// class Pen {
//     private String color;
//     private int tip;

//     String getColor() {
//         return color;
//     }
//     int getTip() {
//         return tip;
//     }

//     void setColor(String newColor) {
//         this.color = newColor;
//     }
//     void setTip(int newTip) {
//         this.tip = newTip;
//     }
// }

// class Student {
//     String name;
//     int roll;
//     int percentage; //cgpa
//     int calcpercent(int phy, int chem, int maths) {
//         return (phy + chem + maths)/3;
//     }

// }

public class OOPS {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.password = "xyz...";
        Student s2 = new Student("Adi");
        System.out.println(s2.name);
        s2.setName("Yash");
        System.out.println(s2.name);
        Student s3 = new Student(3);
        System.out.println(s3.roll);
        s3.setRoll(5);
        System.out.println(s2.roll);
        Student s5 = new Student(s2);
        s5.password = "12345";
        System.out.println(s5.name);
        System.out.println(s5.roll);
        System.out.println(s5.password);
    }  
}

class Student {
    String name;
    int roll;
    String password;
    //copy constructor
    Student(Student s2) {
        this.name = s2.name;
        this.roll = s2.roll;
    }
    Student() {
        System.out.println("Hey!");
    }
    Student(String name) {
        this.name = name;
    }
    Student(int roll) {
        this.roll = roll;
    }
    void setName(String newName) {
        name = newName;
    }
    void setRoll(int newRoll) {
        roll = newRoll;
    }
}