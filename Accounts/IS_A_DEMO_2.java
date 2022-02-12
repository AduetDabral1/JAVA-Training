import java.util.Date;
class Account_2{
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


class SavingsAccount_2 extends Account_2{
    double minBalance;
    void computeROI(){
        System.out.println("SA ROI is 6%");
    }
    
    @Override
    void withdrawl(){
        System.out.println("Withdrawl Limit is 50K");
    }
}


class CurrentAccount_2 extends Account_2{
    double odLimit;   //overdraft limit
    void computeOD(){
        System.out.println("OD Limit is 1 lakh");
    }
}


public class IS_A_DEMO_2 {
   public static void main(String[] args) {
       //Saving Account is larger because it has its own features alongwith fatures of parent class
       //Now only those functions are accessible which are common in both classes
        Account_2 acc = new SavingsAccount_2();  //Only common methods are accessible here
        acc.openAccount();
        acc.deposit();
        acc.withdrawl();
        // acc.computeROI();

        System.out.println("===========================================================");

        acc = new CurrentAccount_2();
        acc.openAccount();
        acc.deposit();
        acc.withdrawl();
        // acc.computeOD();
    }
}

