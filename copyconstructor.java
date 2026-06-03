class Geeks{
String name;
int id;
Geeks(String name, int id){
    this.name = name;
    this.id = id;
}
Geeks(Geeks obj ){
    this.name =  obj.name;
    this.id = obj.id ;

}
    
}
public class copyconstructor{
    public static void main(String[] args) {
        Geeks geek1 = new Geeks("texas ",2);
        System.out.println("Name: "+geek1.name + "Id: "+ geek1.id);
        Geeks geek2= new Geeks(geek1);
        System.out.println ( "2nd Name: " +geek2.name + "2nd Id : "+geek2.id);

    }
}
