import java.util.Scanner;
import java.util.ArrayList;

public class GetMazePath{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number for matrix");
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> resultPath = getPath(1, 1, n, m);
        System.out.println(resultPath);
    }

    public static ArrayList<String> getPath(int sourceRow, int sourceCol, int destRow, int destCol){
        if(sourceRow == destRow && sourceCol == destCol){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if(sourceRow < destRow){
            vpaths = getPath(sourceRow + 1, sourceCol, destRow, destCol);
        }

        if(sourceCol < destCol){
            hpaths = getPath(sourceRow, sourceCol + 1, destRow, destCol);
        }

        ArrayList<String> paths = new ArrayList<>();

        for(String hpath : hpaths){
            paths.add("h" + hpath);
        }

        for(String vpath : vpaths){
            paths.add("v" + vpath);
        }

        return paths;
    }
}