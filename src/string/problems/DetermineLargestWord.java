package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {


    public static String largestWord(String wordGiven){
        DetermineLargestWord dt =new DetermineLargestWord();
        Map<Integer, String> wordNLength = dt.findTheLargestWord(wordGiven);
        int largest = 0;
        String largeValue = "";
        for(Map.Entry<Integer, String> checkLength : wordNLength.entrySet()){
            if(largest< checkLength.getKey()) {
                largest = checkLength.getKey();
                largeValue = checkLength.getValue();
            }
        }
        return largeValue;
    }



    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        System.out.println(largestWord(s));
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement

    }


    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        //implement
            String st = "";
            String[] split = wordGiven.split(" ");

            for(int i=0;i<split.length;i++){
                map.put(split[i].length(),split[i]);
            }

            return map;
        }
}
