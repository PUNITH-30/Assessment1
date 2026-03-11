package Assigments;

import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number whose multiplication table has to be displayed:");
        int n = in.nextInt();
        System.out.printf("The multiplication table for %d:\n",n);
        for(int i=1;i<=10;i++)
        {
            int c = n*i;
            System.out.println(c);
        }
    }
}
