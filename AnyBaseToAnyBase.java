import java.util.Scanner;

public class AnyBaseToAnyBase{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int DestBase = scn.nextInt();
        int dn = getValueInBase(n, sourceBase, DestBase);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int sourceBase, int DestBase){
        int rm, result = 0, pow=1;

        while(n > 0){
            rm = n % DestBase;
            n = n / DestBase;
            result += rm * pow;
            pow = pow * sourceBase;
        }

        return result;

    }
}
