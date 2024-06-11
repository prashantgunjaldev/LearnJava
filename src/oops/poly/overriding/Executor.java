package oops.poly.overriding;

public class Executor {
    // Overriding = Run time polymorph = late binding
    public static void main(String[] args) {

        //Original parent => No method overriding
        Vehicle v = new Vehicle();
        v.run();

        // Child class with overriding, output will be from new method
        Car car = new Car();
        car.run();

        // Child class with overriding, output will be from new method
        Bike bike = new Bike();
        bike.run();


    }
}
