class studentr{
    String name ;
    int id;
    studentr(String name){
System.out.println ("Student Name : " + name );

    }
    studentr (int id){
        System.out.println("Student Id :" + id );

    }
    studentr (String name , int id ){
        System.out.println("Name : "+ name+ "ID: " + id );
    }
}
public class consoverload{
    public static void main(String[] args) {
        studentr s1 = new studentr(123);
        studentr s2 = new studentr(122);
        studentr s = new studentr ("Texas ");
        studentr s3 = new studentr ("Texas",123);

        
    }
}