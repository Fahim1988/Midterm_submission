package math.problems;

public class Fibonacci {
    public static void main(String[] args) {

        int[] level=new int[40];
        level[0]=0;
        level[1]=1;
        for(int i=2;i<level.length;i++){
           level[i]= level[i-1]+level[i-2];
            System.out.println(level[i]);
        }
         /*
          Write 40 Fibonacci numbers with java.
         */


    }
}
