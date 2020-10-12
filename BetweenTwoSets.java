import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
        Collections.sort(b);
        Collections.sort(a);
        ArrayList<Integer>potNum= new ArrayList<Integer>();
        //ArrayList<Integer>newA= new ArrayList<Integer>();
       // ArrayList<Integer>newB= new ArrayList<Integer>();
        
        ArrayList<Integer>toRemove= new ArrayList<Integer>();

       // newA.add(3);
       // newA.add(4);
       // newB.add(24);
       // newB.add(48);

       // a=newA;
       // b=newB;

        int gcd=b.get(0);
        int start=a.get(0);

        if(start==1){
            start=1;
        }else{
            start=2;
        }

        //System.out.println(b.get(0));
        for (int i=start;i<=gcd;i++){
            if(gcd%i==0){
                potNum.add(i);
            }
        }

        for(Integer f: potNum){
            for (Integer bNum: b){
                if(bNum%f!=0){
                    toRemove.add(f);
                }
            }
        }

        for (Integer f: potNum){
            for (Integer aNum:a){
                if(f%aNum!=0){
                    toRemove.add(f);
                }
            }
        }


        for(Integer e: toRemove){
            potNum.remove(e);
            //System.out.println(e);
        }

    return (potNum.size());

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
