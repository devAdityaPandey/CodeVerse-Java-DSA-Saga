public class Copy_Constructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Adi";
        s1.roll = 01;
        // s1.password = "xyz";
        // System.out.println(s1.password);
        s1.setPass("xyz");
        // System.out.println(s1.getPass());
        s1.marks[0] = 100;
        s1.marks[1] = 96;
        s1.marks[2] = 90;
        Student s2 = new Student(s1);
        s1.marks[1] = 99;
        s2.setPass("123");
        // System.out.println(s2.getPass());
        for(int i=0; i<s2.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    private String password;
    int marks[];
    // Address add;
    // class Address {
    //     String city;
    // }
    Student() {
        marks = new int[3];
    }
    //shallow copy constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }
    //deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
    void setPass(String pass) {
        this.password = pass;
    }
    String getPass() {
        return password;
    }
}
