package Assigments;
import java.util.Scanner;
public class Numbers {
    public static void main() {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the first number:");
        a=in.nextInt();
        System.out.println("Enter the second number:");
        b=in.nextInt();
        System.out.println("Enter the third number:");
        c=in.nextInt();
        if(a>b && a>c){
            System.out.println("A is the largest number");
        }
        else if(b>a && b>c){
            System.out.println("B is the greatest number");
        }
        else {
            System.out.println("C is the greatest number");
        }
    }
}
