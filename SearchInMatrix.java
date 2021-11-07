import java.util.Scanner;
public class SearchInMatrix{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Matrix");
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();

        System.out.println("Enter Array Elements");
        int[][] arr = new int[n1][m1];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();        
            }
        }

        System.out.println("Target Element");
        int ele = sc.nextInt();
        int row = 0, col = arr[0].length - 1;
        while(row < arr.length && col >= 0){
            if(arr[row][col] == ele){
                System.out.println(row);
                System.out.println(col);
                return;
            }else if(ele > arr[row][col]){
                row++;
            }else{
                col--;
            }
        }
        System.out.println("Not Found");
    }
}
