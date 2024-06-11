package oops.poly.overloading;

public class AdderType2 {

    // method name is same
    // no of arg are also same
    // data type of arg is changed
    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }

    public String add(String a, String b){
        return a + b;
    }
}
