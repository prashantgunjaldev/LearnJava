package general;

public class Block {
    String name;
    //Calls before constructor while creating Obj, executes at no 2
    {
        //Initialize some variables
        name = "Amruta";
        System.out.println("Non static block");
    }

    //Calls automatically, executes at no 1
    static {
        System.out.println("Static Block");
    }

    //Calls while creating Obj, executes at no 3
    Block(){
        System.out.println("Constructor is called");
    }
    public static void main(String[] args) {
        Block b = new Block();
        Block b2 = new Block();
    }
}
