package oops;

public class StaticExample {
    //Anyone can access it from outside without creating object of this (StaticExample) class
    // How ?
    // StaticExample.sharedVariable  => (<classname>.<varname>)
    static String sharedVariable = "Some shared string";

    //Non static var
    //StaticExample.name => XXXX not allowed.
    String name = "Abc";

    //Anyone can access it from outside without creating object of this (StaticExample) class
    // StaticExample.print()  => (<classname>.<methodname()>)
    static void  print(){
        //Static method using static variable
        System.out.println("Static var value is : "+ sharedVariable);

        //static using NON (X) static variable
        //Not allowed XXXX
        // Rule: Static method can access only static variables
        //System.out.println("Static var value is : "+ name);
    }

}
