import java.util.LinkedList;
import java.util.Stack;         //堆栈，后进先出
import java.util.Queue;         //队列，先进先出

public class BFS {

    /**
     * BFS，其英文全称是Breadth First Search。
     * BFS并不使用经验法则算法。从算法的观点，所有因为展开节点而得到的子节点都会被加进一个先进先出的队列中。
     * 一般的实验里，其邻居节点尚未被检验过的节点会被放置在一个被称为 open 的容器中（例如队列或是链表），
     * 而被检验过的节点则被放置在被称为 closed 的容器中。
     */

    private static int N=5;

    int [][] maze;                    //定义迷宫地图
    int [][] visitedSign;             //定义访问过的位置
    int [][] direction={                         //{x,y}
            {-1,0},{0,-1},{1,0},{0,1}            //左，上，右，下
    };

    BFS(){
        maze=new int[][]{
            {0,0,0,0,0},
            {0,1,0,1,0},
            {0,1,1,0,0},
            {0,1,1,0,1},
            {0,0,1,0,0}
        };
        visitedSign=new int [N][N];
    }

    class Node{                     //建立一个类以记录节点位置信息
        int x,y;
        int step;
        int preX,preY;
        Node(int x, int y, int preX, int preY, int step){
           this.x=x;
           this.y=y;
           this.preX=preX;
           this.preY=preY;
           this.step=step;
        }
    }

    int bfsProcess(){
        Node node=new Node(0,0,-1,-1,0);
        Queue<BFS.Node> queue = new LinkedList<Node>();         //队列，先进先出
        Stack<BFS.Node> stack=new Stack<Node>();                //堆栈，后进先出
        queue.offer(node);                  //起点位置加入队列
        while(!queue.isEmpty()){
            Node head=queue.poll();         //取出队列最顶端元素
            stack.push(head);               //将其压入堆栈，用于回溯路径
            visitedSign[head.x][head.y]=1;
            for (int i=0; i<4; i++){                //四个方向依次判断
                int x=head.x+direction[i][0];
                int y=head.y+direction[i][1];
                if(x==N-1 && y==N-1 && maze[x][y]==0 && visitedSign[x][y]==0) {         //定义终点的操作
                    Node top=stack.pop();
                    System.out.println("总步数：" + (top.step + 1));
                    System.out.println("逆向路线：");
                    System.out.println("("+(N-1)+","+(N-1)+")");
                    System.out.println("("+top.x+","+top.y+")");
                    int preX=top.preX;
                    int preY=top.preY;
                    while (!stack.isEmpty()){
                        top=stack.pop();
                        if(preX==top.x && preY==top.y){
                            System.out.println("("+preX+","+preY+")");
                            preX=top.preX;
                            preY=top.preY;
                        }
                    }
                    return 0;
                }
                if(x>=0 && x<N && y>=0 && y<N && maze[x][y]==0 && visitedSign[x][y]==0){    //非边界，未撞墙，未曾到达过
                    Node newNode=new Node(x,y,head.x,head.y,head.step+1);
                    queue.offer(newNode);
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        BFS bfs=new BFS();
        if(bfs.bfsProcess()!=0){
            System.out.println("该迷宫没有出口。");
        }
    }

}
