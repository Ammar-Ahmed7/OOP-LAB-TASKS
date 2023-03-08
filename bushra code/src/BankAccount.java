import com.sun.tools.javac.Main;

import java.util.Scanner;
public class BankAccount{
    private String firstName;
    private String lastName;
    private double accBal;
    private int depositTrans=0;
    private int withdrawTrans=0;
    int choice2;
    int choice3;
    int date;
    int month;
    int date2;
    int month2;
    int counter=0;

    Scanner input = new Scanner(System.in);

    public BankAccount(String firstName, String lastName, double accBal) {
        this.firstName= firstName;
        this.lastName= lastName;
        this.accBal= accBal;
    }

    public void balance(double accBal){
        this.accBal=accBal;
    }

    public void deposit(double num){
        if (accBal >= 100000){
            accBal= accBal + num + num/100;
        }
        else
            accBal= accBal + num;
    }
    public void withdraw(double num){
        if (accBal < 50000) {

            System.out.println("Are you sure you want to withdraw, it would make your balance below 50,000. Press 1 to continue and 0 to abort");
            System.out.println("Enter you withdraw choice: ");
            int choice2 = input.nextInt();
            switch (choice2) {
                case 1:
                    accBal = accBal - num - (0.02 * num);
                    break;
                case 2:
                    System.exit(0);
                    break;
            }
        }
        else
            accBal=accBal - num;
    }

    public int getDepositTrans() {

        return depositTrans++;
    }

    public int getWithdrawTrans() {
        return withdrawTrans++;
    }

    public double getAccBal() {
        return accBal;
    }

    public void year1(){
        System.out.println("Enter date : ");
        date= input.nextInt();
        System.out.println("Enter month: ");
        month = input.nextInt();

    }
    public void year2(){
        System.out.println("Enter date : ");
        date2= input.nextInt();
        System.out.println("Enter month: ");
        month2 = input.nextInt();
    }

    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

    public int getDate2() {
        return date2;
    }

    public int getMonth2() {
        return month2;
    }

    public void createAccount(){
        System.out.println("Enter 1 for standard account and 2 for premium account");
        int ch = input.nextInt();
        switch(ch) {
            case 1:
                System.out.println("SMS Alerts and Debit Card. Press 1 to subscribe and 2 to exit.");
                System.out.println("Enter your account choice: ");
                int choice3 = input.nextInt();
                switch (choice3) {
                    case 1:
                        System.out.println("Press 1 to subscribe SMS alert and 2 to opt debit card");
                        System.out.println("Enter you subscription choice:");
                        int choice4 = input.nextInt();
                        switch (choice4) {
                            case 1:
                                year1();
                                year2();
                                if (getDate() == getDate2() && getMonth() == getMonth2()) {
                                    accBal = accBal - 2000;
                                    System.out.println(getAccBal());
                                }
                                else {
                                    System.out.println(getAccBal());
                                }
                                break;

                            case 2:
                                year1();
                                year2();
                                if (getDate() == getDate2() && getMonth() == getMonth2()) {

                                    accBal = accBal - 5000;
                                    System.out.println(getAccBal());
                                }
                                else {
                                    System.out.println(getAccBal());
                                }
                                break;
                            case 3:
                                year1();
                                year2();
                                if (getDate() == getDate2() && getMonth() == getMonth2()) {

                                    accBal = accBal - 7000;
                                    System.out.println(getAccBal());
                                }
                                else {
                                    System.out.println(getAccBal());
                                }
                                break;

                        }
                    case 2:
                        break;

                }
            case 2:
                if (getAccBal() >= 3000000) {
                    System.out.println("SMS Alerts and Debit Card. Press 1 to subscribe and 2 to exit.");
                    System.out.println("Enter your account choice: ");
                    int cho3 = input.nextInt();
                    switch (cho3) {
                        case 1:
                            System.out.println("Press 1 to subscribe SMS alert and 2 to opt debit card");
                            System.out.println("Enter you subscription choice:");
                            int choice5 = input.nextInt();
                            switch (choice5) {
                                case 1:
                                    year1();
                                    year2();
                                    if (getDate() == getDate2() && getMonth() == getMonth2()) {

                                        accBal = accBal - 2000;
                                        System.out.println(getAccBal());
                                    }
                                    else {
                                        System.out.println(getAccBal());
                                    }
                                    break;
                                case 2:
                                    year1();
                                    year2();
                                    if (getDate() == getDate2() && getMonth() == getMonth2()) {

                                        accBal = accBal - 5000;
                                        System.out.println(getAccBal());
                                    }
                                    else {
                                        System.out.println(getAccBal());
                                    }
                                    break;
                                case 3:
                                    year1();
                                    year2();
                                    if (getDate() == getDate2() && getMonth() == getMonth2()) {

                                        accBal = accBal - 7000;
                                        System.out.println(getAccBal());
                                    }
                                    else {
                                        System.out.println(getAccBal());
                                    }
                                    break;


                            }
                        case 2:
                            break;

                    }

                }
                else {
                    System.out.println(getAccBal());

                }
        }
    }
}