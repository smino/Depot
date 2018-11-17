/**
 * The type Artikel.
 */
class Artikel {

    /**
     * The Amount.
     */
    private int amount;
    /**
     * The Id.
     */
    private int id;

    /**
     * Instantiates a new Artikel.
     *
     * @param amount the amount
     * @param id     the id
     */
    Artikel(int amount, int id){
        this.amount = amount;
        this.id = id;
    }

    /**
     * Gets amount.
     *
     * @return the amount
     */
    int getAmount() {
        return amount;
    }

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    void setId(int id) {
        this.id = id;
    }
}
