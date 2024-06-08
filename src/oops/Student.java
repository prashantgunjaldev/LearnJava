package oops;

//Class, Object & Encapsulation
public class Student {
    int rollNo;
    String name;
    String branch;
    String address;
    public static void main(String[] args) {
        //Create object
        Student s1 = new Student();

        System.out.println(s1.rollNo);
        System.out.println(s1.name);
        System.out.println(s1.branch);
        System.out.println(s1.address);

        System.out.println("After assigning some value");
        // Value assign
        s1.name = "Amruta";
        s1.branch = "IT";
        s1.address = "Sangamner";
        s1.rollNo = 1;

        System.out.println(s1.rollNo);
        System.out.println(s1.name);
        System.out.println(s1.branch);
        System.out.println(s1.address);

    }
}
