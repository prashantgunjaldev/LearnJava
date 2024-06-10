package oops.inheritance.hirearchical;

public class Child2 extends Parent {
    String name = "I am child2";

    public static void main(String[] args) {
        Child2 c = new Child2();
        System.out.println("Name is : "+ c.name);
        //Via inheritance
        System.out.println("Message is : "+ c.message);
        c.print();
    }
}
