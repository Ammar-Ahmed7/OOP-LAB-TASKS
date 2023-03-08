public class Employee {
    private String firstName;
    private String lastName;
    private String CNIC;

    public Employee(String firstName, String lastName, String CNIC) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.CNIC = CNIC;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    public String toString() {
        String str1 = "firstName: " + getFirstName() + "lastName: " + getLastName() + "CNIC: " + getCNIC() ;
        return str1;
    }


}
