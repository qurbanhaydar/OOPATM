public class Main {

    public static void main(String[] args) {

        ATM atm = new ATM();
        Accounts account = new Accounts ("qurban", "12345", 1000);

        atm.work(account);
        System.out.println("Exiting....");
    }
}
