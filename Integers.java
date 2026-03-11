package Assigments;

import java.util.Scanner;
public class Integers {
    public static void main() {
        int n;
        Scanner i = new Scanner(System.in);
        System.out.println("Enter a number:");
        n=i.nextInt();
        if(n >0){
            System.out.println("Positive");
        }
        else if(n < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}
