import java.util.Scanner;
// First Approach
// public class DisplayArrayWithRecursion{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] arr = new int[size];
//         for(int i = 0; i < size; i++){
//             arr[i] = sc.nextInt();
//         }
//         displayArray(arr, size-1);
//     }

//     public static void displayArray(int[] arr, int size){
//         if(size < 0){
//             return;
//         }
//         displayArray(arr, size-1);
//         System.out.println(arr[size]);
//     }

// Second Approach  TC n*O(1) => O(n)   ///   SC O(n) Every time save value on Stack
public class DisplayArrayWithRecursion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        displayArray(arr, 0);
    }

    public static void displayArray(int[] arr, int size){
        if(arr.length == size){
            return;
        }
        System.out.println(arr[size]);
        displayArray(arr, size + 1);
    }
}