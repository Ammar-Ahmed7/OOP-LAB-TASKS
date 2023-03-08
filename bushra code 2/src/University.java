public class University {
   private String uni_name;
   private String address;
   private int rank;

    public University(String uni_name, String address, int rank) {
        this.uni_name = uni_name;
        this.address = address;
        this.rank = rank;
    }

    public String getUni_Name() {
        return uni_name;
    }

    public void setName(String name) {
        this.uni_name = uni_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
