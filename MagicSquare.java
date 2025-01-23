public class MagicSquare
{
    private int[][] square;
    private int i;

    /**
     * Constructs an n by n MagicSquare
     * @param n
     */
    public MagicSquare(int n)
    {

    }

    /**
     * Inserts x at the index i, the next available
     *  slot following row-major order.
     * @param x
     */
    public void add(int x)
    {

    }

    /**
     * @param nums
     * @return The sum of nums
     */
    private int sum(int[] nums)
    {

    }

    /**
     * @return The constant that each row, column,
     *          and diagonal should add-up to.
     */
    private int getConstant()
    {

    }

    /**
     * @return true if each row, column, and diagonal
     *          add-up to the constant; false otherwise
     */
    public boolean isMagical()
    {

    }

    /**
     * @return true if each row adds-up to the constant;
     *          false otherwise
     */
    private boolean isMagicalRows()
    {

    }

    /**
     * @return true if each column adds-up to the constant;
     *          false otherwise
     */
    private boolean isMagicalColumns()
    {

    }

    /**
     * @return true if each diagonal adds-up to the constant;
     *          false otherwise
     */
    private boolean isMagicalDiagonals()
    {

    }

    /**
     * @return A String representation of this MagicSquare.
     */
    public String toString()
    {
        String rtn = "";

        for(int[] row : square)
        {
            for (int element : row)
                rtn += element + "\t";
            rtn += "\n";
        }

        return rtn;
    }
}