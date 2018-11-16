public class Verkauf extends Artikel{

    static int[][] sellWear;
    private static int[][] wear;

    public Verkauf(int amount, int id) {
        super(amount, id);
    }

    /**
     * int day: 8 Stunden pro Tag
     * Methode sell() füllt ein zweidimensionales Array mit ID und Menge von Artikeln die innerhalb
     * @return
     */
    public static int[][] sell(){
        wear = new int [setId(id)][setAmount(amount)];
        int days = 312;     //312 Tage im Jahr, gerechnet 364 - jeden 7ten Tag(Sonntag)
        int daycounter = 1;
        int day = 8;
            if(!minAmount(getAmount()) && daycounter <= days) {
            for (int i = 0; i < days; i++) {
                daycounter++;
                    for (int j = 0; j < day; j++) {
                        Artikel.amount += (int) (Math.random() * (12 - 6) + 1);
                        Artikel.id += (int) (Math.random() * (200) + 1);
                        wear[j][j] = Artikel.id;
                        wear[j][j + 1] = Artikel.amount;
                    }
                }
                return sellWear = wear;
            }
            return sellWear;
    }

    /**
     *
     * @param amount Anzahl an Artikeln
     * @return liefert bei Anzahl der Artikel größer minValue false zurück, ansonsten true
     * es kann minimal 1 Artikel verkauft werden.
     */
    public static boolean minAmount(int amount){
        int minValue = 0;
        if(amount > minValue) return false;
        else return true;
    }
}