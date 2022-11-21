package day3;

public class NestedLoops {
   public static void main(String[] args) {
      // box(6, 5);

      framingSquares(3, 4, 1, 2);

   }

   private static void framingSquares(int M, int N, int P, int Q) {

      // top frame
      for (int j = 0; j < Q; j++) {
         for (int i = 0; i < 2 * Q + 2 * P + N; i++) {
            System.out.print("#");
         }
         System.out.println();
      }

      // top matting
      for (int j = 0; j < P; j++) {
         // row of matting
         for (int i = 0; i < Q; i++) {
            System.out.print("#");
         }
         for (int i = 0; i < 2 * P + N; i++) {
            System.out.print("+");
         }
         for (int i = 0; i < Q; i++) {
            System.out.print("#");
         }
         System.out.println();
      }

      for (int i = 0; i < M; i++) {
         for (int j = 0; j < Q; j++) {
            System.out.print("#");
         }
         for (int j = 0; j < P; j++) {
            System.out.print("+");
         }

         for (int j = 0; j < N; j++) {
            System.out.print(".");
         }

         for (int j = 0; j < P; j++) {
            System.out.print("+");
         }

         for (int j = 0; j < Q; j++) {
            System.out.print("#");
         }

         System.out.println();
      }

      // bottom matting
      for (int j = 0; j < P; j++) {
         // row of matting
         for (int i = 0; i < Q; i++) {
            System.out.print("#");
         }
         for (int i = 0; i < 2 * P + N; i++) {
            System.out.print("+");
         }
         for (int i = 0; i < Q; i++) {
            System.out.print("#");
         }

         System.out.println();
      }

      // bottom frame
      for (int j = 0; j < Q; j++) {
         for (int i = 0; i < 2 * Q + 2 * P + N; i++) {
            System.out.print("#");
         }
         System.out.println();
      }
   }

   /*
    * if width = 3 and height = 4
    ***
    ***
    ***
    ***
    * 
    * 
    */
   private static void box(int width, int height) {

      // print height number of rows
      for (int row = 0; row < height; row++) {
         // print 1 row
         // responsible for printing the columns in a row
         for (int col = 0; col < width; col++) {
            System.out.print("*");
         }
         System.out.println();

      }
   }
}