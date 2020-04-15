import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays; 
import java.util.HashSet; 
import java.util.Set;
import java.util.LinkedHashSet;

class Main{
    Scanner obj = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int lenght,sequence;
    void check(){
              System.out.print("Enter sequence lenght : ");             //   s.size() == arr.length
              lenght = obj.nextInt();
              // sequence = obj.nextInt();
              do{
                if(lenght == 0){
                    break;
                }
              lenght = obj.nextInt();
              arr.add(lenght);
              }while (lenght != 0);
    
              distinct();
    
        }

      void distinct()
      {
        int last = arr.get(arr.size() - 1);         
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(arr);
        ArrayList<Integer> arr = new ArrayList<>(hashSet);
              if(last == 0){
                arr.remove(arr.size()-1);
                  System.out.println("Displays the distinct numbers in the sequence "+arr);
                }
               else{
                System.out.println("Displays the distinct numbers in the sequence "+arr);
               } 
      }
}
public class task3 {
    public static void main(String[] args) {
      Main obj =new Main();

      obj.check();
   }    
}