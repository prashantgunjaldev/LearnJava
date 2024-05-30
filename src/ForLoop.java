public class ForLoop {
    public static void main(String arg[]){
        // Loop => to exec same code block again and again.

        // Print Hello 5 times => Loop
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");

        System.out.println("\n============ For Loop =============");
        for(int i = 0; i< 5; i++){
            System.out.println("Hello");
        }

        System.out.println("\n============ While Loop =============");
        int j = 0;
        while (j < 5){
            System.out.println("Hello");
            j++;
        }

//        System.out.println("\n============ Infinite Loop =============");
//        int k = 0;
//        while (k < 5){
//            System.out.println("Hello");
//        }

        System.out.println("\n============ For Loop =============");
        for(;;){
            System.out.println("Hello");
        }



        // Print number 1 to 10 => Loop
        //
    }
}
