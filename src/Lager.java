public class Lager extends Artikel{

    public Lager(int amount, int id) {
        super(amount, id);
    }

    /**
     * Main sollte die Differenz von wear und sellWear im Lager anzeigen
     * @param args
     */
    public static void main(String[] args) {
        int[][] produceWear = production.produceWear;
        int[][] sellWear = Verkauf.sellWear;
        int[][] lager;
        produceWear  = production.produce();
        sellWear = Verkauf.sell();
        int idg = produceWear [id][0] - sellWear[id][0];
        int amountg = produceWear [0][amount] - sellWear[0][amount];
        lager = new int[idg][amountg];

        System.out.println(String.format("Artikel: %s\n", lager));
    }
}