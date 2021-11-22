import java.io.*;
import java.util.*;

public class PrintKPCOptimized {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printKPC(str, "");
    }
    
    static String codes[] = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printKPC(String str, String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        
        char ch = str.charAt(0);
        String remaining = str.substring(1);
        
        String codeString = codes[ch - '0'];
        for(int i = 0; i < codeString.length(); i++){
            char codeCh = codeString.charAt(i);
            printKPC(remaining, ans + codeCh);
        }
    }

}