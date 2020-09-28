import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */

         //s= "07:05:45AM";
         String sub= s.substring(8);
         String milTime="";
         String hr="";
         int hrs=0;

         if(sub.equals("AM")){
              hr=s.substring(0,2);
             if(hr.equals("12")){
                 milTime="00"+s.substring(2,8);
             }
             else{
                 milTime=s.substring(0,8);
             }
         }
         
         if(sub.equals("PM")){

             hr=s.substring(0,2);

             if(hr.equals("12")){
                 milTime=s.substring(0,8);
             }
             else{
                 hrs=Integer.parseInt(hr)+12;
                 milTime=Integer.toString(hrs)+s.substring(2,8);
             }
         }
         //System.out.println(milTime);
         return(milTime);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
