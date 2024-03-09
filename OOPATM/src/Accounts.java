import java.util.Scanner;

public class Accounts {

    private String username;
    private String password;
    private int balance;

    public Accounts(String username, String password, int balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }
    Scanner scanner = new Scanner(System.in);

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit (int deposit){
        balance += deposit;
        System.out.println("Balans: " + balance);
        while (true) {
            System.out.println("Funksiya secin: ");
            String funksiya = scanner.nextLine();

            if (funksiya.equals("1")) {
                System.out.println("Balans: " + balance);

            } else if (funksiya.equals("2")) {
                System.out.println("Elave edeceyiniz miqdar: ");
                int elave = scanner.nextInt();
                scanner.nextLine();
                balance +=elave;
                System.out.println("Balans: " + balance);

            } else if (funksiya.equals("3")) {
                System.out.println("Cixarmaq istediyiniz miqdar: ");
                int cixarilan = scanner.nextInt();
                scanner.nextLine();
                if (balance - cixarilan <0) {
                    System.out.println("Emeliyyat mumkun deyil...");
                } else {
                    balance -= cixarilan;
                    System.out.println("Balans: " + balance);
                }
            } else{
                System.out.println("Sistemden chixildi...");
                break;
            }

        }


    }
    public void withdraw (int withdraw) {
        if (withdraw > balance) {
            System.out.println("This function cannot be applied..");
        } else {
            balance -= withdraw;
            System.out.println("Balance: " + balance);
        }
    }

}




