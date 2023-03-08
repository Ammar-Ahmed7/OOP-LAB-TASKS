public class testClass {
    public static void main(String[] args) {
        csStud s1= new csStud("CUI", "Defence Road", 5, "CS department", 4, 116000, "Ayesha", 119  );
       //public csStud(String name, String address, int rank, String Name, String creditHours, int fee, String NAME, int id)
        System.out.println(s1.getId());
        System.out.println(s1.getNAME());
        System.out.println(s1.getName());
        System.out.println(s1.getUni_Name());

        management_Dep m1=new management_Dep("FAST","32",76,"iftakhar","89",65);

        System.out.println(m1.getUni_Name()+'\n'+m1.getName());







    }
}
