//Inheritance with Poly

import java.util.Scanner;

class Employee {
    private String name;
    private double hoursWorked;

    public String getName() {
        return name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void cal() {
        System.out.println("Salary calculation not defined.");
    }
}

class Manager extends Employee {
    public static final double RATE = 100;

    @Override
    public void cal() {
        double salary = RATE * getHoursWorked();
        System.out.println(getName() + "'s Salary: " + salary);
    }
}

class Worker extends Employee {
    public static final double RATE = 50;

    @Override
    public void cal() {
        double salary = RATE * getHoursWorked();
        System.out.println(getName() + "'s Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter total hours worked: ");
        double hoursWorked = sc.nextDouble();
        sc.nextLine(); // Consume newline

        System.out.print("Enter role (Manager/Worker): ");
        String role = sc.nextLine();

        Employee emp;
        if (role.equalsIgnoreCase("Manager")) {
            emp = new Manager();
        } else if (role.equalsIgnoreCase("Worker")) {
            emp = new Worker();
        } else {
            System.out.println("Invalid role! Please enter 'Manager' or 'Worker'.");
            sc.close();
            return;
        }

        emp.setName(name);
        emp.setHoursWorked(hoursWorked);
        emp.cal();

        sc.close();
    }
}
