//1. You are given a base b.
//2. You are given two numbers n1 and n2 of base b.
//3. You are required to add the two numbes and print their value in base b.
//8
//777
//1

import java.util.Scanner;

public class AnyBaseAddition{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2){
        // Explanation
        // Add two Octal 236 + 754 seperate 6 and 4 then add both if come greater than 8(line 30) 
        //check what remainder get for unit digit 7/8 so 0 and 9/8 then 1 both digit 
        //can not be 9 + 9 because octal has only 0-7 digit other no means number is not 
        //octal so carry always comes 0 or 1. use pow to make digits like 1 10 100 1000

        int result = 0;
        int carry = 0;
        int pow = 1;

        while(n1 > 0 || n2 > 0 || carry > 0){
        int dig1 = n1 % 10;
        int dig2 = n2 % 10;
        n1 = n1 / 10;
        n2 = n2 / 10;

        int d = dig1 + dig2 + carry;
        carry = d / b;
        d = d % b;

        result += d * pow;
        pow = pow * 10;
        }

        return result;

    }
}
