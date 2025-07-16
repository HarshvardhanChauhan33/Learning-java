//printing hello world 10 times using while loop

import java.util.*;

public class Loops {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
      int count = 0;
      while(count<10){
        System.out.println("Hello World!");
        count++;
     }
    }
}


//printing number from 1 to n

import java.util.*;

public class Loops {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int range = sc.nextInt();
      int count = 1;
      while(count <= range){
        System.out.print(count + " ");
        count++;
     }
    }
}


//Sum of 1st n natural numbers

import java.util.*;

public class Loops {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int sum = 0;
      int i = 1;
      while(i <= n){
        sum += i;
        i++;
     }
     System.out.print("sum is : " + sum);
    }
}


//Keep entering numbers until user enters multiple of 10

import java.util.*;

public class Loops {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int n;
      
      do{
         System.out.print("Please Enter the number : ");
          n = sc.nextInt();
        if(n % 10 == 0){
            break;
        }
         System.out.println(n);
      }while(true);
       System.out.println("The number " + n + " is multiple of 10. ");

      }
    }


//Display all numbers entered by user except multiple of 10

import java.util.*;

public class Loops {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
      
      do{
         System.out.print("Please Enter the number : ");
         int n = sc.nextInt();
        if(n % 10 == 0){
            continue;
        }
         System.out.println(n);
      }while(true);
      }
    }


    //Check if a number is prime or not

import java.util.*;

public class Loops {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     if(n==2){
        System.out.println("n is Prime");
     }else{

     boolean isPrime = true;
     for(int i=2; i<=n-1; i++){
        if(n%i == 0){
            isPrime = false;
        }
     }
     if(isPrime == true){
        System.out.println("n is Prime ");
     }else{
        System.out.println("n is not Prime");
     }
     }
      }
    }