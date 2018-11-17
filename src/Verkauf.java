import java.util.ArrayList;
import java.util.List;

/**
 * The type Verkauf.
 */
class Verkauf {

    /**
     * The constant PRODUCTION_DAYS.
     */
    private static final int PRODUCTION_DAYS = 312;

    /**
     * The constant STORE_HOURS_PER_DAY.
     */
    private static final int STORE_HOURS_PER_DAY = 8;

    /**
     * Sell list.
     *
     * @param toSell     the to sell
     * @param sellTarget the sell target
     * @return the list
     */
    static List<Artikel> sell(List<Artikel> toSell, int sellTarget){
        List<Artikel> sold = new ArrayList<>();
        if(!minAmount(sellTarget)) {
            for (int i = 0; i < PRODUCTION_DAYS; i++) {
                for (int j = 0; j < STORE_HOURS_PER_DAY; j++) {
                    if (toSell.size() <= sold.size()) break;
                    if (Math.random() > 0.9) sold.add(toSell.get(0));
                }
            }

            return sold;
        }

        return new ArrayList<>();
    }

    /**
     * Min amount boolean.
     *
     * @param target the target
     * @return the boolean
     */
    private static boolean minAmount(int target){
        return target <= 0;
    }
}