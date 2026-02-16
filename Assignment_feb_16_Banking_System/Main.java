import java.time.LocalDateTime;
import java.util.*;

enum ActionType{
    DEPOSIT, WITHDRAW, TRANSFER, LOGIN, FAILED_LOGIN;
}

enum Status{
    SUCCESS, FAILED;
}

class LogEntry{
    static int logId;
    long accountNumber;
    ActionType actionType;
    double amount;
    LocalDateTime now;

    LogEntry(long accountNumber, double amount, ActionType actionType){
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.actionType = actionType;
        this.now = LocalDateTime.now();
        ++logId;
        LogManager.addLog(this);
    }

    @Override
    public String toString() {
        return "Account: " + accountNumber + "\nAction: " + actionType + "\nAmount: " + amount + "\nTime: " + now;
    }
}

class LogManager{
    static TreeMap<Long, LogEntry> entries = new TreeMap<Long, LogEntry>();
    static Queue<LogEntry> recent = new ArrayDeque<>();

    static void addLog(LogEntry log){
        entries.put(log.accountNumber, log);
        recent.add(log);
    }

    static void getLogsByAccount(long accountNumber) {
        if (!entries.containsKey(accountNumber)) {
            System.out.println("No logs found!");
        }
        else{
            System.out.println(entries.get(accountNumber));
        }
    }

    static void getRecentLogs() {
        if (recent.isEmpty()) {
            System.out.println("No recent logs.");
            return;
        }

        Iterator<LogEntry> it = ((ArrayDeque<LogEntry>) recent).descendingIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    static void searchByAction(ActionType action) {
        boolean found = false;
        for (LogEntry log : entries.values()) {
            if (log.actionType == action) {
                System.out.println(log);
                found = true;
            }
        }
        if (!found) System.out.println("No logs found!");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        while(loop){
            System.out.println("1. Add Log\r\n2. Get Logs by Account\r\n3. Get Recent Logs\r\n4. Search by Action\r\n5. Exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter Account Number: ");
                    long acc = sc.nextLong();

                    System.out.println("Select Action:");
                    System.out.println("1.DEPOSIT 2.WITHDRAW 3.TRANSFER 4.LOGIN 5.FAILED_LOGIN");
                    int act = sc.nextInt();

                    ActionType action = ActionType.values()[act - 1];

                    double amount = 0;
                    if (action == ActionType.DEPOSIT ||
                        action == ActionType.WITHDRAW ||
                        action == ActionType.TRANSFER) {
                        System.out.print("Enter Amount: ");
                        amount = sc.nextDouble();
                    }

                    new LogEntry(acc, amount, action);
                    System.out.println("Log added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    long account = sc.nextLong();
                    LogManager.getLogsByAccount(account);
                    break;

                case 3:
                    LogManager.getRecentLogs();
                    break;

                case 4:
                    System.out.println("Select Action:");
                    System.out.println("1.DEPOSIT 2.WITHDRAW 3.TRANSFER 4.LOGIN 5.FAILED_LOGIN");
                    int a = sc.nextInt();
                    LogManager.searchByAction(ActionType.values()[a - 1]);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    loop = false;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
