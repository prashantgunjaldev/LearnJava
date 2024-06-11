package oops.poly.overloading;

public class Adder {
    // Same name methods
    // Number of arg are changed
    public int add(int a, int b){
        return  a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }
}
