package Assigments;

import java.util.Scanner;
public class Gradecalculator {
    public static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the marks:");
        int score = in.nextInt();
        int Gradecal = score / 10;
            switch (Gradecal) {
                case 10:
                case 9:
                    System.out.println("Grade A");
                    break;
                case 8:
                    System.out.println("Grade B");
                    break;
                case 7:
                    System.out.println("Grade c");
                    break;
                case 6:
                    System.out.println("Grade D");
                    break;
                default:
                    if (score>=0 && score<60)
                    {
                        System.out.println("Grade F");
                    }
                    else{
                        System.out.println("Enter valid score");
                    }
            }
        }
    }

