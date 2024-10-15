package ki304_Boiko_lab6;

public interface Product extends Comparable<Product> {
    /**
     *	Gets the price of the product.
     *
     *	@return The price of the product.
     */
    public int getPrice();

    /**
     *	Checks if the product has any defects.
     */
    public void checkIfIsDefect();

    /**
     *	Prints information about the product.
     */
    public void print();
}
