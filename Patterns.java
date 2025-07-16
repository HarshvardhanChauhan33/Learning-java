
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