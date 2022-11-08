package day1;

public class CodingBatString2 {
    //While Loop
    // public String mixString(String a, String b) {
    //     int index = 0;
    //     int lengthA = a.length();
    //     int lengthB = b.length();
    //     int max = Math.max(lengthA, lengthB);
    //     String result = "";
        
    //     while (index < max) {
    //       if (index <= lengthA - 1){
    //         result += a.substring(index, index + 1);
    //       }
    //       if (index <= lengthB - 1)
    //         result += b.substring(index, index + 1);
    //       index++;
    //     }
        
    //     return result;
    //   }

      public String mixString(String a, String b) {
        String result = "";
        
        if (a.length() > b.length()) {
          for (int i = 0; i < a.length(); i++){
            result += a.substring(i,i+1);
            if(i < b.length())
              result += b.substring(i, i+1);
          }
        } else {
          for (int i = 0; i < b.length(); i++){
            if(i < a.length())
              result += a.substring(i,i+1);
            result += b.substring(i, i+1);
          }
          
        }
        
        return result;
      }

      public String doubleChar(String str) {
        String result = "";
        
        for(int i = 0; i < str.length(); i++){
          String current = str.substring(i,i+1);
          result += current + current;
        }
        
        return result;
      }

      public boolean sameStarChar(String str) {
        boolean sameStarChar = true;
        
        for(int i = 0; i < str.length(); i++){
          if(str.substring(i,i+1).equals("*") && i > 0 && i < str.length()-1) {
            if(str.substring(i-1,i).equals(str.substring(i+1,i+2)))
              sameStarChar = true;
            else
              sameStarChar = false;
          }
        }
        
        return sameStarChar;
        
      }
      
      public int countHi(String str) {
        int count = 0;
        
        for(int i = 0; i <= str.length()-2; i++){
          String current = str.substring(i, i+2);
          if(current.equals("hi"))
            count++;
        }
        
        return count;
        
      }

      public String repeatSeparator(String word, String sep, int count) {
  
        String result = "";
        
        for(int i = 0; i < count; i ++){
          result += word;
          
          if(i < count-1)
            result += sep;
        }
        
        return result;
      }

      public String repeatFront(String str, int n) {
  
        String result = "";
        
        for(int i = 0; i <= n; i++){
          result += str.substring(0, n - i);
        }
        
        return result;
      }
      
      
      
      
      
}
