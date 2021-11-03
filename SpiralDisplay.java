// Logic try to think as each square display
import java.util.Scanner;
public class SpiralDisplay{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int count = 0;
        int size = n * m;

        while(count < size){
            // Left Portion
            for(int i = minr; i <= maxr && count < size; i++){
                System.out.println(arr[i][minc]);
                count++;
            }
            minc++;

            // Bottom Position
            for(int i = minc; i <= maxc && count < size; i++){
                System.out.println(arr[maxr][i]);
                count++;
            }
            maxr--;

            // Right Position
            for(int i = maxr; i >= minr && count < size; i--){
                System.out.println(arr[i][maxc]);
                count++;
            }
            maxc--;

            // Top Position
            for(int i = maxc; i >= minc && count < size; i--){
                System.out.println(arr[minr][i]);
                count++;
            }
            minr++;
        }
    }
}