// public class functions {
//     public static int printHello() {
//         System.out.println("Hello world!"); 
//         System.out.println("Hello world!"); 
//         System.out.println("Hello world!"); 
//         return 3;
//     }
//     public static void main(String args[]) {
//         printHello();
//     }
// }
// Functions that are written inside a class becomes the methods of that class.

// WITH PARAMETERS : 

// import java.util.*;
// public class functions {
//     public static int sum(int a, int b) {
//         return a+b;
//     }
//     public static void main(String args[]) {
//         System.out.println(sum(3, 8));
//     }
// }

//  FIND PRODUCT OF A AND B : 

// import java.util.*;

// public class functions {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter two numbers for product : ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println("The product of the numbers is : " + product(a, b)); 
//     }
//     public static int product(int x, int y) {
//         return x*y;
//     }
// }

// import java.util.*;

// public class functions{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of  n and r : ");
//         int n = sc.nextInt();
//         int r = sc.nextInt();
//         System.out.println("The binomial coeffiecient will be : " + bincoeff(15, 10));
//     }
//     // function to claculate factorial of a number : 
//     public static int factorial(int n) {
//         int fact = 1;
//         for(int i = 1; i<=n; i++) {
//             fact = fact * i;
//         }
//         return fact;
//     }

//     // function to calculate binomial coefficient : 
//     public static int bincoeff(int n, int r) {
//         int n_fact = factorial(n);
//         int r_fact = factorial(r);
//         int nmr_fact = factorial(n-r);
//         int bc = n_fact/(r_fact*nmr_fact);
//         return bc;
//     }
    
// }

// FUNCTION OVERLOADING : 

// VARIOUS FUNCTIONS WITH THE SAME NAME BUT DIFFERENT PARAMETERS (EITHER NUMBER OF PARAMETERS OR DATA TYPE OF PARAMETERS)...

// 1 : function overloading using number of parameeters : 

// public class functions {
//     public static void main(String args[]) {
//         System.out.println(sum(1,2));
//         System.out.println(sum(1,2,3));
//     }
//     // functions to calculate sum of two numbers : 
//     public static int sum(int a, int b){
//         return a+b;
//     }
//     // function to calculate sum of three numbers : 
//     public static int sum(int a, int b, int c){
//         return a+b+c;
//     }
// }

// 2 : function overloading using data types : 

// public class functions{
//     public static void main(String args[]) {
//         System.out.println(sum(1,2));
//         System.out.println(sum(3.2f, 4.8f));
//     }
//     // function to calculate sum of int : 
//     public static int sum(int a, int b) {
//         return a+b;
//     }
//     // function to calculate sum of float : 
//     public static float sum(float a, float b) {
//         return a+b;
//     }
// }

// CHECK IF A NUMBER IS PRIME OR NOT : 

// import java.util.*;

// public class functions{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number to check whether it's prime or not : ");
//         int n = sc.nextInt();
//         for(int i = 2; i<n; i++) {
//         if(n%i==0){
//             System.out.println("The number is not prime.");
//             break;
//         } else {
//             System.out.println("The number is prime.");
//             break;
//         }
//         }
//     }
// }

// public class functions{
//     // for n>=2 : 
//     public static boolean isPrime(int n) {
//         // corner cases : 
//         // 2
//         if(n==2) {
//             return true;
//         }
//         for(int i = 2; i<=n-1; i++) {
//         if(n%i==0) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]) {
//         System.out.println(isPrime(9));
//     } 
// }

// CORNER CASES : SPECIAL CASES WHICH ARE NOT TREATED USUAL LIKE OTHER NUMBERS. FOR THEM WE HAVE TO DEFINE CONDITIONS SEPERATELY...

// optimised approach : (lol): 

// public class functions {
//     public static boolean isPrime(int n){
//         if(n==2){
//             return true;
//         }
//         for(int i = 2; i<=Math.sqrt(n); i++) {
//             if(n%i==0) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]) {
//         System.out.println(isPrime(7));
//     }
// }

// PRIME IN RANGE : 

// import java.util.*;

// public class functions {
//     public static void prime(int ini, int fin) {
//         for(int i = ini; i<= fin; i++) {
//             for(int j = 2; j<=i-1; j++) {
//                 if(i==2) {
//                     System.out.println(i);
//                     break;
//                 } else if(i%j==0) {
//                     break;
//                 } 
//             }
//                 System.out.println(i);
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the range : ");
//         int i = sc.nextInt();
//         int f = sc.nextInt();
//         System.out.println("The prime numbers are : ");
//         prime(i, f);
//     } 
// } (WORKING...)

// BINARY TO DECIMAL : 

// import java.util.*;

// public class functions {
//     public static void binToDec(int binNum) {
//         int num = binNum;
//         int pow = 0, dec = 0;
//         while(binNum>0) {
//             int lastDigit = binNum%10;
//             dec = dec + lastDigit*(int)Math.pow(2,pow);
//             pow++;
//             binNum = binNum/10; 
//         }
//         System.out.println("Decimal of " + num + " is " + dec);
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a binary number to convert it into decimal number : ");
//         int n = sc.nextInt();
//         binToDec(n);
//     }
// }

// SCOPE : 
// MEHTOD SCOPE : 
// BLOCK SCOPE : 
// CLASS SCOPE : 

import java.util.*;

public class functions {
    public static boolean isPrime(int n) {
        for(int i = 2; i<n; i++) {
            if(Math.sqrt(n)%i==0) {
                return false;
            } 
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
    }
}


