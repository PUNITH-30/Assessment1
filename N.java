package Assigments;

public class N {
    // Method Overloading
    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }
}

class AdvancedCalculator extends N{

    // Method Overriding
    int add(int a, int b){
        return a + b + 10;
    }

    public static void main(String[] args){
        AdvancedCalculator obj = new AdvancedCalculator();

        System.out.println(obj.add(5,3));
        System.out.println(obj.add(5,3,2));
    }
}
