import java.util.Scanner;
public class PrintAllIndicesInRecursion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter Elements Of Array");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Search Element");
        int searchElement = sc.nextInt();

        int[] resultArr = allIndices(arr, searchElement, 0, 0);   // 0->Index 0-> find So Far

        for(int i = 0; i < resultArr.length; i++){
            System.out.println(resultArr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int searchElement, int index, int fsf){
        if(arr.length == index){
            return new int[fsf];
        }

        if(arr[index] == searchElement){
            int[] iarr = allIndices(arr, searchElement, index + 1, fsf + 1);
            iarr[fsf] = index;
            return iarr;
        }else{
            int[] iarr = allIndices(arr, searchElement, index + 1, fsf);
            return iarr;
        }
    }
}