class Parameterized {
int id;
String name;
Parameterized (int id, String name){
this.id = id;
this.name = name;
}
void display(){
System.out.println("Id: "+ id + " Name: "+name);
}
}
public class Pcons{
public static void main(String[] args){
Parameterized p1 = new Parameterized(1, "Rancho");
p1.display();
}
}