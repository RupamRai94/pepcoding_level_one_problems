import java.util.Scanner;
public class PowerLogarithmic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int pow = power(n, p);
        System.out.println(pow);
    }
    
    public static int power(int x ,int n){
        if(n == 0){
            return 1;
        }
        int xpb2 = power(x, n / 2);
        int xn = xpb2 * xpb2;

        if(n % 2 == 1){
            xn = xn * x;
        }
        return xn;
    }
}