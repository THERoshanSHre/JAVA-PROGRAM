class Model {
    int modelNumber;
    String modelName;

    Model() {}

    Model(int num, String name) {
        this.modelNumber = num;
        this.modelName = name;
    }

    void insertRecord(int num, String name) {
        this.modelNumber = num;
        this.modelName = name;
    }

    void display() {
        System.out.println("Car Model Number: " + modelNumber + " Name: " + modelName);
    }
}

public class car {
    public static void main(String[] args) {

        Model m1 = new Model();
        m1.modelNumber = 10001111;
        m1.modelName = "Audi";
        m1.display();

        Model m2 = new Model();
        m2.insertRecord(1000111, "BMW");
        m2.display();

        Model m3 = new Model(1000, "Mercedes");
        m3.display();
    }
}