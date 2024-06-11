package oops.poly.overloading;

public class Executor {
    // Overloading = compile time polymorph = early binding
    public static void main(String[] args) {
        System.out.println("\nMethod Overloading with changed no of arg");
        Adder obj = new Adder();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20, 30));

        System.out.println("\nMethod Overloading with changed data type");
        AdderType2 obj2 = new AdderType2();
        System.out.println(obj2.add(10,20));
        System.out.println(obj2.add(10.5,20.5));
        System.out.println(obj2.add("Amruta ","Phatangare"));

    }
}
