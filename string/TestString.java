package string;

import java.util.HashMap;

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
        countFrequencyOfChar("abcDdefaac");
    }
}
