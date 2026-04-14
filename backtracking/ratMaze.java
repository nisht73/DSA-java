package backtracking;

public class ratMaze {
    public static boolean solveMaze(int maze[][]){
        int n = maze.length;
        int sol[][] = new int [n][n];

        if(solveUntil(maze,0,0,sol)){
            printSolution(sol);
            return true;
        } else{
            System.out.println("No solution exists");
            return false;
        }
    }

    public static boolean solveUntil(int maze[][],int x, int y, int sol[][]){
        int n = maze.length;

        //base case : destination reached
        if(x == n-1 && y == n-1 && maze[x][y] == 1){
            sol[x][y] = 1;
            return true;
        }

        if(isSafe(maze,x,y)){
            sol[x][y] = 1;

            // move down
            if(solveUntil(maze, x+1, y, sol)){
                return true;
            }

            //move right
            if(solveUntil(maze, x, y+1, sol)){
                return true;
            }

            //backtracking
            sol[x][y] = 0;
            return false;
        }

        return false;
    }

    public static boolean isSafe(int maze[][] , int x, int y) {
        int n = maze.length;
        return (x >= 0 && x < n && y >= 0  && y < n && maze[x][y] == 1);
    }

    public static void printSolution(int sol[][]){
        for(int i =0 ; i<sol.length; i++){
            for(int j =0; j < sol.length; j++){
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int maze[][] = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        
        solveMaze(maze);


    }
}