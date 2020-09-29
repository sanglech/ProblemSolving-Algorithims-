import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        /*
        s=starting point
        t=endpoint
        a=location of apple tree
        b= location of orange tree
        apples= array of distance apples traveled
        oranges= array of distance oranges travled


        */
        int numApples=0;
        int numOranges=0;

        int appleTravel=0;
        int orangeTravel=0;

        for (int i=0;i<apples.length;i++){
            appleTravel=apples[i]+a;
            if(appleTravel>=s&&appleTravel<=t){
                numApples++;
            }
        }
        for (int j=0;j<oranges.length;j++){
            orangeTravel=oranges[j]+b;
            if(orangeTravel<=t&&orangeTravel>=s){
                numOranges++;
            }
        }

        System.out.println(numApples);
        System.out.println(numOranges);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}
