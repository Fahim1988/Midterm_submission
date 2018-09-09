package math.problems;

import java.util.Arrays;

public class FindLowestDifference {
    static int findLowestDiff(int[]array1,int[]array2,int a,int b){
        Arrays.sort(array1);
        Arrays.sort(array2);
        int c=0;int d=0;
        int r=Integer.MAX_VALUE;
        while(c<a&&d<b){

            if (Math.abs(array1[c] - array2[d]) < r)
                r= Math.abs(array1[c] - array2[d]);
            if (array1[c] < array2[d])
                c++;

            else
                d++;

        }
        return r;
    }
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
        int a=array1.length;
        int b=array2.length;
        System.out.println("The lowest differenc between two array is :"+findLowestDiff(array1,array2,a,b));




    }

}
