public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setFirstName("John");
        emp.setLastName("Doe");
        emp.setEmployeeID(101);
        emp.setSalary(50000);
        emp.employeeSummary();

        System.out.println();

        Manager mgr = new Manager();
        mgr.setFirstName("Jane");
        mgr.setLastName("Smith");
        mgr.setEmployeeID(202);
        mgr.setSalary(85000);
        mgr.setDepartment("Engineering");
        mgr.employeeSummary();
    }
}
