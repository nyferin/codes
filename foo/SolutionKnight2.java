/* 
BOARD:
-------------------------
| 0| 1| 2| 3| 4| 5| 6| 7|
-------------------------
| 8| 9|10|11|12|13|14|15|
-------------------------
|16|17|18|19|20|21|22|23|
-------------------------
|24|25|26|27|28|29|30|31|
-------------------------
|32|33|34|35|36|37|38|39|
-------------------------
|40|41|42|43|44|45|46|47|
-------------------------
|48|49|50|51|52|53|54|55|
-------------------------
|56|57|58|59|60|61|62|63|
-------------------------

COMMAND: source, destination
*/
import java.util.LinkedList;
public class SolutionKnight2 {
    public int solution(int src, int dest) {
        int count = 0, xpos = 0, ypos = 0, xtar = 0, ytar = 0;
        int[][] board = new int[8][8];
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = count;
                count++;
                if(board[i][j] == src) {
                    xpos = i; ypos = j;
                }
                if(board[i][j] == dest) {
                    xtar = i; ytar = j;
                }
            }
        }

        class chessBoard {
            int x, y, dis;
            public chessBoard(int x, int y, int dis) {
                this.x = x;
                this.y = y;
                this.dis = dis;
            }
        }

        int[] xmove = {-2, -1, 1, 2, -2, -1, 1, 2}, ymove = {-1, -2, -2, -1, 1, 2, 2, 1};
        
        LinkedList<chessBoard> q = new LinkedList<chessBoard>();

        q.add(new chessBoard(xpos, ypos, 0));

        chessBoard t;
        boolean mark[][] = new boolean[9][9];
        mark[xpos][ypos] = true;

        while (!q.isEmpty()) {
            t = q.getFirst();
            q.remove(0);

            if (t.x == xtar && t.y == ytar) {
                return t.dis;
            }

            for (int i = 0; i < 8; i++) {
                xpos = t.x + xmove[i];
                ypos = t.y + ymove[i];

                if (xpos >= 0 && xpos < 8 && ypos >= 0 && ypos < 8 && !mark[xpos][ypos]) {
                    mark[xpos][ypos] = true;
                    q.add(new chessBoard(xpos, ypos, t.dis + 1));
                }
            }
        }
        return Integer.MAX_VALUE;
    }
}
