//Product of 2 numbers

import java.util.*;

public class Functions {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }
    public static void main(String args[]) {
        int a = 3;
        int b = 5;
       int prod = multiply(a,b);
       System.out.println("a * b = " + prod);
    }
} 

//Factorial of a number, n

 import java.util.*;

public class Functions {
    public static int factorial(int n) {
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }
    public static void main(String args[]) {
       int fact = factorial(5);
       System.out.println("Factorial is = " + fact);
    }
}
 

//Calculating Binomial Coefficient

import java.util.*;

public class Functions {
    public static int factorial(int n) {
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }
    public static int BinCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nr);
        return binCoeff;
    }
    public static void main(String args[]) {
       System.out.println(BinCoeff(5, 2));
    }
}
 

//Check if a number is prime or not

import java.util.*;

public class Functions {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for(int i=2; i<=n-1; i++){
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String args[]) {
       System.out.println(isPrime(4));
    }
} 

//Optimized way to check wheather the number is prime or not

import java.util.*;

public class Functions {
    public static boolean isPrime(int n) {
        if(n == 2) {
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0) {
            return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
       System.out.println(isPrime(16));
    }
} 

//Extra

import java.util.*;

public class Functions {
    public static boolean isPrime(int n) {
        if(n == 2) {
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0) {
            return false;
            }
        }
        return true;
    }
    public static void primesInRange(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]) {
      primesInRange(20);
    }
} 

//Convert Number from Binary to Decimal

 import java.util.*;

public class Functions {
    public static void bintoDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while(binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of " + myNum + " = " + decNum);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter a binary number: ");
        int binNum = sc.nextInt();            
        bintoDec(binNum);                    
        sc.close();
    }
} 

