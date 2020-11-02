import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {

        int rev=0;
        ArrayList <Integer>list= new ArrayList<>();
        for (i=i;i<=j;i++){
            String iStr="";
            String reviStr="";
            iStr=Integer.toString(i);
            for(int x=iStr.length()-1;x>=0;x--){
                reviStr+=iStr.charAt(x);
            }

            rev= Integer.parseInt(reviStr);

            if(Math.abs(i-rev)%k==0){
                list.add(i);
            }
            //System.out.println ("RevStr: "+reviStr);
            //System.out.println ("iStr: "+iStr);
        }

        return (list.size());
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
