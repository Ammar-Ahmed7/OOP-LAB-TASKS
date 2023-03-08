public class HourlyEmployee extends Employee{
    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String CNIC, double hours, double wage) {
        super(firstName, lastName, CNIC);
        this.hours = hours;
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
        if (hours < 0.0 || hours > 168)
            throw new IllegalArgumentException(
                    "Hours per week must be between 0-168");
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
        if (wage < 0.0)
            throw new IllegalArgumentException(
                    "wage must be >= 0.0");
    }

    @Override
    public String toString() {
        return super.toString() + "hours: " + hours + "wage: " + wage;
    }
}
