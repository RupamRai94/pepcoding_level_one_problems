import java.util.Scanner;

public class FindMaxWithRecursion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        for(int i = 0; i < size; i++){
           arr[i] = sc.nextInt();
        }

        int result = findMaxElement(arr, 0);
        System.out.println(result);
    }

    public static int findMaxElement(int[] arr, int index){
        if(index == arr.length - 1){
            return arr[index];
        }

        int max = findMaxElement(arr, index + 1);
        if(max > arr[index]){
            return max;
        }else{
            return arr[index];
        }
    }
}