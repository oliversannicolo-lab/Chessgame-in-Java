public abstract class ChessPiece extends BoardElement{
    private Color color; 

    private ChessPiece(int rows, int cols, Color color) {
        super(rows, cols);
        this.color = color;
    }


    public char getSymbol() {
        return '-';
    }


}
