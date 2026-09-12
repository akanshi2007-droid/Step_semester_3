package feature_session_6.assignment_problems;

class Employee {

    String empName;
    double salary;

    static String companyName =
        "Bright Horizon Technologies";

    static int employeeCount = 0;

    Employee(String empName, double salary) {

        this.empName = empName;
        this.salary = salary;

        employeeCount++;
    }

    static void printCompanyInfo() {

        System.out.println(
            "Company: " + companyName
        );

        System.out.println(
            "Employees: " + employeeCount
        );
    }
}

public class Assignment65 {

    public static void main(String[] args) {

        Employee e1 =
            new Employee("Divya", 65000);

        Employee e2 =
            new Employee("Arjun", 30000);

        Employee e3 =
            new Employee("Priya", 55000);

        Employee.printCompanyInfo();
    }
}