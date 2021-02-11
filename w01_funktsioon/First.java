public class First {
    public static void main(String[] args){
     int numberArray[] = new int[5];  
     String[] stringArray = new String[5]; 
     String[] greetingsArray = new String[]{"Hello", "world","!" };
     String name = "ron";
     int year = 2021;
     int myInt = Integer.MAX_VALUE;
     byte bait = Byte.MAX_VALUE-1;
     long myLong = Long.MAX_VALUE;
     short myShort = Short.MAX_VALUE-1;
     float floatNumber = 3.4f;
     boolean flag = true;
     char character = 'F';



        for(int i = 0; i < greetingsArray; i++){
            System.out.println(greetingsArray[i]);
        }
// foreach tsükkel
        for(String text : greetingsArray){
            System.out.println(text);
        }

 //while tsükkel
        int length = greetingsArray.length;
        while (length > 0){
            length --;
            System.out.println("Inside while");
        }
        if( year == 2021){
            System.out.println(year + "is equal to 2021");
        } else if(year > 2021){
            System.out.println(year + "is larger than 2021");
        }else{
            System.out.println(year + "year is smaller than 2021");
        }
      System.out.println("Hello world");
      System.out.println("Test one");
      System.out.println("Test two");
      System.out.print("\n");
      String hello = "Hello world!";
    }
  }
  
  /* function main(args){
      // compute something
  } */