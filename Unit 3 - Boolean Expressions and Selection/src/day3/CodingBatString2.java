package day3;

public class CodingBatString2 {
    public boolean xyzThere(String str) {
        int index = 0;
        boolean xyz = false;
        boolean noDot = false;
        
        while(index <= str.length() - 3){
          if(str.substring(index, index + 3).equals("xyz"))
            xyz = true;
            if(index != 0){
              if((str.substring(index-1, index).equals(".")) && str.substring(index, index + 3).equals("xyz"))
                noDot = false;
              else
                noDot = true;
          }
          else if(index == 0)
            if(!(str.substring(0,1).equals(".")))
              noDot = true;
          index++;
        }
            if(xyz && noDot)
            return true;
            else 
            return false;
      }
      
}
