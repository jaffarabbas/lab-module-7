import java.util.Scanner;
import java.util.ArrayList;
class test1{
    
   void test_(){
       Scanner obj =new Scanner(System.in);
    ArrayList<Double> list = new ArrayList<Double>();

    System.out.println(list.add(1.3));
    //(c)
    list.add(0,1.0);
    System.out.println(list);
    //(d)
    System.out.println(list.size());
    //(e)
    System.out.println(list.remove(1.3));
    //(f)
    System.out.println(list.remove(list.size() - 1));
    //(g)
    System.out.println(list.contains(4.3));
    //(h)
    System.out.println(list.get(2));

   }

}
public class task5 {
    public static void main(String[] args) {
        test1 obj =new test1();

        obj.test_();
    }
}