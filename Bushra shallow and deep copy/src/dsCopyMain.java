public class dsCopyMain {
    public static void main(String[] args) {
        //shallow copy
        dsCopy obj1 = new dsCopy();
       obj1.setName("Talal");
       obj1.setId(118);
       dsCopy obj2 = new dsCopy();
       obj2 = obj1;
        System.out.println("OBJ1:" + obj1.getName() + "\n" + obj1.getId());
        System.out.println("OBJ2:" + obj2.getName() + "\n" + obj2.getId());
        obj2.setName("Ahmed");
        System.out.println(obj1.getName());

        //deep copy






    }
}
