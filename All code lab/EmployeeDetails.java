
import java.util.Scanner;

public class EmployeeDetails {

    private String name;
    private int empId;
    private double salary;

    // Method to set employee details
    public void setInfo(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    // Method to display employee details
    public void display() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + empId);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeDetails emp = new EmployeeDetails();

        // Get user input
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        // Set and display employee details
        emp.setInfo(name, id, salary);
        emp.display();

        // Display predefined employee details
        emp.setInfo("Noman", 23215797, 200000.0);
        emp.display();

        scanner.close();
    }
}
