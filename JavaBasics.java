/*
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number (A) :");
        int A = sc.nextInt();
        System.out.print("Enter the second number (B) :");
        int B = sc.nextInt();
        System.out.print("Enter the third number (C) :");
s        int C = sc.nextInt();
        int average = (A + B + C) / 3;
        System.out.print("The average of the 3 numbers is :");
        System.out.print(average);
    }
}
*/

/*
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of square : ");
        int a = sc.nextInt();
        System.out.print("The area of the square is : ");
        int area = a * a;
        System.out.print(area);
    }
}
*/

/*
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of a pencil : ");
        float a = sc.nextFloat();
        System.out.print("Enter the cost of a pen : ");
        float b = sc.nextFloat();
        System.out.print("Enter the cost of an eraser : ");
        float c = sc.nextFloat();
        System.out.print("Total cost of the items (Bill) : ");
        float total = a + b + c;
        System.out.println(total);
        float gst = total * 18 / 100;
        System.out.print("18% gst tax : ");
        System.out.println(gst);
        float total1 = total + gst;
        System.out.print("Total cost of the items with gst : ");
        System.out.print(total1);        
    }
}
*/

/* double */

/*
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int $ = 24;
        System.out.print($);
    }
}
*/

/*
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = 10;
        int B = 5;
        int sum = A + B;
        System.out.println("sum : " + sum);
        int diff = A - B;
        System.out.println("diff : " + diff);
        int product = A * B;
        System.out.println("product : " + product);
        int div = A / B;
        System.out.println("div : " + div);
        int mod = A % B;
        System.out.println("mod : " + mod);

    }
}
*/

/*
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //int a = 10;
        //int b = ++a;
        //System.out.println(a);
        //System.out.print(b);
        int a = 10;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
    }
}
*/



/*
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        int r = sc.nextInt();
        double c = 2 * 3.14 * r;
        System.out.print("The circumference of circle is : ");
        System.out.print(c);
        float a = 3.14f * r * r;
        System.out.print("The area of circle is : ");
        System.out.print(a);
    }
}
*/

/*import java.util.*;

public class JavaBascis {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = 11;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
    }
}*/
/* 
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = 2, y = 5;

        int exp1 = (x * y/ x);
        int exp2 = (x * (y / x));

        System.out.print(exp1 + " , ");
        System.out.print(exp2);
    }
}
*/

/*
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        if ( x % 2 == 0 ) {
            System.out.print("The number is even");
        } else {
            System.out.print("The number is odd");
        }
    }
}
*/

/*
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = sc.nextInt();
        if ( age >= 18) {
            System.out.print("ADULT");
        } if ( age > 13 && age < 18 ) {
            System.out.print("teenage");
        }
        else {
            System.out.print("NON-ADULT");
        }
    }
}
*/

/*
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the income : ");
        int income = sc.nextInt();
        if ( income < 500000 ) {
            System.out.print("0% tax");
        } else if ( 500000 < income && income < 1000000) {
            System.out.print("20% tax");
        } else {
            System.out.print("30% tax");
        }
    }
}
*/

/*
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int x = sc.nextInt();
        System.out.print("Enter the second number : ");
        int y = sc.nextInt();
        System.out.print("Enter the third number : ");
        int z = sc.nextInt();
        if ( x > y && x > z ) {
            System.out.print("x is the greatest, i.e. : " + x);
        } else if ( y > x && y > z ) {
            System.out.print("y is the greatest, i.e. : " + y);
        } else {
            System.out.print("z is the greatest, i.e. : " + z);
        }

    }
}
*/

/*
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income : ");
        int income = sc.nextInt();
        int tax;
        if ( income < 500000) {
            tax = 0;
        } else if ( income > 500000 && income < 1000000 ) {
            tax = (int)(income * 0.2);
        } else { 
            tax = (int)(income * 0.3);
        }
        System.out.print("tax : " + tax);
    }
}
*/

/*
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int A = sc.nextInt();
        System.out.print("Enter the second number : ");
        int B = sc.nextInt();
        System.out.print("Enter the third number : ");
        int C = sc.nextInt();
        if ( A >= B && A >= C) {
            System.out.print("A is the greatest, i.e. : " + A);
        } else if ( B >= C ) {
            System.out.print("B is the greatest, i.e. : " + B);
        } else {
            System.out.print("C is the greatest, i.e. : " + C);
        }
    }
}
*/

/*
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        String type = number % 2 == 0? "even" : "odd" ;
        System.out.print(type);
    }
}
*/

/*
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of student : ");
        int marks = sc.nextInt();
        // ternary operators'
       String result = (marks >= 33)? "PASS" : "FAIL" ;
       System.out.print(result);
    }
}
*/

/*
import java.util.*;

public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 3 : ");
        int number = sc.nextInt();
        switch (number) {
            case 3 : System.out.println("Tea");
                        break;
            case 1 : System.out.println("Coffee");
                        break;
            case 2 : System.out.println("Mango Shake");
                        break;
            default : System.out.println("WAKE UP TO REALITY");
        }
    }
}
*/

/*
}import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word = sc.nextLine();
        System.out.print(word);
    }
}
*/

/*
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in); {
            System.out.println("Enter the expression : ");
            int x = sc.nextInt(); 
            char operation = sc.next().charAt(0);
            int y = sc.nextInt();
            switch (operation) {
                case '+' : System.out.print("Sum : " + (x + y));
                            break;
                case '-' : System.out.print("Difference : " + (x - y));
                            break;
                case '*' : System.out.print("Multiply : " + (x * y));
                            break;
                case '/' : System.out.print("Division : " + (x / y));
                            break;
                case '%' : System.out.print("Modulo : " + (x % y));
            }
        }
       }
}
*/

/*
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expression : ");
        int A = sc.nextInt();
        char operator = sc.next().charAt(0);
        int B = sc.nextInt();
        switch (operator) {
            case '+' : System.out.print("Sum : " + (A + B));
                        break;
            case '-' : System.out.print("Difference : " + (A - B));
                        break;
            case '*' : System.out.print("Multiplication : " + (A * B));
                        break;
            case '/' : System.out.print("Division : " + (A / B));
                        break;
            case '%' : System.out.print("Modulo : " + (A % B));
        }
    }
}
*/

/*
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        int counter = 0;
        while (counter<100) {
            System.out.println("HELLO WORLD");
            counter++;
        }
    }
}
*/

/*
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = 1;
        while (number <= 10) {
            System.out.println(number);
            number++;
        }
    }
}
*/

/*
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number1 = 1;
        System.out.print("Enter the value of n : ");
        int number = sc.nextInt();
        while ( number1 <= number ) {
            System.out.println(number1);
            number1++;
        }
    }
}
*/
// ((n)(n-1))/2... (Formula for the sum of n natural numbers.)
/*
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number1 = 1;
        System.out.print("Enter the value of 'n' : ");
        int number = sc.nextInt();
        while (number1 <= number) {
            System.out.println(number1);
            number1++;
        }
        System.out.println("The sum of the first n natural numbers : " + ((number) * (number + 1)) / 2 ); 
    }
}
*/

/*
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

    }
}
*/

/* 
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for ( int number = 0 ; (number < 10) ; number++ ){
            System.out.println("hello  world");
        }
    }
}
*/
/*
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 56789;
        while (n>0) {
            System.out.print(n%10);
            n/=10;
        }
    }
}
 */

 /*
 import java.util.*;

 public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 10899;
        int rev = 0;
        while (n>0) {
            int ld = n%10;
            rev = ((rev*10)+ld);
            n/=10;
        }
        System.out.print(rev);
    }
 }
 */

 /*
 import java.util.*;

 public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("hello world");
            n++;
        } while (n<10);
    }
 }
 */

 /*
 import java.util.*;

 public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            if (i == 3){
                break;
            }
        }
        System.out.print("The loop is broken at 3.");
    }
 }
 */

 /*
 import java.util.*;

 public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            if ( n % 10 == 0) {
                break;
            }
        } while (true);
        System.out.print("The number entered is multiple of 10");
    }
 }
 */

 /*import java.util.*;

 public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if (n>0) {
            System.out.print("The number is positive.");
        } else {
            System.out.print("The number is negative.");
        }
    }
 }
 */

 /*
 import java.util.*;

 public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double temperature = 103.5;
        if (temperature>100) {
            System.out.print("You have a fever.");
        } else {
            System.out.print("You don't havae a fever.");
        }
    }
 }
 */

 /*
 import java.util.*;

 public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter week number (1-7) : ");
        int n = sc.nextInt();
        switch (n) {
            case 1 : System.out.print("Sunday");
                        break;
            case 2 : System.out.print("Monday");
                        break;
            case 3 : System.out.print("Tuesday");
                        break;
            case 4 : System.out.print("Wednesday");
                        break;
            case 5 : System.out.print("Thursday");
                        break;
            case 6 : System.out.print("Friday");
                        break;
            case 7 : System.out.print("Saturday");
                        break;
            default : System.out.print("No results'");
        }
    }
 }
 */

 /*
 import java.util.*;

 public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = 63, b = 36;
        boolean x = ( a < b ) ? true : false;
        int y = ( a > b ) ? a : b;
        System.out.println("x : " + x);
        System.out.print("y : " + y);
    }
 }
 */

/*
 import java.util.*;

 public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'A' : ");
        int A = sc.nextInt();
        System.out.print("Enter 'B' : ");
        int B = sc.nextInt();
        if (A > B) {
            System.out.print("A is greatest");
        } 
        if (A == B) {
            System.out.print("A is equal to B");
        }
        else {
            System.out.print("B is greatest");
        }
    }
 }
 */

 /*
 import java.util.*;

 public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.print("adult");
        } 
        if (age >= 13 && age <= 19) {
            System.out.print("teenager");
        }
        else {
            System.out.print("non-adult");
        }
    }
 }
 */

//  public class JavaBasics {
//     public static void main(String args[]) {
//         System.out.println("hell");
//     }
//  }

 public class JavaBasics {
    public static void main(String args[]){ 
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }
 }