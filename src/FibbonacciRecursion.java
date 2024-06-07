public class FibbonacciRecursion {
    static int no1 = 0;
    static int no2 = 1;
    public static void main(String[] args) {
        System.out.println("Fibbinaci Sequence recursion (5) : ");
        //0 1 1 2 3 5 ....

        System.out.print(""+no1 + " ");
        System.out.print(""+no2 + " ");

        fibbo(3);
    }

    public static void fibbo(int counter){
        int no3 = no1 + no2;
        System.out.print(""+no3 + " ");

        no1 = no2;
        no2 = no3;
        if(counter > 0) {
            fibbo(counter - 1);
        }
    }

}
