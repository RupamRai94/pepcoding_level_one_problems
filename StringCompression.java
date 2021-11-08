import java.util.Scanner;
public class StringCompression{

    public static String strCompression1(String str){
        String s = str.charAt(0) + "";  // To convert it into String that's why ""

        for(int i = 1; i < str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            if(curr != prev){
                s += curr;
            }
        }
        return s;
    }

    public static String strCompression2(String str){
        String s = str.charAt(0) + "";
        int count = 1;
        for(int i = 1; i < str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            if(curr == prev){
                count++;
            }else{
                if(count > 1){
                    s += count;
                    count = 1;
                }
                s += curr;
            }
        }

        if(count > 1){
            s += count;
            count = 1;
        }

        return s;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(strCompression1(str));
        System.out.println(strCompression2(str));
    }
}