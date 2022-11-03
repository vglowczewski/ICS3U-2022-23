package day3;

public class CodingBatString1 {
    //theEnd
    public String theEnd(String str, boolean front) {
        if (front)
          return str.substring(0,1);
        else
          return str.substring(str.length() - 1);
      }
    
    //lastChars
    public String lastChars(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        if (aLength == 0)
          a = "@";
        if (bLength == 0)
          b = "@";
        
        return a.substring(0,1) + b.substring(b.length()-1);
      }
    
    //endsLy
    public boolean endsLy(String str) {
        int length = str.length();
        String ly = "ly";
      
        if (length < 2)
          return false;
        else if (ly.equals(str.substring(str.length()-2)))
          return true;
        else
          return false;
      }
    
    //extraFont
    public String extraFront(String str) {
      if (str.length() >=2) {
        String newStr = str.substring(0,2);
        return newStr + newStr + newStr;
      }
      else
        return str + str + str;
    
    }
    //withoutEnd
    public String withoutEnd(String str) {
      return str.substring(1,str.length()-1);
    }

    //withoutEnd2
    public String withouEnd2(String str) {
      if (str.length() <= 2)
        return "";
      else
        return str.substring(1,str.length()-1);
    }

    //hasBad
    public boolean hasBad(String str) {
      if (str.length() <= 2) 
        return false;
      else if (str.indexOf("bad") == 0 || str.indexOf("bad") == 1)
        return true;
      else
        return false;
      
    }
    
        
    
      
}
