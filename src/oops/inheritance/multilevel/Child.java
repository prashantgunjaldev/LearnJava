package oops.inheritance.multilevel;

public class Child extends Parent {
    String javaLang = "static, multithreading, collections";

    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("Properties inherited from Super Parent");
        System.out.println(c.basicConstructs);
        System.out.println("Properties inherited from Parent");
        System.out.println(c.oppsConcepts);
        System.out.println("Self properties (to be Java Language)");
        System.out.println(c.javaLang);
    }
}
