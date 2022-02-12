public class EmployeeData{
    private int id;
    private String name;
    private double salary;
    private String bankName;
    private long loan;

    public EmployeeData(){
        this.bankName = "ABC National Bank";
    }

    public EmployeeData(int id, String name, double salary){
        this(); // calling default constructor
                this.id = id;
                this.name = name;
                this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getHRA() {
        return salary * 0.15;
    }
    
    public double getTA() {
        return salary * 0.10;
    }
    
    public double getDA() {
        return salary * 0.08;
    }
    
    public double getTDS() {
        return salary * 0.12;
    }

    public String displayInfo() {
        CommonUtils utils = new CommonUtils();
        this.name = utils.getName(name);
        
        this.salary = this.salary + getHRA() + getDA() + getTA() - getTDS();
        String formattedSalary = utils.formatSalary(salary);
        String date = utils.formatDate();

        return "Date : " + date + "\n" + "Name is : " + this.name + "\n" + "Salary is : " + formattedSalary + "\n" + "Bank is : " + bankName;
            }

    public void loanEligible (){
        BankLoan L1 = new BankLoan();
        if(L1.isEligible(this.salary)){
            long sanctionedLoan = L1.loanAmount(this.salary);
            System.out.println("The loan amount sanctioned is: " + sanctionedLoan);
        }
        else
            System.out.println("You are not eligible for the loan.");
    }
}
