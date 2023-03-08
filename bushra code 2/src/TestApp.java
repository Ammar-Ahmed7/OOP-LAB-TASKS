public class TestApp {
    public static void main(String args[]){
       /* Student std= new Student();
        std.id= 1;
        std.name="Aisha";
        std.marks1= 50.0;
        std.marks2= 50.0;

        double average= std.calculateAverage();
        System.out.println(average);
*/
        Student rec= new Student();
         rec.length= 5;
         rec.width= 5;

         int area= rec.calculateArea();
        System.out.println("Area:" + area);

        int perimeter= rec.calculatePerimeter();
        System.out.println("Perimeter" + perimeter);
    }
}
