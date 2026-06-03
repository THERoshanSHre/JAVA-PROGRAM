class Studentr{
    String name;
    int id ;
Studentr(String name, int id ){
    this.name = name ;
    this.id = id;

      
}
void display(){
    System.out.println("Name "+ name );
    System.out.println("id "+ id);
}
}
public class Arrayobj {
    public static void main(String[] args) {
        Studentr[] students = new Studentr[3];
        students[0]= new Studentr("shrawan", 0);
        students[1]= new Studentr("roshan", 1211);
        students[2]= new Studentr("prashantxprani", 2002);
        students[0].display();
        for (int i = 0 ; i<students.length; i++){
            students[i].display();
            System.out.println();
        }

    }
}
