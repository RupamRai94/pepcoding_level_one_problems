import java.util.Scanner;
public class RotateImage{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row and Column Size");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter Matrix Elements");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Transpose either upper or lower to save from double swap

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Reverse Columns first to last and last to first and so on

        for(int i = 0; i < arr.length; i++){
            int left = 0;
            int right = arr[0].length - 1;
            while(left <= right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;

                left++;
                right--;
            }
        }

        System.out.println("Rotated Matrix");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}