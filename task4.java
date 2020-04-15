
import java.util.ArrayList;
import java.util.Random;
class CourseInfo{
    private String name;
    private ArrayList<String> list;//Creating arraylist

    public CourseInfo(String name){
        this.name = name;
        list = new ArrayList<String>();
    }

    public void StudentAdd(String student){
        list.add(student);
    }

    public void StudentDrop(String student){
        System.out.println(list.remove(student)?"Succesfully drop the student":"Enter the correct name");
    }
    public ArrayList<String> getList() {
        return list;
    }
    public String getName() {
        return name;
    }

}
class test_class4{
    void check(){
        CourseInfo Obj = new CourseInfo("Obj");
        CourseInfo Object = new CourseInfo("Obj lab");
        Random o =new Random();
        Obj.StudentAdd("JAfffar");//adding student

        for (int i = 0; i < 20; i++) {
            Obj.StudentAdd("Jaffar"+o.nextInt(10));
            Object.StudentAdd("Jaffar"+o.nextInt(10));
        }

        Obj.StudentDrop("JAfffar");//droping student


        System.out.println("No of student in "+Obj.getName()+" is: "+Obj.getList());
        System.out.println("No of student in "+Object.getName()+" is: "+Object.getList());


    }
}

public class task4 {
    public static void main(String[] args) {
       test_class4 obj =new test_class4();
       obj.check();
    }
}