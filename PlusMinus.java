import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double posCount=0;
        double negCount=0;
        double zeroCount=0;
        double arrLength = arr.length;

        double posFrac=0.0;
        double negFrac =0.0;
        double zeroFrac =0.0;


        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                posCount++;
            }
            else if(arr[i]<0){
                negCount++;
            }
            else{
                zeroCount++;
            }
        }

        posFrac=posCount/arrLength;
        negFrac=negCount/arrLength;
        zeroFrac=zeroCount/arrLength;

        System.out.println(posFrac);
        System.out.println(negFrac);
        System.out.println(zeroFrac);



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
