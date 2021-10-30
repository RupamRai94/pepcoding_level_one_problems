import java.util.Scanner;
public class WaveTraversal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Sizes");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter Array Elements");
        for(int i = 0; i < arr.length; i++){
            for(int  j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Displaying Results");
        for(int col = 0; col < arr[0].length; col++){
            if(col % 2 == 0){
                for(int row = 0; row < arr.length; row++){
                    System.out.println(arr[row][col]);
                }
            }else{
                for(int row = arr.length-1; row >= 0; row--){
                    System.out.println(arr[row][col]);
                }
            }
        }
    }
}