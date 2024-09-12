public class Static_Keyword {
    public static void main(String args[]) {
        Student  s1 = new Student();
        s1.schoolName = "ymps";
        Student s2 = new Student();
        System.out.println(s2.schoolName);
        Student s3 = new Student();
        s3.schoolName = "sjs";
        System.out.println(s1.schoolName);
        System.out.println(s1.returnPercentage(33, 33, 33));
        System.out.println(s2.returnPercentage(35, 35, 35));
        System.out.println(s3.returnPercentage(55, 55, 55));
    }
}

class Student {
    String name;
    int roll;
    static int returnPercentage(int phy, int chem, int maths) {
        return (phy + chem + maths) / 3;
    }
    static String schoolName;
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}