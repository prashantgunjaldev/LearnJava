package oops.superkwd;

public class Bike extends Vehicle {
    String make = "Bajaj";
    public  Bike(){
        super("Parent Compony");
        System.out.println("Bike Constructor is called");
    }
    public void run(){
        //Call parent run method => solution use super kwd
        super.run();
        System.out.println("Bike is running");
    }

    public void make(){
        //Print parent make => solution use super kwd
        System.out.println(super.make);
        //Print Bike make => Solution use this kwd
        System.out.println(this.make);
    }
}
