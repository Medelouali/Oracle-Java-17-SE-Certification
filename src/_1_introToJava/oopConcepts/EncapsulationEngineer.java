package _1_introToJava.oopConcepts;

public class EncapsulationEngineer {
    private String firstName;
    private String lastName;
    private double salary;
    private final double ratio=0.01;


    // This method illustrates the principle of encapsulation it's
    // an intermediate method to compute salary,it's not needed outside
    // the class
    private double computeStateAmountToReduceFromSalary(){
        return this.salary*Math.pow(10, this.ratio*100);
    }
    public double getSalary() {
        return salary-this.computeStateAmountToReduceFromSalary();
    }
}
