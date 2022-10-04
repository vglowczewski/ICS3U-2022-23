package day1;

public class ExampleTwo {
    public static void main(String[] args) {

        //* s1, s2, s3 were declared using the String constructor */
        String s1 = new String("happy");
        String s2 = new String("happy");
        String s3 = new String("Happy");
        /* s4, s5 were declared using String literals */
        String s4 = "happy";
        String s5 = "happy";
        int x = 7;
        int y = 7;

        System.out.println(s1 == s2); //false
        System.out.println(x == y); //true

        //Equals method. Compares the actual objects, does not check the box. 
        System.out.println(s1.equals(s2)); //true equals method

        System.out.println(s2.equals(s3)); //false. Capitals are taken into account.

        System.out.println(s4 == s5); // true (String literals are special and have the same address)

        System.out.println(s1 == s4); // false. They are in different memory locations. 
    }
}
