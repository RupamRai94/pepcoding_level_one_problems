import java.util.Scanner;
import java.util.ArrayList;
public class GetSubsequences{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> subsequences = gss(str);
        System.out.println(subsequences);
    }

    public static ArrayList<String> gss(String str){
        if(str.length() == 0){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        char firstChar = str.charAt(0);
        String remainingString = str.substring(1);
        ArrayList<String> recursionString = gss(remainingString);

        ArrayList<String> finalResult = new ArrayList<>();
        for(String rstr : recursionString){
            finalResult.add("" + rstr);
        }
        for(String rstr : recursionString){
            finalResult.add(firstChar + rstr);
        }
        return finalResult;
    }
}