public class Factorial {
    public static void main(String arg[]){

        System.out.println("\n============ Factorial  =============");
//        What is the factorial of 5 => 1*2*3*4*5
//        What is the factorial of 3 => 1*2*3
//        What is the factorial of 7 => 1*2*3*4*5*6*7
        int factorial = 1;
        for(int i = 1; i <= 7; i++){
            factorial = factorial * i;
            //Above calculation can be done with below line
            //factorial *= i;
            System.out.print(""+i+"*");
        }
        System.out.println("\nFactorial is = "+ factorial);


        factorial = 1;
        for(int i = 7; i > 0; i--){
            factorial = factorial * i;
            System.out.print(""+i+"*");
        }
        System.out.print("\nFactorial is = "+ factorial);
    }
}
