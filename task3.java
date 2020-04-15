import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays; 
import java.util.HashSet; 
import java.util.Set;

class Main{
    Scanner obj = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int lenght,sequence;
    public static boolean areDistinct(Integer arr[]) 
    { 
        Set<Integer> s =  new HashSet<Integer>(Arrays.asList(arr)); 

        return (s.size() == arr.length); 
    } 
    void check(){
              System.out.print("Enter sequence lenght : ");
              lenght = obj.nextInt();
              for(int i = 0; i<lenght ; i++){
                arr.add(obj.nextInt());
              }
            int last = arr.get(arr.size() - 1); 
               if(areDistinct(arr)){
               }
               else if(last == 0){
                arr.remove(arr.size()-1);
                System.out.println(arr);

              }
            }   
    }
}
public class task3 {
    public static void main(String[] args) {
      Main obj =new Main();

      obj.check();
   }    
}