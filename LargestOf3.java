import java.util.*;

public class LargestOf3 {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
      System.out.println("Enter the three numbers :");
     int num1 = sc.nextInt();
     int num2 = sc.nextInt();
     int num3 = sc.nextInt();
     if((num1 >= num2) && (num1 >= num3)){
        System.out.println("The number1 : " + num1 + " is larger.");
     }
     else if((num2 >= num3)){
        System.out.println("The number2 : " + num2 + " is larger.");
     }
     else{
        System.out.println("The number3 : " + num3 + " is larger.");
     }  
     }
    }

//boilerplate code