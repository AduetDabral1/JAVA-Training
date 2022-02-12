public class BankLoan {
    public boolean isEligible (double salary){
        if(salary<20000)
            return false;
        else
            return true;
    }
    
    public long loanAmount (double salary){
        if (salary>20000 && salary<=30000)
            return 1000000;
        if (salary>30000 && salary<=50000)
            return 2000000;
        if (salary>50000 && salary<100000)
            return 5000000;
        return 0;
    }
}
