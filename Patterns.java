 
//Printing star pattern

public class Patterns {
    public static void main(String args[]) {

    for( int line = 1; line <= 4; line++ ) {
        for( int star = 1; star <= line; star++ ) {
            System.out.print("*");
           }
           System.out.println();
       }
    }
} 

//Inverted Star Pattern

public class Patterns {
    public static void main(String args[]) {
    int n = 4;
    for( int line = 1; line <= 4; line++ ) {
        for( int star = 1; star <= (n-line+1) ; star++ ) {
            System.out.print("*");
           }
           System.out.println();
       }
    }
} 

// Printing Half Pyramid Pattern

public class Patterns {
    public static void main(String args[]) {
    int n = 4;
    for( int line = 1; line <= n; line++ ) {
        for( int num = 1; num <= line; num++ ) {
            System.out.print(num);
           }
           System.out.println();
       }
    }
}  

//Printing Character Pattern


public class Patterns {
    public static void main(String args[]){
        int n = 4;
        char ch = 'A';
    for( int line = 1; line <= 4; line++ ) {
        for( int chars = 1; chars <= line; chars++ ) {
            System.out.print(ch);
            ch++;
           }
           System.out.println();
       }
    }
}  

// Printing Hollow Rectangle

 public class Patterns {
    public static void hollow_Rectangle(int totRows, int totCols) {
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totCols; j++){
                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow_Rectangle(4, 5);
    }
}  

//

public class Patterns {
    public static void inverted_rotated_half_pyramid(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    public static void main(String args[]){
        inverted_rotated_half_pyramid(4);
    }
}  

//Printing Floyd Triangle

 
public class Patterns {
    public static void floydTriangle(int n) {
        int counter=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++, counter++){
                    System.out.print(counter+" ");
                }
                System.out.println();
            }
        }
    public static void main(String args[]){
        floydTriangle(5);
    }
}  

//0-1 Triangle


 public class Patterns {
    public static void zeroOneTriangle(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                   int num = (i+j)%2;
                   if(num == 1){
                    System.out.print(1+" ");
                   }
                   else{
                    System.out.print(0+" ");
                   }
                }
                System.out.println();
            }
        }
    public static void main(String args[]){
        zeroOneTriangle(5);
    }
}  

//ButterFly Pattern
 
public class Patterns {
    public static void butterFly(int n) {
        //1st half
        for(int i=1; i<=n; i++){
            //stars - i
            for(int j=1; j<=i; j++){
                    System.out.print("*");
                   }
                   //spaces - 2*(n-i)
                   for(int j=1; j<=2*(n-i); j++){
                    System.out.print(" ");
                   }
                   //stars - i
                    for(int j=1; j<=i; j++){
                    System.out.print("*");
                   }
                   System.out.println();
                }
                //2nd half
                for(int i=n; i>=1; i--){
                     //stars - i
            for(int j=1; j<=i; j++){
                    System.out.print("*");
                   }
                   //spaces - 2*(n-i)
                   for(int j=1; j<=2*(n-i); j++){
                    System.out.print(" ");
                   }
                   //stars - i
                    for(int j=1; j<=i; j++){
                    System.out.print("*");
                   }
                   System.out.println();
                }
            }
    public static void main(String args[]){
        butterFly(10);
    }
} 

//Solid Rhombus
 
public class Patterns {
    public static void solidRhombus(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                 System.out.print(" ");
                }
            for(int j=1; j<=n; j++){
                 System.out.print("*");
                }
            System.out.println();
            }
        }
    public static void main(String args[]){
    solidRhombus(10);
    }
}  

//HollowRhombus


 public class Patterns {
    public static void HollowRhombus(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(2*n-i); j++) {
                 if((i+j)==6 || (i+j)==10)
                    System.out.print("*");
                else if((i==1)&&(j>n) || (i==n) && (j<n))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
             System.out.println();
        }
    }
    public static void main(String args[]){
    HollowRhombus(5);
    }
}  
