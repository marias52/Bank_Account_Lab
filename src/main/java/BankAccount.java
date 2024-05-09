public class BankAccount {

    //properties
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance;
    private String accountType;
    private int overdraft;


    // constructor
    // setter
    public BankAccount(String inputFirstName, String inputLastName, String inputDateOfBirth, int inputAccountNumber, String inputAccountType, int inputOverdraft) {
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = inputAccountNumber;
        this.balance = 0; //initial bank account balance
        this.accountType = inputAccountType;
        this.overdraft = inputOverdraft;
    }

    //getter
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    // Deposit
    public int calculateDeposit(int amount) {
        return this.balance += amount;

    }

    //withdrawal
    public int calculateWithdrawal(int amount) {
        return this.balance -= amount;
    }

    // Interest
    public double calculateInterestToPay(int borrowed, double interest) {
        double interestAmount = borrowed * interest;
        return this.balance -= interestAmount;
    }

    public double calculateInterestGained(int balance, double interest) {
        double interestAmount = balance * interest;
        return this.balance += interestAmount;
    }

    //   Extension Task

    public String getAccountType() {
        return this.accountType;
    }

    public double calculatePayInterest(String accountType, int balance) {
        double interestRate;

        {
            if (accountType.equals("savings account")) {
                interestRate = 0.05;
            } else if (accountType.equals("current account")) {
                interestRate = 0.02;
            } else interestRate = 0.00;
        }
        double interestAmount = balance * interestRate;
        double newBalance = balance + interestAmount;

        return newBalance;

    }

    //Extension (overdraft)
        public int getOverdraft(int amount) {
        return this.overdraft -= amount;


        }
    }