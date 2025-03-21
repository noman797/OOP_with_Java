import java.util.Scanner;

public class Student {

    private int studentId;
    private String studentName;
    private double balance;

    // Constructor to initialize student details
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.balance = 0.0; // Initialize balance
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
            System.out.println("\nAmount Deposited: " + amount);
        } else {
            System.out.println("\nInvalid deposit amount. Please enter a positive value.");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("\nStudent ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();

        sc.nextLine(); // Consume newline

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Deposit Amount: ");
        double depositAmount = sc.nextDouble();

        // Create Student object with user input
        Student s1 = new Student(studentId, studentName);

        // Deposit amount
        s1.deposit(depositAmount);

        // Display balance
        s1.displayBalance();

        sc.close();
    }
}