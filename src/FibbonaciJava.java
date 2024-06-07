public class FibbonaciJava {

    public static void main(String[] args) {
        System.out.println("Fibbinaci Sequence (5) : ");
        //0 1 1 2 3 5 ....
        int no1 = 0;
        int no2 = 1;
        System.out.print(""+no1 + " ");
        System.out.print(""+no2 + " ");

        for(int i=2; i<= 5; i++){
            int no3 = no1 + no2;
            System.out.print(""+no3 + " ");

            no1 = no2;
            no2 = no3;
        }
    }
}
