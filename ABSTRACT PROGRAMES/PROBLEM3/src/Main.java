/*
/Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw().
Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the
respective methods to handle deposits and withdrawals for each account type.
 */

abstract class BankAccount{

    public abstract double Deposit();
    public abstract double Withdraw();
}

class SavingsAccount extends BankAccount
{

    private double SavingsAccount_Balance;
    private double DepositResult;
    private double WithdrawAmount;

    SavingsAccount(double SavingsAccount_Balance, double DepositResult, double WithdrawAmount)
    {
        this.SavingsAccount_Balance = SavingsAccount_Balance;
        this.DepositResult = DepositResult;
        this.WithdrawAmount = WithdrawAmount;
    }


    public void AccountName()

    {
        System.out.println("YOUR SAVING ACCOUNT NAME IS = PRAJEESH");
    }

    public void BeforeAccountbalance()
    {
        System.out.println("YOUR CURRENT AVAILABLE BALANCE IS : " + SavingsAccount_Balance);
    }

    @Override
    public double Deposit() {

        System.out.println("YOUR DEPOSIT AMOUNT IS : " + DepositResult);
        System.out.println("YOUR BALANCE FOR AFTER DEPOSITION : " + (SavingsAccount_Balance + DepositResult));
        return 0;
    }

    @Override
    public double Withdraw()
    {
        System.out.println("YOUR WITHDRAW AMOUNT IS : " + WithdrawAmount);

        if(WithdrawAmount > SavingsAccount_Balance)
        {
            System.out.println(" ");
            System.out.println("INSUFFICIENT BALANCE TRY LATER..");
            System.exit(0);
        }

        return 0;
    }

    public void AfterAccountbalance()
    {
        System.out.println("YOUR BALANCE FOR AFTER WITHDRAW : " + ((SavingsAccount_Balance + DepositResult) - WithdrawAmount));
    }
}

class CurrentAccount extends BankAccount
{

    private String AccountName;
    private double AccountBalance;
    private double Deposition;
    private double Withdraw;
    private String BankName;

    CurrentAccount(String AccountName, double AccountBalance, double Deposition, double Withdraw, String BankName)
    {
        this.AccountName = AccountName;
        this.AccountBalance = AccountBalance;
        this.Deposition = Deposition;
        this.Withdraw = Withdraw;
        this.BankName = BankName;
    }


    public void AccountantName()
    {
        System.out.println("CURRENT ACCOUNTANT NAME IS : " + AccountName);
    }

    public void CurrentAccountantBalance()
    {
        System.out.println("CURRENT ACCOUNT BALANCE IS : " + AccountBalance);
    }

    @Override
    public double Deposit()
    {
        System.out.println("YOUR DEPOSIT AMOUNT IS : " + Deposition);
        System.out.println("YOUR BALANCE AFTER DEPOSITION : " + (AccountBalance + Deposition));
        return 0;
    }

    @Override
    public double Withdraw()
    {
        System.out.println("YOUR WITHDRAW AMOUNT IS : " + Withdraw);

        if (Withdraw > AccountBalance)
        {
            System.out.println(" ");
            System.out.println("INSUFFICIENT BALANCE TRY LATER..");
            System.exit(0);

        }else {

            System.out.println("YOUR BALANCE AFTER WITHDRAWING.. :  " + ((AccountBalance + Deposition) - Withdraw));
        }
        return 0;
    }

    public void AccountLocation()
    {
        System.out.println("KERALA : " + BankName);
    }
}

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world! Abstract Prajeesh...");
        System.out.println(" ");

        double Account_Balance = 1000.00;
        double Deposit_Amount = 200.00;
        double Withdraw_Amount = 300.00;

        SavingsAccount Saving = new SavingsAccount(Account_Balance, Deposit_Amount, Withdraw_Amount);
        Saving.AccountName();
        Saving.BeforeAccountbalance();
        Saving.Deposit();
        Saving.Withdraw();
        Saving.AfterAccountbalance();

        System.out.println(" ");
        System.out.println(" **********************************************************");
        System.out.println(" ");

        String AccountName = "SUJEESH";
        double AccountBalance = 5000.0;
        double Deposit = 1000.0;
        double Withdraw = 2000.0;
        String BankName = "STATE BANK OF INDIA";

        CurrentAccount Account = new CurrentAccount(AccountName, AccountBalance, Deposit, Withdraw, BankName);
        Account.AccountantName();
        Account.CurrentAccountantBalance();
        Account.Deposit();
        Account.Withdraw();
        Account.AccountLocation();

        System.out.println(" ");
        System.out.println(" **********************************************************");
    }
}