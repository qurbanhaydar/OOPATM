
import java.util.Scanner;


public class ATM {

    public void work(Accounts account) {
        Login login = new Login();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome....");


        System.out.println("UserLogin...");

        int logincount = 3;

        while (true) {
            if (login.login(account)) {
                System.out.println("Succesfully Login...");
                break;


            }
            else {
                System.out.println("Login Unsuccesfully...");
                logincount -= 1;
                System.out.println("Login Count : " + logincount);
            }
            if (logincount == 0 ){
                System.out.println("Exiting...");

                return;

            }



        }

        System.out.println("*********************************");
        String islemler = "1. Balance: \n"
                + "2. Deposit\n"
                + "3. Withdraw\n"
                + "For exiting press 'q' ";
        System.out.println(islemler);
        System.out.println("**********************************");


        while (true) {
            System.out.println("Choose Function : ");
            String function = scanner.nextLine();

            if (function.equals("q")){

                break;

            }
            else if (function.equals("1")){
                System.out.println("Balance : " + account.getBalance());
            }
            else if (function.equals("2")){

                System.out.print("Deposit : ");
                int miqdar = scanner.nextInt();
                scanner.nextLine();
                account.deposit(miqdar);

            }
            else if (function.equals("3")) {

                System.out.print("Withdraw : ");
                int miqdar = scanner.nextInt();
                scanner.nextLine();
                account.withdraw(miqdar);

            }
            else {

                System.out.println("Wrong Function....");
            }



        }
    }

}
