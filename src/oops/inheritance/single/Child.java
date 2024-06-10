package oops.inheritance.single;

public class Child extends Parent {
    String name = "I am child";

    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("Name is : "+ c.name);
        //Via inheritance
        System.out.println("Message is : "+ c.message);
        c.print();
    }
}
