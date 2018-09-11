package string.problems;
import org.testng.*;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        Assert.assertEquals(true,Palindrome.isP("MADAM"));
        String s="The cat jumped over the head of the sly fox";
        Assert.assertEquals("jumped",DetermineLargestWord.largestWord(s));
       Assert.assertEquals(false,Anagram.isAnagram("TON","TAN"));

    }
}
