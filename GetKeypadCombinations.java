import java.util.Scanner;
import java.util.ArrayList;

public class GetKeypadCombinations{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static ArrayList<String> getKPC(String str){
        if(str.length() == 0){
            ArrayList<String> baseRecursion = new ArrayList<>();
            baseRecursion.add("");
            return baseRecursion;
        }

        char ch = str.charAt(0);
        String remainingString = str.substring(1);
        ArrayList<String> recursiveResult = getKPC(remainingString);

        ArrayList<String> finalResult = new ArrayList<>();

        String codeforch = codes[ch - '0'];
        for(int i = 0; i < codeforch.length(); i++){
            char chcode = codeforch.charAt(i);
            for(String res : recursiveResult){
                finalResult.add(chcode + res);
            }
        }
        return finalResult;

    }
}