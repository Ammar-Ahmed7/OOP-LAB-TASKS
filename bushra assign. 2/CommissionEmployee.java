public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String CNIC, double grossSales, double commissionRate) {
        super(firstName, lastName, CNIC);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        if (grossSales < 0.0)
            throw new IllegalArgumentException(
                 "Gross sales must be >= 0.0");
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException(
                 "Commission rate must be > 0.0 and < 1.0");

    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
        if (grossSales < 0.0)
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0");
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
       /* if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException(
                 "Commission rate must be > 0.0 and < 1.0");
 */
        if (commissionRate >= 10000 || commissionRate < 20000){
            commissionRate = commissionRate + 5000;
        }
        if (commissionRate >= 20000 || commissionRate <= 50000){
            commissionRate = commissionRate + 10000;
        }
        if (commissionRate > 50000 ){
            commissionRate = commissionRate + 20000;
        }

    }

    @Override
    public String toString() {
        return super.toString() + "grossSales: " + grossSales + "commissionRate: " + commissionRate ;
    }
}
