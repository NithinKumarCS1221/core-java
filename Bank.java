class Bank {
    String bankName;
    String branch;
    int numberOfEmployees;
    int numberOfAccounts;
    String managerName;
    boolean hasATM;
    boolean hasOnlineBanking;
    double interestRate;
    int establishedYear;
    String bankType;

    static String country = "India";
    static String serviceType = "Finance";

    public String openAccount(String customerName) {
        System.out.println("Account Opened: " + customerName);
        return customerName;
    }

    public String closeAccount(String customerName) {
        System.out.println("Account Closed: " + customerName);
        return customerName;
    }

    public double deposit(double amount) {
        System.out.println("Amount Deposited: " + amount);
        return amount;
    }

    public double withdraw(double amount) {
        System.out.println("Amount Withdrawn: " + amount);
        return amount;
    }

    public boolean startService(boolean status) {
        System.out.println("Service Started: " + status);
        return status;
    }

    public boolean stopService(boolean status) {
        System.out.println("Service Stopped: " + status);
        return status;
    }

    public int countCustomers(int total) {
        System.out.println("Total Customers: " + total);
        return total;
    }

    public boolean provideLoan(boolean status) {
        System.out.println("Loan Provided: " + status);
        return status;
    }

    public String assignAccount(String accNo) {
        System.out.println("Account Assigned: " + accNo);
        return accNo;
    }

    public boolean maintainSecurity(boolean status) {
        System.out.println("Security Maintained: " + status);
        return status;
    }
}