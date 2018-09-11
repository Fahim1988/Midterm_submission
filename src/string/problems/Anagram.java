package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    static boolean isAnagram(String s1,String s2){
        String cs1=s1.replaceAll("\\s","");
        String cs2=s2.replaceAll("\\s","");
        boolean status=true;
        if(cs1.length()!=cs2.length()){
            status=false;
        }else{
            char[]s1arr=cs1.toLowerCase().toCharArray();
            char[]s2arr=cs2.toLowerCase().toCharArray();
            Arrays.sort(s1arr);
            Arrays.sort(s2arr);
            status=Arrays.equals(s1arr,s2arr);
        }
        if(status)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
        return status;
    }


    public static void main (String[] args) {
        isAnagram("ARMY","MARY");
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
    }
}
