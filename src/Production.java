import java.util.ArrayList;
import java.util.List;

/**
 * The type Production.
 */
class Production {

    /**
     * The constant PRODUCTION_DAYS.
     */
    private static final int PRODUCTION_DAYS = 312;

    /**
     * The constant ARTICLE_PER_DAYS.
     */
    private static final int ARTICLE_PER_DAYS = 25;

    /**
     * Produce list.
     *
     * @param productionTarget the production target
     * @return the list
     */
    static List<Artikel> produce(int productionTarget) {
        List<Artikel> wear = new ArrayList<>();

        for (int i = 0; i < PRODUCTION_DAYS; i++) {
            for (int j = 0; j < ARTICLE_PER_DAYS; j++) {
                if(!maxAmount(productionTarget, wear.size())){
                    int amount = (int)(Math.random()*(130-115)+1);
                    int id = (int)(Math.random()*(200)+1); //TODO: Increment ids

                    wear.add(new Artikel(amount, id));
                }
            }
        }

        return wear;
    }

    /**
     * Max amount boolean.
     *
     * @param target  the target
     * @param current the current
     * @return the boolean
     */
    private static boolean maxAmount(int target, int current){
        return current >= target;
    }
}
