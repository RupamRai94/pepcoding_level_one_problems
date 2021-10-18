import java.util.Scanner;

public class BrokenEconomy{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter Array Elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Search Element : ");
        int SearchElement = sc.nextInt();

        int low = 0, high = n - 1;
        int ceil = 0, floor = 0;

        while(low <= high){
            int mid = (low + high) / 2; 
            if(SearchElement > arr[mid]){
                low = mid + 1;
                floor = arr[mid];
            }else if(SearchElement < arr[mid]){
                high = mid - 1;
                ceil = arr[mid];
            }else{
                ceil = floor = arr[mid];
                break;
            }
        }
        System.out.println("Ceil = " + ceil);
        System.out.println("Floor = " + floor);
    }
}