class std{
    private int id;
    private String Name;
    private String field ;

    std(int id, String name, String field){
        this.id=id;
        this.Name= name;
        this.field= field;

    }
    public void display(){
        System.out.println("student id  :   "+id);
        System.out.println("student  name :  "+Name);
        System.out.println("student field :  "+field);

    }
}
public class studentt{
    public static void main(String[]args){
std student1  = new std(1,"ushal","bit");
std student2 = new std(2, "prashant ", "bcs");
std student3 = new std(3, "shrawan", "bca");
student1.display();
student2.display();
student3.display();
    }
}