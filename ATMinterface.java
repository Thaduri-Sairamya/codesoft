import java.util.Scanner;
public class ATMinterface {
    private double balance;
    private int pin;
    public ATMinterface(double balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }
    public void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    public boolean authenticate(int enteredPin) {
        return enteredPin == pin;
    }
    public static void main(String[] args) {
        ATMinterface  atm = new ATMinterface(19000,8341);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        int enteredPin = scanner.nextInt();
        if (atm.authenticate(enteredPin)) {
            int choice;
            do {
                System.out.println("\nATM Menu:");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        atm.checkBalance();
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        atm.deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        atm.withdraw(withdrawAmount);
                        break;
                    case 4:
                        System.out.println("Exiting the ATM. Have a nice day!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } while (choice != 4);
        } else {
            System.out.println("Incorrect PIN. Access denied.");
        }

        scanner.close();
    }
}