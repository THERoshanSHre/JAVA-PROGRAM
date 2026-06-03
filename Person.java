class Person{
    String name;
    Person(){
        this("Texas");
        System.out.println("Default Constructor called");
    }
    Person(String name){
        System.out.println("Name: "+name);
    }

}
public class Employee extends Person {
    Employee(){
        super(); // Calls Person's default constructor
        System.out.println("Child Constructor called");
    }
    Employee(String name){
        super(name); // Calls Person's parameterized constructor
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("College");
    }

}