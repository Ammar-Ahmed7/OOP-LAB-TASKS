import java.util.Scanner;
public class BankAccountTest {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String Name = input.nextLine();

        System.out.println("Enter account balance: ");
        double balance = input.nextDouble();

        BankAccount acc1 = new BankAccount(Name, balance);

        System.out.println("\n1. To deposit an amount\t2.To withdraw an amount\t3.To view the current balance\t4. To open an account\t5.To close the program");

        while(true){
            System.out.println("\nEnter choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nEnter the amount you want to deposit in your account ");
                    acc1.deposit(input.nextDouble());
                    acc1.getDepositTrans();
                    break;
                case 2:
                    System.out.println("\nEnter the amount you want to withdraw from your account ");
                    acc1.withdraw(input.nextDouble());
                    acc1.getWithdrawTrans();
                    break;

                case 3:
                    System.out.println("Account Title: " + Name);
                    System.out.println("Total deposits: " + acc1.getDepositTrans());
                    System.out.println("Total withdraws: " + acc1.getWithdrawTrans());
                    System.out.println(acc1.getAccBal());
                    break;
                case 4:
                    acc1.createAccount();
                    break;
                case 5:
                    System.exit(0);
                    break;

            }
        }
    }
}