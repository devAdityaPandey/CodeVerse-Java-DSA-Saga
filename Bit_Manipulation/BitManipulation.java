
public class BitManipulation {
    public static void oddOrEven(int n) {
        if((n & 1) != 1) {
            System.out.println("The number is even...");
        } else {
            System.out.println("The number is odd...");
        }
    }
    public static void main(String args[]) {
        oddOrEven(8);
        oddOrEven(9);
        oddOrEven(11);
        oddOrEven(22);
    }
}
