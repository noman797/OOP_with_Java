import java.util.Scanner;

class Manager {
    private String name;
    private String housWorked;
    private int payment;

    public void getInfo(String name, String housWorked, int payment) {
        this.name = name;
        this.housWorked = housWorked;
        this.payment = payment;
    }

    public void display() {
        System.out.println("Name is : " + name);

        System.out.println("HousWorked is : " + housWorked);
        System.out.println("Payment is : " + payment);
    }
}

class Worker extends Manager {
    private String name;
    private String housWorked;
    private int payment;

    @Override
    public void display() {

        System.out.println("Payment is : " + payment);
    }

}

public class Employee {
    public static void main(String[] args) {
        Worker mg = new Worker();

        System.out.println("Enter the information : ");

        Scanner in1 = new Scanner(System.in);
        String n = in1.nextLine();

        Scanner in2 = new Scanner(System.in);
        String h = in2.nextLine();
        Scanner in3 = new Scanner(System.in);
        int p = in3.nextInt();

        mg.getInfo(n, h, p);

        mg.display();
    }
}