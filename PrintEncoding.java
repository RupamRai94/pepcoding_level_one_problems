import java.io.*;
import java.util.*;

public class PrintEncoding {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printEncoding(str, "");
    }

    public static void printEncoding(String str, String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }else if(str.length() == 1){
            char ch = str.charAt(0);
            if(ch == '0'){
                return;
            }else{
                int chv = ch - '0'; // will give number ex ch = '1' - '0' => 1
                char code = (char)('a' + chv - 1);  //for instance chv = 3(c) 'a' + 3 - 1 = 67 => 'c'
                System.out.println(ans + code);
            }
        }else{
            char ch = str.charAt(0);
            String rs = str.substring(1);
            
            if(ch == '0'){
                return;
            }else{
                int chv = ch - '0';
                char code = (char)('a' + chv - 1);
                printEncoding(rs, ans + code);
            }
            
            String ch12 = str.substring(0, 2);
            String remainingChars = str.substring(2);
            
            int nums = Integer.parseInt(ch12);
            
            if(nums <= 26){
                char code = (char)('a' + nums - 1);
                printEncoding(remainingChars, ans + code);
            }
        }
    }

}