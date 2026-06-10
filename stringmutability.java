public class stringmutability {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("original String : " + str);
        System.out.println(" Memory address Before : " + System.identityHashCode(str));
        //Attempt to modify strnig
        str.concat("World");
        System.out.println("After concat() without assigment");
        System.out.println("string : " + str);
        System.out.println("memory address" + System.identityHashCode(str));
        //Assign the result to str
        str = str.concat ("world");
        System.out.println("After concat() without assigment");
        System.out.println("string : " + str);
        System.out.println("memory address" + System.identityHashCode(str));
    }
    
}
