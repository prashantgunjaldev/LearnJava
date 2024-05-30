public class PrintStars {
    public static void main(String arg[]){

        System.out.println("\n============ Start Printing  =============");
        for(int i = 1; i < 5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
