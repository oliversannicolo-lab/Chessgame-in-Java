public abstract class BoardElement {
    protected int rows = 8;
    protected int cols = 8;

    protected BoardElement(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    public final int getRow() {
        return rows;
    }
    
    public final int getCol() {
        return cols;
    }
}
