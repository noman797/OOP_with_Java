class Main {
    String name;
    int roll_no;

    public void printData()
    {
        System.out.println(name);
        System.out.println(roll_no);
    }

    public static void main(String[] args) {
        Main std1 = new Main();
        Main std2 = new Main();
        std1.name = "Noman";
        std1.roll_no=797;
        std1.printData();

        std2.name="Lamia";
        std2.roll_no=042;
        std2.printData();


    }
}