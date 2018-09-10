package string.problems;

public class Palindrome {
    public static void main(String[] args) {

        String oStr = "MADAM";
        String rStr = "";

        int l = oStr.length();
        for ( int i = l - 1; i >= 0; i-- )
            rStr = rStr + oStr.charAt(i);

        if (oStr.equals(rStr))
            System.out.println(oStr + " -- word is a palindrome");
        else
            System.out.println(oStr + " -- word is not a palindrome");
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

    }
}
