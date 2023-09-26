public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int deposit = 1100;
        int bonus;
        boolean operable = deposit > 1000;
        if (operable) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int finalBalance = balance + deposit + bonus;
        System.out.println("Баланс:" + balance);
        System.out.println("Сумма пополнения:" + deposit);
        System.out.println("Бонус:" + bonus);
        System.out.println("Итоговый баланс:" + finalBalance);

    }
}