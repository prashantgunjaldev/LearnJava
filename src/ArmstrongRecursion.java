public class ArmstrongRecursion {
    static long number = 153;
    static long originalNo = number;
    static long newNo = 0;
    public static void main(String[] args) {
        isArmstrong();

        if(originalNo == newNo){
            System.out.println("Number is armstrong");
        }else{
            System.out.println("Number is NOT armstrong");
        }

    }

    public static void isArmstrong(){
        long lastDigit = number % 10;
        long cubeOfLastDigit = lastDigit * lastDigit* lastDigit;
        newNo = newNo + cubeOfLastDigit;
        number = number /10;
        //Break when no becomes zero
        if(number != 0){
            isArmstrong();
        }
    }
}
