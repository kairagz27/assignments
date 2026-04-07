import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        LinkedList<BankAccount> accounts = new LinkedList<>(); // Основная база клиентов [cite: 108]
        Stack<String> history = new Stack<>(); // История транзакций [cite: 109]
        Queue<BankAccount> accountRequests = new LinkedList<>(); // Очередь на открытие счета
        Queue<String> billQueue = new LinkedList<>(); // Очередь на оплату счетов


        accounts.add(new BankAccount("KZ001", "Ali", 150000));
        accounts.add(new BankAccount("KZ002", "Sara", 220000));
        billQueue.add("Electricity Bill");
        billQueue.add("Internet Bill");


        System.out.println("--- Task 6: Physical Data Structure (Array) ---");
        BankAccount[] bankArray = new BankAccount[3];
        bankArray[0] = new BankAccount("KZ101", "Dias", 50000);
        bankArray[1] = new BankAccount("KZ102", "Aruzhan", 120000);
        bankArray[2] = new BankAccount("KZ103", "Nurbek", 80000);
        for (int i = 0; i < bankArray.length; i++) {
            System.out.println((i + 1) + ". Name: " + bankArray[i].getUsername() + ", Balance: " + (int)bankArray[i].getBalance());
        }
        System.out.println("-----------------------------------------------\n");

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;


        while (isRunning) {
            System.out.println("\n=== MINI BANKING MENU ===");
            System.out.println("1. Enter Bank");
            System.out.println("2. Enter ATM");
            System.out.println("3. Admin Area");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Bank Menu ---");
                    System.out.println("1. Submit account opening request");
                    System.out.println("2. Deposit money");
                    System.out.println("3. Withdraw money");
                    System.out.print("Choose option: ");
                    int bankChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (bankChoice == 1) {
                        System.out.print("Enter new username: ");
                        String newName = scanner.nextLine();
                        accountRequests.add(new BankAccount("KZ_NEW", newName, 0));
                        System.out.println("Request submitted to Admin Queue.");
                    } else if (bankChoice == 2 || bankChoice == 3) {
                        System.out.print("Enter username: ");
                        String name = scanner.nextLine();
                        BankAccount acc = findAccount(accounts, name);
                        if (acc != null) {
                            System.out.print("Enter amount: ");
                            double amount = scanner.nextDouble();
                            if (bankChoice == 2) {
                                acc.deposit(amount);
                                history.push("Deposit " + amount + " to " + name);
                                System.out.println("Success. New balance: " + acc.getBalance());
                            } else {
                                acc.withdraw(amount);
                                history.push("Withdraw " + amount + " from " + name);
                                System.out.println("Success. New balance: " + acc.getBalance());
                            }
                        } else {
                            System.out.println("Account not found.");
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n--- ATM Menu ---");
                    System.out.print("Enter username: ");
                    String atmName = scanner.nextLine();
                    BankAccount atmAcc = findAccount(accounts, atmName);

                    if (atmAcc != null) {
                        System.out.println("1. Balance enquiry");
                        System.out.println("2. Withdraw");
                        System.out.print("Choose option: ");
                        int atmChoice = scanner.nextInt();
                        if (atmChoice == 1) {
                            System.out.println("Current balance: " + atmAcc.getBalance());
                        } else if (atmChoice == 2) {
                            System.out.print("Enter amount to withdraw: ");
                            double wAmount = scanner.nextDouble();
                            atmAcc.withdraw(wAmount);
                            history.push("ATM Withdraw " + wAmount + " from " + atmName);
                            System.out.println("Please take your cash. New balance: " + atmAcc.getBalance());
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Admin Area ---");
                    System.out.println("1. View and process account queue");
                    System.out.println("2. View bill payment queue");
                    System.out.print("Choose option: ");
                    int adminChoice = scanner.nextInt();

                    if (adminChoice == 1) {
                        if (!accountRequests.isEmpty()) {
                            BankAccount newAcc = accountRequests.poll();
                            accounts.add(newAcc);
                            System.out.println("Approved account for: " + newAcc.getUsername());
                        } else {
                            System.out.println("No pending account requests.");
                        }
                    } else if (adminChoice == 2) {
                        if (!billQueue.isEmpty()) {
                            System.out.println("Processing: " + billQueue.poll());
                            System.out.println("Remaining bills in queue: " + billQueue.size());
                        } else {
                            System.out.println("No pending bills.");
                        }
                    }
                    break;

                case 4:
                    isRunning = false;
                    System.out.println("Exiting system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }


    private static BankAccount findAccount(LinkedList<BankAccount> accounts, String username) {
        for (BankAccount acc : accounts) {
            if (acc.getUsername().equalsIgnoreCase(username)) {
                return acc;
            }
        }
        return null;
    }
}