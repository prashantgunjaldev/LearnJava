public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Check is number is Armstrong or not");

        // 153 => (1*1*1) + (5*5*5) + (3*3*3) = 153
        // Addition of cube of individual digit should be equal to original number

        long number = 153;

//        System.out.println("Last Digit = "+ (number % 10));
//        System.out.println("Remove last digit = "+ (number / 10));

        // loop until last digit is left
        // calculate cube of individual digit
        // keep addition in new number
        long originalNo = number;
        long newNo = 0;

        // Usefule since we know number is 3 digit
//        for(int i=0;i<3;i++){
//            long lastDigit = number % 10;
//            long cubeOfLastDigit = lastDigit * lastDigit* lastDigit;
//            newNo = newNo + cubeOfLastDigit;
//            number = number /10;
//            System.out.println("Number "+number);
//        }


        //Infinite loop
        for(;;){
            long lastDigit = number % 10;
            long cubeOfLastDigit = lastDigit * lastDigit* lastDigit;
            newNo = newNo + cubeOfLastDigit;
            number = number /10;
            //Break when no becomes zero
            if(number == 0){
                break;
            }
        }

        if(originalNo == newNo){
            System.out.println("Number is armstrong");
        }else{
            System.out.println("Number is NOT armstrong");
        }
    }
}
