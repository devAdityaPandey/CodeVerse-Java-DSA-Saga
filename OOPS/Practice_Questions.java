
public class Practice_Questions {
    public static void main(String args[]) {
        Student S = new Student();
        S.name = "aman";
        System.out.println(S.name);
    }
}

class Student {
    static String name;
    int marks;
    Student() {
        System.out.println("student constructor called");
    }
}
