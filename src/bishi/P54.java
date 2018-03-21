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
		public static void  search(int [][]map){
			int hang=map.length;
			int lie=map[0].length;
			boolean [][]sel=new boolean[hang][lie];
			for(int i=0;i<hang;i++){
				for(int j=0;j<lie;j++){
					sel[i][j]=false;
				}
			}
			ArrayList<node> list=new ArrayList<node>();
			list.add(new node(0,0,1,65535));
			sel[0][0]=true;
			node tmp;
			while(!list.isEmpty()){
				tmp=list.get(0);
				list.remove(0);
				int x=tmp.x;
				int y=tmp.y;
				int dis=tmp.dis;
				
			}
		}
		public void addlist(int [][]map,int x,int y,ArrayList<node> list,node tmp,boolean [][]sel){
			int hang=map.length;
			int lie=map[0].length;
			if((x<0||x>hang-1)||(y<0||y>lie-1)){
				//
			}else{
				if(map[x][y]==1&&sel[x][y]==false){
					node t=new node(x,y,1);
					sel[x][y]=true;
					//if(tmp.dis+1<)
				}
			}
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
class node{
	int x,y;
	int t=0;
	int dis=65535;
    public node(){
		
	}
    public node(int x,int y){
		this.x=x;
	    this.y=y;
	}
    public node(int x,int y,int t){
		this.x=x;
	    this.y=y;
	    this.t=t;
	}
    public node(int x,int y,int t,int dis){
		this.x=x;
	    this.y=y;
	    this.t=t;
	    this.dis=dis;
	}
}