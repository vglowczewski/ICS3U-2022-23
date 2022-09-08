package day2;
/**
 * Example about Escape Sequences
 * 
 * Naming Conventions:
 * folders (packages): lower case with no spaces
 * Classes: UpperCase on first letter of each word (Pascal Case)
 * methods/functions (variables): camelCase all lower case except the first letter of each word except the first word.
 * 
 * Constants: ALL upper case _ to distinguish words NUM_STUDENTS 
 */
public class ExampleTwo {
    public static void main(String[] args) {

        //We must escape the " inside the round brackets because " quotes have meaning in Java, ' single quotes have no meaning
        // \ backslash used to escape a character's regular meaning.
        System.out.println("Computer Science is the \"Best\" Course Ever");

        // there are a small subset of characters that can be escaped.
        // BUT the AP Exam will only test you on 3 of them \\ \" \n
      
        // To display a backslash you must escape it. Will need to double up. 
        System.out.println("This is \\\\a test.");

        System.out.print("ABCD\nEFGHIJK");
    }
}
