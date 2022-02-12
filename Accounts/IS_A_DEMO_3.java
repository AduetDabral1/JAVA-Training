import java.util.Date;
class Account_3{
    int accountNo;
    double balance;
    String accHolderName;
    Date openDate;
    boolean status;

    void openAccount() {
        Date date = new Date();
        System.out.println("Account opening Date : "+ date);
    }
    
    void deposit(){
        System.out.println("Deposit function of Account class");
    }

    void withdrawl(){
        System.out.println("Withdrawl function of Account class");
    }
}


class SavingsAccount_3 extends Account_3{
    double minBalance;
    void computeROI(){
        System.out.println("SA ROI is 6%");
    }
    
    @Override
    void withdrawl(){
        System.out.println("Withdrawl Limit is 50K");
    }
}


class CurrentAccount_3 extends Account_3{
    double odLimit;   //overdraft limit
    void computeOD(){
        System.out.println("OD Limit is 1 lakh");
    }
}


public class IS_A_DEMO_3 {

    void caller(Account_3 account) {
        account.openAccount();
        account.deposit();
        account.withdrawl();

        if(account instanceof SavingsAccount_3){
            SavingsAccount_3 sa = (SavingsAccount_3) account;   //Down-casting
            sa.computeROI();
        }

        else if(account instanceof CurrentAccount_3){
            CurrentAccount_3 sa = (CurrentAccount_3) account;   //Down-casting
            sa.computeOD();
        }
    }
   public static void main(String[] args) {
       
        IS_A_DEMO_3 obj = new IS_A_DEMO_3();
        Account_3 acc = new SavingsAccount_3();            //Upcasting
        System.out.println("SAVINGS ACCOUNT");
        obj.caller(acc);

        System.out.println("======================================");

        acc = new CurrentAccount_3();
        System.out.println("CURRENT ACCOUNT");
        obj.caller(acc);
    }
}

