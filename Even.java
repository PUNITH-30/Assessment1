package Assigments;

public class Even {
    public static void main() {
        int i = 2;
        int sum = 0;
        while(i<=100){
            sum = sum + i;
            i = i + 2;
        }
        System.out.println(sum);
    }
}
