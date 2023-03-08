public class csStud extends cs_Dep{
   private String NAME;
   private int id;

    public csStud(String uni_name, String address, int rank, String Name, int creditHours, int fee, String NAME, int id) {
        super(uni_name, address, rank, Name, creditHours, fee);
        this.NAME = NAME;
        this.id = id;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
