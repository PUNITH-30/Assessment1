package Assigments;

public class StudentConstructor {
    int id;
    String name;

    StudentConstructor(){
        id = 0;
        name = "Unknown";
    }

    StudentConstructor(int i, String n){
        id = i;
        name = n;
    }

    void display(){
        System.out.println(id + " " + name);
    }

    public static void main(String[] args){
        StudentConstructor s1 = new StudentConstructor();
        StudentConstructor s2 = new StudentConstructor(101,"John");

        s1.display();
        s2.display();
    }
}
