import java.util.Date;
class Account{
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


class SavingsAccount extends Account{
    double minBalance;
    void computeROI(){
        System.out.println("SA ROI is 6%");
    }
    
    @Override
    void withdrawl(){
        System.out.println("Withdrawl Limit is 50K");
    }
}


class CurrentAccount extends Account{
    double odLimit;   //overdraft limit
    void computeOD(){
        System.out.println("OD Limit is 1 lakh");
    }
}


public class IS_A_DEMO {
   public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.openAccount();
        sa.deposit();
        sa.withdrawl();
        sa.computeROI();

        System.out.println("===========================================================");

        CurrentAccount ca = new CurrentAccount();
        ca.openAccount();
        ca.deposit();
        ca.withdrawl();
        ca.computeOD();
    }
}

