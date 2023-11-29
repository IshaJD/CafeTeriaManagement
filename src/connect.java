public class connect {
    public static void connection() {
        int i = 0;
        if (i == 0) {
            database.createDb();
            database.createTable();
            i++;
        }
    }
}
