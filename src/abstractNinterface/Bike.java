package abstractNinterface;

public abstract class Bike {
    abstract void run();

    //Allowed to write non abstract methods
    void print(){
        System.out.println("Bike class with Print method");
    }
}
