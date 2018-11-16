public abstract class Artikel {

    public static int amount;
    public static int id;

    public Artikel(int amount, int id){
        this.amount = amount;
        this.id = id;
    }

    public static int getAmount() {
        return amount;
    }

    public static int setAmount(int amount) {
        Artikel.amount = amount;
        return amount;
    }

    public static int setId(int id) {
        Artikel.id = id;
        return id;
    }
}
