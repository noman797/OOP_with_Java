interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    private String color;
    private String breed;

    // Default Constructor
    public Duck() {
        this.color = "White";
        this.breed = "Unknown";
    }

    // Parameterized Constructor
    public Duck(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    // Setter Method
    public void setInfo(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Breed: " + breed);
    }

    @Override
    public void fly() {
        System.out.println("Duck can fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }

    public static void main(String[] args) {
        Duck d1 = new Duck(); // Default duck
        d1.display();
        d1.fly();
        d1.swim();

        System.out.println();

        Duck d2 = new Duck("Brown", "Mallard"); // Parameterized duck
        d2.display();
        d2.fly();
        d2.swim();
    }
}
