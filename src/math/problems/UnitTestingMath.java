

package math.problems;
import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        Factorial fnum=new Factorial();
        int result1=Factorial.factorial(5);
        Assert.assertEquals(120,result1);
        FindLowestDifference lno=new FindLowestDifference();
        PrimeNumber pm=new PrimeNumber();
        Assert.assertEquals(true,PrimeNumber.isPrime(5));
        //Apply Unit testing into each classes and methods in this package.

    }
}
