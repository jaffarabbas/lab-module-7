import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
class ma{
        int col,row,temp=0,occ=0,round=0;
        Scanner obj =new Scanner(System.in);
        Random rand = new Random();
        // ArrayList[][] table = new ArrayList[100][100];
        // int arr[][] = new int[100][100];
        
        int table[][] = new int[100][100];

       void check(){

        System.out.println("Enter Columns : ");
        col = obj.nextInt();
        System.out.println("Enter Rows : ");
        row = obj.nextInt();

        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                // table[i][j] = new ArrayList();  
                table[i][j] = rand.nextInt(2); 
            }
        }
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
               System.out.print(table[i][j]+" ");
            }
            System.out.print("\n");
        }

        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                temp +=table[i][j];
                if(temp > round){
                    round = temp;
                    occ = i;
                }
            }
            System.out.print("\n");
        }
        System.out.print(occ);
        temp = 0;
        occ = 0;
        round = 0;
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                temp +=table[j][i];
                if(temp > round){
                    round = temp;
                    occ = i;
                }
            }
            System.out.print("\n");
        }
        System.out.print(occ+1);
        temp = 0;
    }
}
class task2{
        public static void main(String[] args) {
            ma obj = new ma();
            obj.check();
        }
}