package _1_introToJava.oopConcepts;

public class AbstractionEngineer {
    private String firstName;
    private String lastName;
    private double salary;

    public AbstractionEngineer(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double amount){
        if(amount<0)return;
        this.salary-=amount;
    }

    public void designSoftware(){
        System.out.println("The engineer is designing software:\t" + this.firstName);
    }

    public void implementCode(){
        System.out.println("The engineer is implementing code:\t" + this.lastName);
    }
}
