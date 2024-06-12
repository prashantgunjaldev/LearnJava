package oops.inheritance.multiple;

/*
    Multiple inheritance is allowed via interface only
 */
public class Child implements IPrint, IShow {
    public void print() {
        System.out.println("Printing data in Child class");
    }

    public void show() {
        System.out.println("Showing data in Child class");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.print();
        c.show();
    }
}
