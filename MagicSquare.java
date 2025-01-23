public class MagicSquare {
    private int[][] square;
    private int i;

    /**
     * Constructs an n by n MagicSquare
     *
     * @param n
     */
    public MagicSquare(int n) {
        square = new int[n][n];
    }

    /**
     * Inserts x at the index i, the next available
     * slot following row-major order.
     *
     * @param x
     */
    public void add(int x) {
        int a = i / square.length;
        int b = i % square.length;
        square[a][b] = x;
        i++;
    }

    /**
     * @param nums
     * @return The sum of nums
     */
    private int sum(int[] nums) {
        int rtn = 0;
        for (int num : nums) {
            rtn += num;
        }
        return rtn;
    }

    /**
     * @return The constant that each row, column,
     * and diagonal should add-up to.
     */
    private int getConstant() {
        int constant = ((square.length ^ 2) * (square.length ^ 2 + 1) / 2) / square.length;
        return constant;
    }

    /**
     * @return true if each row, column, and diagonal
     * add-up to the constant; false otherwise
     */
    public boolean isMagical() {
        return isMagicalRows() && isMagicalColumns() && isMagicalDiagonals();
    }

    /**
     * @return true if each row adds-up to the constant;
     * false otherwise
     */
    private boolean isMagicalRows() {
        for (int col = 0; col < square.length; col++) {
            int isIt = 0;
            for (int row = 0; row < square.length; row++) {
                isIt += square[col][row];
            }
            if (isIt != getConstant()) {
                return false;
            }
        }
        return true;
    }

    /**
     * @return true if each column adds-up to the constant;
     * false otherwise
     */
    private boolean isMagicalColumns() {
        for (int row = 0; row < square.length; row++) {
            int isIt = 0;
            for (int col = 0; col < square.length; col++) {
                isIt += square[col][row];
            }
            if (isIt != getConstant()) {
                return false;
            }
        }
        return true;
    }

    /**
     * @return true if each diagonal adds-up to the constant;
     * false otherwise
     */
    private boolean isMagicalDiagonals() {
        int isIt = 0;
        for (int place = 0; place < square.length; place++) {
            isIt += square[place][place];
        }
        if (isIt != getConstant()) {
            return false;
        }
        isIt = 0;

        for (int col = 0; col < square.length; col++) {
            int row = square.length - 1;
            isIt += square[col][row];
            row--;
        }
        if (isIt != getConstant()) {
            return false;
        }

        return true;
    }

    /**
     * @return A String representation of this MagicSquare.
     */
    public String toString() {
        String rtn = "";

        for (int[] row : square) {
            for (int element : row)
                rtn += element + "\t";
            rtn += "\n";
        }

        return rtn;
    }
}
