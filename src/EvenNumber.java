public class EvenNumber {
    public static void main(String arg[]){
        // Print number 1 to 10
        System.out.println("\n============ Print 1 to 10  =============");
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println("\n============ Even Number  =============");
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
