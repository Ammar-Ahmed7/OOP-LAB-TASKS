public class cs_Dep extends University {
    private String Name;
    private int creditHours;
    private int fee;

    public cs_Dep(String uni_name, String address, int rank, String Name, int creditHours, int fee) {
        super(uni_name, address, rank);
        this.Name = Name;
        this.creditHours = creditHours;
        this.fee = fee;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
