package oops;

//Abstraction => by writing getter and setter methods
public class Employee {
    //instance variable
    private String name;
    private String branch;
    private String address;

    //Default (no param passed)
    Employee(){
        System.out.println("Default Constructor called");
    }

    // Param constructor
    Employee(String name, String branch, String address){
        System.out.println("Parameterized Constructor called");
        this.name = name;
        this.branch = branch;
        this.address = address;
    }

    public void print(){
        System.out.println("Name : "+ this.name + "\nBranch : "+this.branch + "\nAddress : "+ this.address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
