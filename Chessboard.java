public class Chessboard {
    public static int rows = 8;
    public static int cols = 8;

    private final BoardElement[][] board = new BoardElement[rows][cols];

    public void populateBoard() {
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++) {
                board[i][j] = new EmptySquare(rows, cols);
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j].getSymbol());
            }
            System.out.println();
        }
    }
}
