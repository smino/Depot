import java.util.List;

/**
 * The type Lager.
 */
public class Lager {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        List<Artikel> produceWear;
        List<Artikel> sellWear;
        List<Artikel> lager;

        produceWear  = Production.produce(500);
        sellWear = Verkauf.sell(produceWear, 200);

        System.out.println(String.format("Article produced: %d\nArticle sold: %d\nDiff: %d", produceWear.size(),
                sellWear.size(), produceWear.size() - sellWear.size()));
    }
}