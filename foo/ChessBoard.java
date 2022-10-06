public class ChessBoard {
    public static void main(String[] args) {
        int[][] board = new int[8][8];
        int count = 0;

        System.out.println("");
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(count + "\t");
                count++;
            }
            System.out.println("\n");
        }
        board[0][1] = 1;
        System.out.println(board[0][1]);
        System.out.println("\n");

        count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = count;
                count++;
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
    }
}
