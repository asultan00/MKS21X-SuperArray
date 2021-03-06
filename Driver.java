public class Driver {
     public static void main(String[] args) {
          System.out.println();
          //////////////////////////////////
          SuperArray SA0 = new SuperArray();
          System.out.println(SA0.toString()); //[]
          System.out.println(SA0.toStringDebug()); //[null x10]
          System.out.println();
          //////////////////////////////////
          SuperArray SA1 = new SuperArray();
          SA1.add("zero");
          SA1.add("one");
          System.out.println(SA1.toString()); //[zero, one]
          System.out.println(SA1.toStringDebug()); //[zero, one, null x8]
          System.out.println(SA1.get(1)); //one
          System.out.println(SA1.set(1, "fortnite")); //one
          System.out.println(SA1.get(1)); //fortnite
          System.out.println(SA1.toString());
          SA1.clear();
          System.out.println(SA1.toStringDebug());
          System.out.println();
          //////////////////////////////////
          SuperArray SA2 = new SuperArray();
          for ( int i = 0; i < 10; i++ ) {
               SA2.add(i + "");
          }
          System.out.println(SA2.toString());//[0, 1, 2... 9]
          System.out.println(SA2.toStringDebug());//[0, 1, 2... 9]
          SA2.add("no");
          System.out.println(SA2.toString());//[0, 1, 2... 9]
          System.out.println(SA2.toStringDebug());
          //////////////////////////////////
          SuperArray SA3 = new SuperArray();
          for ( int i = 0; i < 10; i++ ) {
               SA3.add(i + "");
          }
          SA3.set(3, "fortnite");
          SA3.set(5, "supersmashbros");
          System.out.println(SA3.toStringDebug()); //[0, 1, 2, fortnite, 4, supersmashbros, 6, 7, 8, 9]
          System.out.println(SA3.contains("fortnite")); //true
          System.out.println(SA3.contains("tetris")); //false
          System.out.println(SA3.indexOf("supersmashbros")); //5
          System.out.println(SA3.indexOf("tetris")); //-1
          SA3.set(7, "fortnite");
          System.out.println(SA3.indexOf("fortnite")); //3
          System.out.println(SA3.lastIndexOf("fortnite")); //7
          SA3.add(4, "csgo");
          System.out.println(SA3.toStringDebug());
          SA3.remove(3);
          System.out.println(SA3.toStringDebug());
          System.out.println(SA3.toStringDebug());
          SA3.remove("csgo");
          System.out.println(SA3.toStringDebug());
          //////////////////////////////////
          SuperArray SA4 = new SuperArray(5);
          System.out.println(SA4.toStringDebug());
          /* Tested!
          SuperArray SA4b = new SuperArray(-8); //IllegalArgumentException
          System.out.println(SA4.get(1000)); //IndexOutOfBoundsException
          System.out.println(SA4.add("taykeith")); //IndexOutOfBoundsException
          System.out.println(SA4.remove(-8)); //IndexOutOfBoundsException
          System.out.println(SA3.set(84, "pubg")); //IndexOutOfBoundsException
          */
     }
}
