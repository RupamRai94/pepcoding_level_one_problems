import java.util.Scanner;
import java.lang.Math;
public class SubsetsOfArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] arr = new int[arraySize];
        for(int i = 0; i < arraySize; i++){
            arr[i] = sc.nextInt();
        }

        int subSetSize = (int)Math.pow(2,arraySize);

        for(int i = 0; i < subSetSize; i++){
            int temp = i;
            String subSet = "";
            for(int j = arraySize - 1; j >= 0; j--){
                int reminder = temp % 2;
                temp = temp / 2;

                if(reminder == 0){
                    subSet = "-\t" + subSet;
                }else{
                    subSet = arr[j] + "\t" + subSet;
                }
            }
            System.out.println(subSet);
        }
    }
}
