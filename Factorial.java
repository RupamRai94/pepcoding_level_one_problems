import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = fact(n);
        System.out.println(fact);
    }
    
    public static int fact(int n){
        if(n == 1){
            return 1;
        }
        int f1 = fact(n-1);
        int f2 = f1 * n;
        return f2; 
    }
}