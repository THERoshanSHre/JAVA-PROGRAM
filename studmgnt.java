class stdnt {
    String name;
    int id;
    char sec;

    stdnt(char sec, int id, String name) {
        this.name = name;
        this.id = id;
        this.sec = sec;
    }

    public void display() {
        System.out.println("Student sec: " + sec);
        System.out.println("Student id: " + id);
        System.out.println("Student name: " + name);
    }
}

public class studmgnt {
    public static void main(String[] args) {
        stdnt student1 = new stdnt('A', 1, "sharwan ghoni khane wala");
        stdnt student2 = new stdnt('B', 2, "sharwan ghongi na khane wala");

        student1.display();
        student2.display();
    }
}