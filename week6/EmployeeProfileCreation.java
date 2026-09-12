package week6;

/**
 * Category C Problem M3: Employee Profile Creation
 * 
 * Scenario:
 * Support both permanent employees and interns without writing setup logic twice
 * using constructor chaining this(...).
 */
public class EmployeeProfileCreation {

    public static class Employee {
        private String empId;
        private String empName;
        private double salary;
        private boolean isIntern;

        public Employee(String empId, String empName, double salary) {
            this.empId = empId;
            this.empName = empName;
            this.salary = salary;
            this.isIntern = false;
        }

        public Employee(String empId, String empName) {
            this(empId, empName, 0.0);
            this.isIntern = true;
        }

        public void printProfile() {
            System.out.printf("%s | %s | Rs %.1f | Intern: %b%n", empId, empName, salary, isIntern);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("E-101", "Divya", 65000);
        Employee e2 = new Employee("E-102", "Arjun");

        e1.printProfile();
        e2.printProfile();
    }
}
