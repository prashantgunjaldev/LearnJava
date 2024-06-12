package abstractNinterface;

public class Honda extends Bike {

    void run(){
        System.out.println("Honda bike is running");
    }

    public static void main(String[] args) {
        Honda h = new Honda();
        h.run();
        h.print();
    }
}
