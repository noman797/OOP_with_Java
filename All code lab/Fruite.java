import java.util.Scanner;

class Fruit {
    private String color;
    private int size;
    private String text;

    public void getInfo(String color, int size, String text) {
        this.color = color;
        this.size = size;
        this.text = text;
    }

    public void display() {
        System.out.println("Color is : " + color);
        System.out.println("Size is : " + size);
        System.out.println("Text is : " + text);
    }
}

class Mango extends Fruit {
    private String varities;

    public void setvarities(String varities) {
        this.varities = varities;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Varities : " + varities);
    }
}

public class Fruite {
    public static void main(String[] args) {
        Mango mg = new Mango();

        System.out.println("Enter the information : ");

        Scanner in1 = new Scanner(System.in);
        String color = in1.nextLine();
        Scanner in2 = new Scanner(System.in);
        int size = in2.nextInt();
        Scanner in3 = new Scanner(System.in);
        String text = in3.nextLine();
        Scanner in4 = new Scanner(System.in);
        String varities = in4.nextLine();

        mg.getInfo(color, size, text);
        mg.setvarities(varities);
        mg.display();
    }
}