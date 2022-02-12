class Employee{
        public static void main(String[] args) {
        EmployeeData Emp1 = new EmployeeData (101, "Aduet Dabral", 60000.0);
        System.out.println(Emp1.displayInfo());
        Emp1.loanEligible();
    }
}