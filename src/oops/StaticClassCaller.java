package oops;

public class StaticClassCaller {
    static{System.out.println("**static block is called");}

    public static void main(String[] args) {
        System.out.println("Main method is called");
        System.out.println(StaticExample.sharedVariable);

        StaticExample.print();

        //Not allowed to access name (NOT Static) directly
        //System.out.println(StaticExample.name);

        //How ?
        // Create object and then access it , like below
        StaticExample obj = new StaticExample();
        //Access non static var
        System.out.println(obj.name);
        //Check if shared var value is same for  this obj or not
        System.out.println(obj.sharedVariable);
        System.out.println(StaticExample.sharedVariable);


    }
}
