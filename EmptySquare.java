public class EmptySquare extends BoardElement {

    public EmptySquare(int rows, int cols) {
        super(rows, cols);
    }

    @Override
    public char getSymbol() {
        return '.';
    }

}
