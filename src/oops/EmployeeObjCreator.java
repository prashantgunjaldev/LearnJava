package oops;

public class EmployeeObjCreator {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        //Below line is not allowed , because of abstraction => hiding complex functionality
        //System.out.println(e1.name);
        // how to access ?
        System.out.println(e1.getName());
        System.out.println(e1.getAddress());
        System.out.println(e1.getBranch());

        System.out.println("Lets assign some values");
        e1.setName("Amruta");
        e1.setAddress("Sangamner");
        e1.setBranch("Computer");

        System.out.println("After values are set");

        System.out.println(e1.getName());
        System.out.println(e1.getAddress());
        System.out.println(e1.getBranch());
    }
}
