public class Veterinarian extends Employee{
    private int amount;
    private String name;
    private String employeeID;


    public Employee(int amount, String name, String employeeID){
        this.amount = amount;
        this.name   = name;
        this.employeeID = employeeID;
    }
}
