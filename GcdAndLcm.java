import java.util.*;

public class GcdAndLcm{

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();
int num2 = sc.nextInt();

int or1 = num1;
int or2 = num2;

while(num1 % num2 != 0){
int rem = num1 % num2;
num1 = num2;
num2 = rem;
}

System.out.println(num2);
int lcm = (or1 * or2) / num2;
System.out.println(lcm);

}
}
