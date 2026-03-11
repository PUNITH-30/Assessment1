package Assigments;

public class Prime {
    public static void main(String[] args) {
        int a = 2;
        boolean isPrime = true;
        if(a<=1){
            isPrime = false;
        }
        for(int i = 2;i<=Math.sqrt(a);i++){
            if(a % i == 0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}
