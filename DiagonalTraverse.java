import java.util.Scanner;

public class DiagonalTraverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Size Of First Matrix");
            int n = sc.nextInt();

            System.out.println("Enter Array Elements");
            int[][] arr = new int[n][n];

            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    arr[i][j] = sc.nextInt();        
                }
            }

            System.out.println("Results");
            
            for(int gape = 0; gape < arr.length; gape++){
                for(int i = 0, j = gape; j < arr.length; i++,j++){
                    System.out.println(arr[i][j]);
                }
            }
    }
}