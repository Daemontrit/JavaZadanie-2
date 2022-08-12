public class Main {
    public static void main(String[] args) {
        int startingBalance = 200;
        int replenishment = 7000;
        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
            startingBalance += bonus + replenishment;
            System.out.println("Итоговый баланс: " + startingBalance);
        } else {
            startingBalance += replenishment;
            System.out.println("Итоговый баланс: " + startingBalance);
        }

    }
}
