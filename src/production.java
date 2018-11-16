public class production extends Artikel{

    static int[][] produceWear;
    private static int[][] wear;

    public production(int amount, int id) {
        super(amount, id);
    }

    /**
     * Methode produce() SOLL zumindest... bis zu maxAmount Artikel mit ID und Menge erstellen.
     * @return liefert ein zweidimensionales Array mit den Inhalten ID und Menge für die produzierten Artikel.
     */
    public static int[][] produce(){
        int days = 312;     //312 Tage im Jahr, gerechnet 364 - jeden 7ten Tag(Sonntag)
        int daycounter = 1;
        wear = new int[setId(id)][setAmount(amount)];
        if(daycounter <= days) {
            for (int i = 0; i < days; i++) {
                daycounter++;
                if(!maxAmount(getAmount())){
                    Artikel.amount += (int)(Math.random()*(130-115)+1);
                    Artikel.id += (int)(Math.random()*(200)+1);
                    wear[i][i] += Artikel.id;
                    wear[i][i+1] += Artikel.amount;
                }else{
                    continue;
                }
            }
            return produceWear = wear;
        }
        return wear;
    }

    /**
     *
     * @param amount Anzahl an Artikeln
     * @return liefert bei Anzahl der Artikel über maxValue false zurück, ansonsten true
     * es können maximal 1000 Artikel gelagert werden.
     */
    public static boolean maxAmount(int amount){
        int maxValue = 1000;
        if(amount < maxValue) return false;
        else return true;
    }
}
