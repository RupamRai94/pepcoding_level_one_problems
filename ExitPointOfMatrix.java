// The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
// You are required to print the indices in (row, col) format of the point from where you exit the matrix.
// 0 0 1
// 1 1 0
// 1 1 0
// Exit Point 2 2

import java.util.Scanner;
public class ExitPointOfMatrix{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Matrix");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int [n][m];

        System.out.println("Enter Numbers Of Matrix");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int dir = 0, i = 0, j = 0;
        // 0 - east  1 - south   2 - west   3 - north

        while(true){
            dir = (dir + arr[i][j]) % 4;

            if(dir == 0){   // East
                j++;
            }else if(dir == 1){     // South
                i++;
            }else if(dir == 2){     // West
                j--;
            }else if(dir == 3){     // North
                i--;
            }

            if(i < 0){
                i++;
                break;
            }else if(j < 0){
                j++;
                break;
            }else if(i == arr.length){
                i--;
                break;
            }else if(j == arr[0].length){
                j--;
                break;
            }
        }

        System.out.println("Exit Point Of An Matrix");
        System.out.println(i);
        System.out.println(j);

    }
}