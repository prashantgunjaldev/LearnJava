public class LearnString {
    public static void main(String[] args) {
        //String Constant Pool => reusable string memory
        // if same string is used then create it only once and then use it (again and again)

        String name1 = "Amruta";
        System.out.println("Name in string is " + name1);

        String name2 = new String("Amruta");

        System.out.println("Name in string is " + name2);

        String name3 = "Amruta";

        System.out.println("Name in string is " + name3);
        if(name1 == name2){ //yields false
            System.out.println("Name1 and name2 is same");
        }
        if(name2 == name3){ //yields false
            System.out.println("Name2 and name3 is same");
        }
        if(name3 == name1){ //yields true
            System.out.println("Name1 and name3 is same");
        }


        // == checks memory location is same or not.

        // hence to check string is equal or not use equals method

        if(name1.equals(name2)){
            System.out.println("Name1 and name2 is having same value");
        }
        if(name2.equals(name3)){
            System.out.println("Name2 and name3 is having same value");
        }
        if(name3.equals(name1)){
            System.out.println("Name1 and name3 is having same value");
        }

    }
}
