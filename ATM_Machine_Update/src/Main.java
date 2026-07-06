package ATMmachine;

import java.util.Scanner;

class ATM {

    private float balance = 0;
    private int PIN = 6397;
    private String user = "Vineet";
    private String PASS = "0000";

    private Scanner sc = new Scanner(System.in);

    // ANSI Colors
    public static final String RESET = "\u001b[0m";
    public static final String RED = "\u001b[31m";
    public static final String GREEN = "\u001b[32m";
    public static final String YELLOW = "\u001b[33m";
    public static final String BLUE = "\u001b[34m";
    public static final String BOLD = "\u001b[1m";

    // 🔐 LOGIN SYSTEM
    public void login() {
        int attempts = 3;

        while (attempts > 0) {
            System.out.print(BLUE + BOLD + "Enter PIN: ");
            int enteredPin = sc.nextInt();

            System.out.print(BLUE + BOLD + "Enter Password: ");
            String enteredPass = sc.next();

            if (enteredPin == PIN && enteredPass.equals(PASS)) {
                System.out.println(GREEN + BOLD + "\nLogin Successful! Welcome " + user);
                menu();
                return;
            } else {
                attempts--;
                System.out.println(RED + BOLD + "Invalid credentials! Attempts left: " + attempts);
            }
        }

        System.out.println(RED + BOLD + "Too many failed attempts. Exiting...");
    }

    // 📋 MENU
    public void menu() {
        while (true) {
            System.out.println(BLUE + BOLD + "\nChoose an option:");
            System.out.println(YELLOW + "1. Check Balance");
            System.out.println(YELLOW + "2. Withdraw Money");
            System.out.println(YELLOW + "3. Deposit Money");
            System.out.println(YELLOW + "4. Change PIN/Password");
            System.out.println(YELLOW + "5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    changeCredentials();
                    break;
                case 5:
                    System.out.println(GREEN + "Thank you for using ATM!");
                    return;
                default:
                    System.out.println(RED + "Invalid choice!");
            }
        }
    }

    // 💰 CHECK BALANCE
    private void checkBalance() {
        System.out.println(GREEN + "Current Balance: " + balance);
    }

    // 💸 WITHDRAW
    private void withdrawMoney() {
        System.out.print(BLUE + "Enter amount: ");
        float amount = sc.nextFloat();

        System.out.print("Enter Password: ");
        String pass = sc.next();

        if (!pass.equals(PASS)) {
            System.out.println(RED + "Incorrect Password!");
            return;
        }

        if (amount > balance) {
            System.out.println(RED + "Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println(GREEN + "Withdrawal successful!");
        }
    }

    // 💵 DEPOSIT
    private void depositMoney() {
        System.out.print(BLUE + "Enter amount: ");
        float amount = sc.nextFloat();
        balance += amount;
        System.out.println(GREEN + "Deposit successful!");
    }

    // 🔄 CHANGE PIN/PASSWORD
    private void changeCredentials() {
        System.out.print("Enter current password: ");
        String currentPass = sc.next();

        if (!currentPass.equals(PASS)) {
            System.out.println(RED + "Incorrect password!");
            return;
        }

        System.out.println("1. Change PIN");
        System.out.println("2. Change Password");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter current PIN: ");
                int currentPin = sc.nextInt();

                if (currentPin == PIN) {
                    System.out.print("Enter new PIN: ");
                    PIN = sc.nextInt();
                    System.out.println(GREEN + "PIN updated!");
                } else {
                    System.out.println(RED + "Incorrect PIN!");
                }
                break;

            case 2:
                System.out.print("Enter new Password: ");
                PASS = sc.next();
                System.out.println(GREEN + "Password updated!");
                break;

            default:
                System.out.println(RED + "Invalid option!");
        }
    }
}

// 🚀 MAIN CLASS
public class ATMmachine {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.login();
    }
}