package week6;

/**
 * Category C Problem M5: Employee and Company Information Management
 * 
 * Scenario:
 * Demonstrate static fields companyName and employeeCount shared across Employee instances.
 */
public class EmployeeCompanyInfoManagement {

    public static class Employee {
        private String empName;
        private double salary;
        public static String companyName = "Bright Horizon Technologies";
        public static int employeeCount = 0;

        public Employee(String empName, double salary) {
            this.empName = empName;
            this.salary = salary;
            employeeCount++;
        }

        public static void printCompanyInfo() {
            System.out.println(companyName);
            System.out.println("Employees on record: " + employeeCount);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("John", 50000);
        Employee e2 = new Employee("Sarah", 60000);
        Employee e3 = new Employee("Michael", 55000);

        Employee.printCompanyInfo();
    }
}
