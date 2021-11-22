import java.util.Scanner;

public class PrintSubsequences {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printSS(str, "");
    }

    public static void printSS(String str, String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        
        char ch = str.charAt(0);
        String remaining = str.substring(1);
        printSS(remaining, ans + ch);
        printSS(remaining, ans + "");
    }

}