import java.util.*;

class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void display() {
        System.out.println("Name of Teacher: " + name);
        System.out.println("Allotted Subject: " + subject);
    }
}

class Classroom {
    private String name;
    private Teacher teacher; // One-to-one relationship

    public Classroom(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public void display() {
        System.out.println("Classroom Name: " + name);
        if (teacher != null) {
            teacher.display();
        } else {
            System.out.println("No teacher assigned.");
        }
    }
}

class School {
    private String name;
    private ArrayList<Classroom> cls;

    public School(String name) {
        this.name = name;
        this.cls = new ArrayList<>();
    }

    public void addCls(Classroom c) {
        cls.add(c);
    }

    public void display() {
        System.out.println("School Name: " + name);
        for (Classroom c : cls) {
            c.display();
        }
    }
}

public class Association {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Jahidul", "CSE221");
        Classroom c1 = new Classroom("A4 Building", t1); // Assigning a teacher directly
        School s1 = new School("Daffodil International School");

        s1.addCls(c1);
        s1.display();
    }
}