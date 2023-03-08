public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String CNIC, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, CNIC, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return super.toString() + "baseSalary: " + baseSalary;
    }


}
