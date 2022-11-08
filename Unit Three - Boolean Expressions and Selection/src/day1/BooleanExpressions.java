package day1;

public class BooleanExpressions {
    public static void main(String[] args) {
      // mathematical expression evaluate to a number
      // logical and boolean expressions evaluate to TRUE and/or FALSE

      // Logical Operators: >, <, >=, <=, ==, !=
      System.out.println(6 < 9); // true
      System.out.println(7 != 8); // true
      boolean test = 7 >= 9; // test will be assigned false
      System.out.println(!test);  // !false = true

      boolean isHarder = (7>3) == ("red".equals("blue")); // true == false = false
      boolean isNotAsHard = (9 <= 3) != (5 == 7); // false != False = false

      // Compound Boolean Expressions
      // AND (&&), OR (||), NOT (!)

      boolean isRed = true;
      boolean isBig = true;
      boolean isDog = true;

      boolean isClifford = isRed && isBig && isDog;

      // && required both side to be true for it to be true
      System.out.println(true && true); // true
      System.out.println(true && false); // false
      System.out.println(false && true); // false
      System.out.println(false && false); // false

      String str = null; //does not have an actual string object

      // short circuit check for null before calling length method
      boolean exp = str != null && str.length() > 3;

      // || either must be true to be true
      System.out.println(true || true); // true
      System.out.println(true || false); // true
      System.out.println(false || true); // true
      System.out.println(false || false); // false

    }
}