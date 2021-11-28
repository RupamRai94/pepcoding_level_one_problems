import java.util.Scanner;

public class FloodFill{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] maze = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                maze[i][j] = sc.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
        findPath(maze, 0, 0, "", visited);
    }

    public static void findPath(int[][] maze, int sr, int sc, String ans, boolean[][] visited){
        if(sr < 0 || sc < 0 || sr == maze.length || sc == maze.length || maze[sr][sc] == 1 || visited[sr][sc] == true){
            return;
        }

        if(sr == maze.length - 1 && sc == maze[0].length - 1){
            System.out.println(ans);
            return;
        }
        visited[sr][sc] = true;
        findPath(maze, sr - 1, sc, ans + 't', visited);
        findPath(maze, sr, sc - 1, ans + 'l', visited);
        findPath(maze, sr + 1, sc, ans + 'd', visited);
        findPath(maze, sr, sc + 1, ans + 'r', visited);
        visited[sr][sc] = false;
    }
}