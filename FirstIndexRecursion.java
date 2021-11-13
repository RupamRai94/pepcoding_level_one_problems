import java.util.Scanner;

public class FirstIndexRecursion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int[] arr = new int [size];

        System.out.println("Enter Array Elements");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Search Element");
        int searchElement = sc.nextInt();

        int resultIndex = findFirstIndex(arr, 0, searchElement);
        System.out.println(resultIndex);
    }

    public static int findFirstIndex(int []arr, int index, int element){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == element){
            return index;
        }else{
            int indexInArray = findFirstIndex(arr, index + 1, element);
            return indexInArray; 
        }
    }
}