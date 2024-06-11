package oops.superkwd;

public class Vehicle {
    String make;
    public Vehicle(String make){
        System.out.println("Vehicle Constructor is called");
        this.make = make;
    }
    public void run(){
        System.out.println("Some vehicle is running");
    }
}
