package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";

        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement

    }


    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        //implement
        String[] word=wordGiven.split(" ");
        String lw=" ";
        for(int i=0;i<word.length;i++){
            for(int j=i;j<word.length;j++){
                if(word[i].length()>word[j].length()){
                    lw=word[i];
                }
            }
        }
        System.out.println(lw);
        System.out.println(lw.length());

        return map;
    }
}
