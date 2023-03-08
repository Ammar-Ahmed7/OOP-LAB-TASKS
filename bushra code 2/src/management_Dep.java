public class management_Dep extends University{
    private String Name;
    private String creditHours;
    private int fee;

    public management_Dep(String uni_name, String address, int rank, String Name, String creditHours, int fee) {
        super(uni_name, address, rank);
        this.Name = Name;
        this.creditHours = creditHours;
        this.fee = fee;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(String creditHours) {
        this.creditHours = creditHours;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
