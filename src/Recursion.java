public class Recursion {
    public static void main(String[] args) {
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");

        //Sol 1: Loop to run from 1 to 5
        //Soul 2 : recursive function that prints hello 5 times
        Recursion.print(5);

        long fact = Recursion.factorial(5);
        System.out.println("Factorial is "+ fact);
    }

    // self calling function
    public static void print(int count){
        if(count > 0) {
            System.out.println("Hello");
            Recursion.print(count - 1); // calling same function again is called as recursion
        }
    }

    public static long factorial(long number){
        // 5 => 5 * f(4)
        if(number > 0) {
            return number * Recursion.factorial(number - 1) ;
        }
        return 1;
    }
}
