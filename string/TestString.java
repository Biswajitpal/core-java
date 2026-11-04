package string;

import java.util.Arrays;
import java.util.HashMap;
//what is string constant pull?
import java.util.Scanner;


public class TestString {
    static HashMap<String, Integer> countFrequencyOfChar(String str){
      HashMap<String, Integer> obj  = new HashMap<>();
      String [] arrString = str.split("");
      // System.out.println(str);
      // System.out.println(arrString);
      for( int i=0; i < arrString.length; i++){
        String ch = String.valueOf(str.charAt(i));

            if (obj.containsKey(ch)) {
                obj.put(ch, obj.get(ch) + 1);
            } else {
                obj.put(ch, 1);
            }
      }
      System.out.println(obj);
      return obj;
    }

    public static void main(String [] args){
        // countFrequencyOfChar("abcDdefaac");
        String s1 = "Hello";
        String s2 = s1;
        // s2[0] = 'h'; // This will cause a compile-time error because strings are immutable
        s2 = "World"; // This creates a new string object and assigns it to s2

        String s3 = new String("New text");
        String s4 = new String("New text");
        String s5 = s4;
        String s6 = s4;
        s6 = "Update text";
        s6.toLowerCase();
        s6.toUpperCase();
        s5.charAt(0);

        /* char[] charArray = s5.toCharArray();
        for(int i=0; i< charArray.length; i++){
            System.out.print(charArray[i]);
        }  */


        
        /* System.out.println(s3 == s4);
        System.out.println(s5 == s4);
        System.out.println(s6 == s4);
        System.out.println(s6 == s3); */
        // System.out.println("s1: " + s1);  // Output: s1: Hello
        // System.out.println("s2: " + s2);  // Output: s2: World

        /* Scanner obj = new Scanner(System.in);
        System.out.println("Enter First line");
        obj.nextLine();
        System.out.println("Enter String");
        obj.next();

        System.out.println("Enter new line");
        obj.nextLine(); */

        /* System.out.println("SHASHAT".compareTo("SHASHAT"));
        System.out.println("SHASH".compareTo("SHASHAT"));
        System.out.println("SHASHaT".compareTo("SHAS"));
        System.out.println("SHASHaT".compareTo("HAS")); */

        String email = "test@gmail.com";
        // find the company name from email id
        // System.out.println(email.substring(email.indexOf("@") + 1, email.indexOf(".")));
        String newString = email.split("@")[1];
        // System.out.println(newString.split("\\.")[0]);

        System.out.print(Arrays.toString("gmail.com".split(".")));


    }
}
