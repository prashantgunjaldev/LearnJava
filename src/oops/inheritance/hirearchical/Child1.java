package oops.inheritance.hirearchical;

public class Child1 extends Parent {
    String name = "I am child1";

    public static void main(String[] args) {
        Child1 c = new Child1();
        System.out.println("Name is : "+ c.name);
        //Via inheritance
        System.out.println("Message is : "+ c.message);
        c.print();
    }
}
