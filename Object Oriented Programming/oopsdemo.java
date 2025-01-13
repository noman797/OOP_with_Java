class Student 
{
    String name;
    int roll_no;
    String address;

}

public class oopsdemo {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name="Noman";
        std1.roll_no=797;
        std1.address="Kushtia";

        System.out.println(std1.name);
        System.out.println(std1.roll_no);
        System.out.println(std1.address);
    }
}
