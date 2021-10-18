import java.util.Scanner;

public class SubArraysOfArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
    
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
    
        for(int i = 0; i < size; i++){
            for(int j = i; j < size; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] + "\t");
                }
                System.out.println();
            }
        }
    }
}