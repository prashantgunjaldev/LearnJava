package abstractNinterface;

public class Rectangle implements IPrintable{
    public void print(){
        System.out.println("Printing Rectangle");
    }

    public static void main(String[] args) {
        new Rectangle().print();
    }
}
