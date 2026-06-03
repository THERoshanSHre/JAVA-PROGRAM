class Student {
    int id;
    String name;

    void insertRecord(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Teststd {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.insertRecord(10, "Faran");   // ← This must be correct
        s1.display();
    }
}