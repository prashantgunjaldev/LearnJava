public class Conditions {
    public static void main(String arg[]){


        int age = 21;

        // if else
        if(age >= 18){
            System.out.println("Congrats, you are eligible for voting");
        }else {
            System.out.println("Sorry, you are NOT eligible for voting you can try after " + (18 - age) + " year");
        }

        //Nested if else
        //age >= 18 && that person should be registered voter
        boolean isRegistered = true;
        if(age >= 18){
            if(isRegistered){
                System.out.println("GO ahead and vote");
            }else{
                System.out.println("Opps, you need to register first.");
            }
        }else {
            System.out.println("Sorry, you are NOT eligible for voting you can try after " + (18 - age) + " year");
        }

        // Assumption
        // var day is int and values , 0 = Sunday, 1 = Monday, 2 = Tue ... 6 = Sat

        int day = 1;

        if(day == 0){
            System.out.println(" Day is Sun");
        }else if(day == 1){
            System.out.println(" Day is Mon");
        }else if(day == 2){
            System.out.println(" Day is Tue");
        }else if(day == 3){
            System.out.println(" Day is Wed");
        }else if(day == 4){
            System.out.println(" Day is Thu");
        }else if(day == 5){
            System.out.println(" Day is Fri");
        }else if(day == 6){
            System.out.println(" Day is Sat");
        }else{
            System.out.println(" Wrong value");
        }

        // Alrenate for such code Switch

        switch (day){
            case 0 :
                System.out.println("InSwitch Day is Sun");
                break;
            case 1 :
                System.out.println("InSwitch Day is Mon");
                break;
            case 2 :
                System.out.println("InSwitch Day is Tue");
                break;
            case 3 :
                System.out.println("InSwitch Day is Wed");
                break;
            case 4 :
                System.out.println("InSwitch Day is Thu");
                break;
            case 5 :
                System.out.println("InSwitch Day is Fri");
                break;
            case 6 :
                System.out.println("InSwitch Day is Sat");
                break;
            default:
                System.out.println("InSwitch Wrong value");
        }

    }
}
