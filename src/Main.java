public class Main {
    public static void main(String[] args) {

        int Balance = 100;
        int Deposit = 1100;
        int Bonus;
        boolean Operable = Deposit > 1000;
        if (Operable) {
            Bonus = Deposit / 100;
        } else {
            Bonus = 0;
        }
        int FinalBalance = Balance + Deposit + Bonus;
        System.out.println("Баланс:" + Balance);
        System.out.println("Сумма пополнения:" + Deposit);
        System.out.println("Бонус:" + Bonus);
        System.out.println("Итоговый баланс:" + FinalBalance);

    }
}