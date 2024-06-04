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

        int array2[] = {10,15,20,67,30,40,50,60,70,75};
        System.out.println("\n============ Even Number's from array  =============");
        for(int i = 0; i < array2.length; i++){
            if(array2[i] % 2 == 0){
                System.out.print(array2[i] + ", ");
            }
        }
    }
}
