package Assigments;

class MethodOverriding {
    void draw(){
        System.out.println("Drawing shape");
    }
}

class Circle extends MethodOverriding{
    void draw(){
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends MethodOverriding{
    void draw(){
        System.out.println("Drawing Rectangle");
    }

    public static void main(String[] args){
        MethodOverriding s;

        s = new Circle();
        s.draw();

        s = new Rectangle();
        s.draw();
    }
}