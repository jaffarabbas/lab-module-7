import java.util.ArrayList;
import java.util.Scanner;

class test{
     void largestRow(int[][] arr,int n) {  
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
             
           
        for (int i = 0; i < n; i++) {
          int count = 0; 
          for (int j = 0; j < n; j++) {
            if (arr[i][j] == 1) 
              count++;
          } 
          arr[i][n] = count;    
        }
        int row_max = arr[0][n];
        for (int i = 0; i < n; i++) {
          if (arr[i][n] > row_max) {  
            arr1.clear();
            row_max = arr[i][n];  
          }
          if (arr[i][n] == row_max) 
            arr1.add(i);
        }
        System.out.print("rows with max 1s: ");  
        for (int i = 0; i < arr1.size(); i++)  
          System.out.print(arr1.get(i) + " ");
        System.out.println();
      }
   void largestCol(int [][]arr,int n) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {    
          int count = 0;
          for (int j = 0; j < n; j++) {
         
       if (arr[j][i] == 1)
              count++;
          }
          arr[n][i] = count;             
        }
        int col_max = arr[n][0];
        for (int i = 0; i < n; i++) {
          if (arr[n][i] > col_max) {    
            arr1.clear();           
            col_max = arr[n][i];    
          }
          if (arr[n][i] ==col_max)
       
            arr1.add(i);         
        }
        System.out.print("columns with max 1s: ");
        for (int i = 0; i < arr1.size(); i++)  
          System.out.print(arr1.get(i) + " ");
      }
}

class Run_test extends test{
    void run(){
        Scanner obj = new Scanner(System.in);
    System.out.println("Enter the size of matrix");
    int n = obj.nextInt();
    int arr[][] = new int[n + 1][n + 1]; 
    for (int i = 0; i < n; i++) { 
      for (int j = 0; j < n; j++)
        arr[i][j] = (int) Math.round(Math.random());
    }
    for (int i = 0; i < n; i++) {  
      for (int j = 0; j < n; j++)
        System.out.print(arr[i][j] + " ");
      System.out.println();
    }
  largestRow(arr,n);  
  largestCol(arr,n);
    }
}

public class task2 {
  public static void main(String[] args) { 
    Run_test obj =new Run_test();
    obj.run();
  }
}