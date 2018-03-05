package bishi;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class P54 {

	/**
	 * @param args
	 */
		public static void main(String[] args) {
	        /*
	         * Scanner sc = new Scanner(System.in); int n = sc.nextInt(); int m =
	         * sc.nextInt(); int P = sc.nextInt(); int[][] maze = new int[n][m];
	         * 
	         * for(int i=0;i<n;i++) for(int j=0;j<m;j++) maze[i][j] = sc.nextInt();
	         */
	        int[][] maze = { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
	                { 1, 0, 1, 1, 1, 0, 1, 1, 1, 1 },
	                { 1, 1, 0, 1, 0, 1, 1, 1, 1, 1 },
	                { 1, 0, 1, 0, 0, 0, 0, 0, 1, 1 },
	                { 1, 0, 1, 1, 1, 0, 1, 1, 1, 1 },
	                { 1, 1, 0, 0, 1, 1, 0, 0, 0, 1 },
	                { 1, 0, 1, 1, 0, 0, 1, 1, 0, 1 },
	                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };
	        int[][] move = { { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 },
	                { -1, -1 }, { -1, 0 }, { -1, 1 } };
	        Stack<Step> stack = new Stack<Step>();
	        int label = moveStep(maze, move,stack);
	        if(label==1)
	            for(Step s:stack){
	                System.out.println(s.x+" "+s.y+" "+s.d);
	            }
	        else
	            System.out.println("无通路！");
	    }
	    public static int moveStep(int[][] maze, int[][] move,Stack<Step> stack) {
	        Step temp = new Step(1, 1, -1);
	        stack.push(temp);
	        while (!stack.isEmpty()) {
	            temp = stack.pop();
	            int x = temp.x;
	            int y = temp.y;
	            int d = temp.d + 1;
	            while (d < move.length) {
	                int i = x + move[d][0];
	                int j = y + move[d][1];
	                if (maze[i][j] == 0) {
	                    temp = new Step(i, j, d);
	                    stack.push(temp);
	                    x = i;
	                    y = j;
	                    maze[x][y] = -1;
	                    if (x == 6 && y == 8)
	                        return 1;
	                    else
	                        d = 0;
	                } else
	                    d++;
	            }
	        }

	        return 0;
	    }

}
class Step{
    int x,y,d;
    public Step(int x,int y,int d) {
        this.x = x;//横坐标
        this.y = y;//纵坐标
        this.d = d;//方向
    }
}
