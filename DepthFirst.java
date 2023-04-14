import java.util.ArrayList;

public class DepthFirst {
    public static boolean searchpath(int [][] maze, int x, int y, ArrayList<Integer> path){
        if(maze[x][y]==9){
            path.add(x);
            path.add(y);
            return true;
        }

        if(maze[x][y]==0){
            maze[x][y]=2;
            if(searchpath(maze,x-1,y,path)){
                path.add(x);
                path.add(y);
                return true;
            }
            if(searchpath(maze,x+1,y,path)){
                path.add(x);
                path.add(y);
                return true;
            }
            if(searchpath(maze,x,y+1,path)){
                path.add(x);
                path.add(y);
                return true;
            }
            if(searchpath(maze,x,y-1,path)){
                path.add(x);
                path.add(y);
                return true;
            }
        }
        return false;
    }
}
