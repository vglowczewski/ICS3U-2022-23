package day1;

public class CodingBatLogic1 {
  //Love6
    public boolean love6(int a, int b) {
        if (a == 6 || b == 6)
          return true;
          
        if ((a+b) == 6)
          return true;
        
        if (Math.abs(a-b) == 6)
          return true;
          
        return false;
      }
  // Cigar Party
      public boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars >= 40 && cigars <= 60){
          return true;
        } else if (isWeekend && cigars >= 40){
          return true;
        }
        return false;
      }
  // Caught Speeding
      public int caughtSpeeding(int speed, boolean isBirthday) {
        if (speed <= (60 + 5) && isBirthday){
          return 0;
        } else if (speed >= (61 + 5) && speed <= (80 + 5) && isBirthday){
          return 1;
        }
        
        if (speed <= 60){
          return 0;
        } else if(speed >= 61 && speed <= 80){
          return 1;
        } else {
          return 2;
        }
      }
  // More 20
      public boolean more20(int n) {
        if((n % 20 == 1) || (n % 20 == 2)){
          return true;
        }
        return false;
      }  
  // Near Ten
      public boolean nearTen(int num) {
        if ((num % 10 == 0) || (num % 10 == 1) || (num % 10 == 2) || (num % 10 == 8) || (num % 10 == 9)){
          return true;
        }
        return false;
      }
  // teaParty
      public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5)
          return 0;
        if(tea >= (candy * 2) || candy >= (tea * 2) )
          return 2;
        else
          return 1;
      }
  // twoAsOne
      public boolean twoAsOne(int a, int b, int c) {
        if (a+b == c)
        return true;
        else if (b+c == a)
        return true;
        else if (a+c == b)
        return true;
        else
        return false;
      }
  // lastDigit
      public boolean lastDigit(int a, int b, int c) {
        int aMod = a % 10;
        int bMod = b % 10;
        int cMod = c % 10;
        if (aMod == bMod || aMod == cMod || bMod == cMod )
          return true;
        else
          return false;
        }
  // maxMod5
      public int maxMod5(int a, int b) {

        if (a == b)
          return 0;
          
        if (a % 5 == b % 5)
          return Math.min(a,b);
          
        return Math.max(a,b);
      
      }
  //blueTicket
      public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        
        if (ab == 10 || bc == 10 || ac == 10)
          return 10;
          
        else if (ab == (bc + 10) || ab == (ac + 10))
          return 5;
        
        else
          return 0;
      }
  // dateFashion
      public int dateFashion(int you, int date) {
        if (you <=2 || date <=2)
          return 0;
        
        else if(you >= 8 || date >= 8)
          return 2;
        
        else
          return 1;
      }
  // sortaSum
    public int sortaSum(int a, int b) {
      int sum = a + b;
      
      if (sum >= 10 && sum <= 19)
        return 20;
      
      else
        return sum;
    }
  // in1To10
    public boolean in1To10(int n, boolean outsideMode) {
      if (outsideMode) {
        if (n <= 1 || n>= 10)
          return true;
        else
          return false;
      }
      
      if (n >= 1 && n <= 10)
        return true;
      else
        return false;
    }
  // old35
    public boolean old35(int n) {
      if ((n % 3 == 0 ) && ( n % 5 != 0))
        return true;
      else if ((n % 3 != 0) && (n % 5 == 0))
        return true;
      else
        return false;
    }
  // teenSum
    public int teenSum(int a, int b) {
      int sum = a + b;
      if (a >= 13 && a <= 19 || b >=13 && b <= 19)
        return 19;
      else
        return sum;
    }
  // fizzString
    public String fizzString(String str) {
      boolean fizz = str.startsWith("f");
      boolean buzz = str.endsWith("b");
      
      if (fizz && buzz)
        return "FizzBuzz";
        
      if (fizz)
        return "Fizz";
        
      if (buzz)
        return "Buzz";
        
        return str;
    }
  // inOrder
    public boolean inOrder(int a, int b, int c, boolean bOk) {
      if (bOk)
        if (c > b)
          return true;
        else 
          return false;
      else if (b > a && c > b)
        return true;
      else
        return false;
    }
  // lessBy10
    public boolean lessBy10(int a, int b, int c) {
      if (a <= b - 10 || a <= c - 10)
        return true;
      else if (b <= a - 10 || b <= c -10)
        return true;
      else if (c <= a - 10 || c <= b - 10)
        return true;
      else 
        return false;
    }
    // public boolean lessBy10(int a, int b, int c) {
    //   return (Math.abs(a - b) >= 10 ||
    //           Math.abs(b - c) >= 10 ||
    //           Math.abs(a - c) >= 10);
      
    //   // Solution notes: it's a bit surprising that this can be so short.
    //   // We simplify by using Math.abs() to take the absolute value --
    //   // say with the ab pair, one is smaller and one is bigger, but we don't
    //   // care which is which, since we are just looking for a difference
    //   // of 10 or more.
    // }

    // redTicket
      public int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c ==2)
          return 10;
          
        else if (a == b && b == c && a == c)
          return 5;
          
        else if (a != b && a != c)
          return 1;
          
        else
          return 0;
      }
  // shareDigit
      public boolean shareDigit(int a, int b) {
        int aLeft = a / 10;
        int aRight = a % 10;
        int bLeft = b / 10;
        int bRight = b % 10;
        
        if (aLeft == bLeft || aLeft == bRight || aRight == bLeft || aRight == bRight)
          return true;
        else
          return false;
      }
  // squirrelPlay
      public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
          if (temp >= 60 && temp <= 100)
            return true;
        }
          else if (temp >= 60 && temp <= 90)
            return true;
            
          return false;
      }
  // alarmClock
      public String alarmClock(int day, boolean vacation) {
        if (vacation) {
          if (day >= 1 && day <= 5)
            return "10:00";
          else if (day == 0 || day == 6)
            return "off";
          else
            return "Test";
        }else{
          if (day >= 1 && day <= 5){
            return "7:00";
          }else{
            return "10:00";
          }
        }
      }
  // specialEvent
      public boolean specialEleven(int n) {
        if (n % 11 == 0 || n % 11 == 1)
          return true;
        else 
          return false;
      }
  // less20
      public boolean less20(int n) {
        if ((n+1) % 20 == 0 || (n+2) % 20 == 0) //add 1 or 2 to bring it up to a multiple of 20
          return true;
        else
          return false;
      }
  // answerCell
      public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep)
          return false;
        else if (isMorning)
          if (isMom)
            return true;
          else
            return false;
        return true;
          
      }
  // fizzString2
      public String fizzString2(int n) {
        boolean isFizz = n % 3 == 0;
        boolean isBuzz = n % 5 == 0;
        
        if (isFizz && isBuzz)
          return "FizzBuzz!";
        else if (isFizz)
          return "Fizz!";
        else if (isBuzz)
          return "Buzz!";
        else
          return n + "!";
      }
  // inOrderEqual
      public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) {
          if (b >= a && c >= b)
            return true;
        }
        else if (b > a  && c > b)
          return true;
        return false;
        
      }
  // withoutDoubles
      public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles){
          if (die1 == die2) {
            die1++;
            if (die1 > 6) {
              die1 = 1;
            }
          }
        }
        return die1 + die2;
      
      }
  // greenTicket
      public int greenTicket(int a, int b, int c) {
        if (a != b && b!= c && c != a)
          return 0;
        
        if (a == b && b == c && a == c)
          return 20;
        
        else
          return 10;
      }

  // sumLimit
      public int sumLimit(int a, int b) {
        int sum = a + b;
        String aStr = String.valueOf(a);
        String sumStr = String.valueOf(sum);
        int aLength = aStr.length();
        int sumLength = sumStr.length();
        
        if (sumLength > aLength)
          return a;
        else
          return sum;
        
        
      }
  
  
  
  
  


    
  
  
  
  
  
    
  
  

          
      
}
