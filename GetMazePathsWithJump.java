import java.util.Scanner;
import java.util.ArrayList;

public class GetMazePathsWithJump{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number for matrix");
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> resultPath = getPaths(1, 1, n, m);
        System.out.println(resultPath);
    }

    public static ArrayList<String> getPaths(int sourceRow, int sourceCol, int destRow, int destCol){
        if(sourceRow == destRow && sourceCol == destCol){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> paths = new ArrayList<>();

        // Horizontal Moves
        for(int ms = 1; ms <= destCol - sourceCol; ms++){
            ArrayList<String> hpaths = getPaths(sourceRow, sourceCol + ms, destRow, destCol);
            for(String hpath : hpaths){
                paths.add("h" + ms + hpath);
            }
        }

        // Vertical Moves
        for(int ms = 1; ms <= destRow - sourceRow; ms++){
            ArrayList<String> vpaths = getPaths(sourceRow + ms, sourceCol, destRow, destCol);
            for(String vpath : vpaths){
                paths.add("v" + ms + vpath);
            }
        }

        // Vertical Moves
        for(int ms = 1; ms <= destRow - sourceRow && ms <= destCol - sourceCol; ms++){
            ArrayList<String> dpaths = getPaths(sourceRow + ms, sourceCol + ms, destRow, destCol);
            for(String dpath : dpaths){
                paths.add("d" + ms + dpath);
            }
        }

        return paths;
    }
}