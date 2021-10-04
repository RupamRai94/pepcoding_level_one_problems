import java.util.Scanner;

public class AnyBaseToDecimal{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b){
        int rm, result = 0, pow=1;

        while(n > 0){
        rm = n % 10;
        n = n / 10  ;
        result += rm * pow;
        pow = pow * b;
        }

        return result;

    }
}
