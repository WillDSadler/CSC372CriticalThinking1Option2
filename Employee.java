public class Employee {
    private String firstName;
    private String lastName;
    private int employeeID;
    private double salary;

    public Employee() {
        this.salary = 0.0;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getEmployeeID() {
        return this.employeeID;
    }

    public double getSalary() {
        return this.salary;
    }

    public void employeeSummary() {
        System.out.println("Employee Summary:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: $" + salary);
    }
}
