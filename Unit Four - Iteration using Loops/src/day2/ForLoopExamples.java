package day2;

public class ForLoopExamples {
   public static void main(String[] args) {
      // exampleOne();
      // exampleTwo(1, 1000);
      System.out.println(exampleThree("A B C D E"));
      

   }

   /* Introduction to for loops (counting loops) */
   private static void exampleOne() {
    /* For Loop is meant to iterate through a collection when there are indexes - like Strings. 
    For Loop is a counting loop. 
    */

    // int i = 1;
    // int sum = 0;

    // while(i <= 10) {
    //     sum += i;
    //     i++;
    // }
    int sum = 0;

    for (int i = 0; i <= 10 ; i++) { // (initialize counter; condition; increment counter)
        sum += i;
    }

    System.out.println(sum);

    // 1. initialize int i = 0;
    // 2. checks the condition i <= 10
    // 3. do the body of the for loop sum += i;
    // 4. increment i++
    // 5. checks the condition i <= 10
    // 6. do the body of the for loop sum += i;
    // 7. increment i++
    // 8. checks the condition i <= 10

   }

   /* Obtain the sum of the numbers from start to end */
   private static void exampleTwo(int start, int end) {

    int sum = 0;

    for(int i = start; i <= end; i++) {
        sum += i;
    }
    System.out.println(sum);

   }

   /* count the number of words in the sentence */
   private static int exampleThree(String sentence) {
    int numSpaces = 0;

    if (sentence.length() == 0)
        return 0;

    else if (sentence.length() < 3) //cannot have more than one word with only 2 characters
        return 1;

    else {
        for (int i = 0; i < sentence.length(); i++) { //less than length. If 5 letter word only up to 4 index. 
            if (" ".equals(sentence.substring(i, i+1))){
                numSpaces++;
            }
        }
    }

    return numSpaces + 1;

   }

}