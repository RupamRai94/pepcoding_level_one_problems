import java.util.Scanner;
public class PrintPalindromicSubstrings{

    public static boolean isPalindromic(String s){
        int i = 0;
        int j = s.length() - 1;

        while(i <= j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if(ch1 != ch2){
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
    
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j <= str.length(); j++){
               String s = str.substring(i,j);

                if(isPalindromic(s) == true){
                    System.out.println(s);
                }
            }
        }
    }
}