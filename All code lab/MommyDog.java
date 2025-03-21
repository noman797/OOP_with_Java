import java.util.ArrayList;

class BabyDog {
    private String name;

    public BabyDog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class MommyDog {
    private String name;
    private ArrayList<BabyDog> babyDogs;

    public MommyDog(String name) {
        this.name = name;
        this.babyDogs = new ArrayList<>();
    }

    public void addBaby(BabyDog baby) {
        babyDogs.add(baby);
    }

    public void display() {
        System.out.println(name + "'s babies:");
        for (BabyDog baby : babyDogs) {
            System.out.println(baby.getName());
        }
    }

    public static void main(String[] args) {
        MommyDog mother = new MommyDog("Lucy");

        BabyDog baby1 = new BabyDog("Buddy");
        BabyDog baby2 = new BabyDog("Doggy");

        mother.addBaby(baby1);
        mother.addBaby(baby2);

        mother.display();
    }
}
