import java.util.Scanner;
import java.util.Random;



class Publication{
    Scanner obj = new Scanner(System.in);
    Random rand = new Random();
    String publicationDate;
    int noOfPages;
    String title;
    int price;
    int noOfBooks;
    void Copyrighted(String currentYear, String copyrightYear){
         int day_current_year,month_current_year,day_copyright_year=1,month_copyright_year=12;
         int response = Integer.parseInt(currentYear);
         System.out.println("Enter Todays day");
         day_current_year = obj.nextInt();
         month_current_year = obj.nextInt();
         int till_copy =response +1;
         System.out.println("Date : "+day_current_year+" "+month_current_year+" "+currentYear); 
         System.out.println("Copy right : "+day_copyright_year+" "+month_copyright_year+" "+till_copy); 
    }
    void publishCheck(){
        String check;
        System.out.println("Check for publish : ");
        check = obj.next();
        switch(check){
            case "yes":
            System.out.println("Publish");
            break;
            case "No":
            System.out.println("Not Publish");
            break;
            default:
            System.out.println("Error");
            break;
        }
    }
}

class Books extends Publication{
   public long ISBN = (Long) (rand.nextLong() % 100000000000000L) + 5200000000000000L;
   public String author;
   public int price;
   public int quantity;
    
    void Book(){
        System.out.println("Enter year present : ");
        String year  =obj.next();
        System.out.println("Enter year Copy right : ");
        String yearcopyr  =obj.next();
        Copyrighted(year,yearcopyr);
        System.out.println("Title:  ");
        title=obj.next();
        System.out.println("Price : ");
        price=obj.nextInt();
        System.out.println("Author : ");
        author=obj.next();
        System.out.println("ISBN :"+ISBN);
        System.out.println("No pages : ");
        noOfPages = obj.nextInt();
        System.out.println("Total quantity: ");
        quantity = obj.nextInt();
        do{
            if(quantity > 1){
                break;
            }
        }
        while(quantity < 1);
        System.out.println("No of pages"); 
        do{
            if(noOfPages > 1){
                break;
            }
        }
        while(noOfPages < 1);
    
        System.out.println("Publish date : ");
        publicationDate = obj.next();

        System.out.println("Your Book : ");
        System.out.println(title);
        System.out.println(price);
        System.out.println(author);
        System.out.println(ISBN);
        System.out.println(quantity);
        System.out.println(noOfPages);
        System.out.println(publicationDate);
    }
   void taskeorder(){
    System.out.println("Enter No of books :   ");
    noOfBooks = obj.nextInt();
    orderBooks(noOfBooks);
    remainingBooks();
   }

    void orderBooks(int noOfBooks){

        int total = noOfBooks * price;

        if(total > 10000){
            float discount = total * 0.1f;

            float result = total - discount;

            System.out.println("Price after discount : "+result);
        }
        else{
            System.out.println("Total price : "+total);
        }
    }

    void remainingBooks(){
        int remaining_books=quantity - noOfBooks;
        System.out.println("Reamiang books : "+remaining_books);
    }
}

class Magzines extends Publication{
    String Catagory;
    String issue;
    int noOfCopies;

    void Copyrighted(String currentYear, String copyrightYear){
        int day_current_year,month_current_year,day_copyright_year=1,month_copyright_year=12;
        int response = Integer.parseInt(currentYear);
        System.out.println("Enter Todays day");
        day_current_year = obj.nextInt();
        month_current_year = obj.nextInt();
        int till_copy =response +1;
        System.out.println("Date : "+day_current_year+" "+month_current_year+" "+currentYear); 
        System.out.println("Copy right : "+day_copyright_year+" "+month_copyright_year+" "+till_copy); 
   }
   void publishCheck(){
       String check;
       System.out.println("Check for publish : ");
       check = obj.next();
       switch(check){
           case "yes":
           System.out.println("Publish");
           break;
           case "No":
           System.out.println("Not Publish");
           break;
           default:
           System.out.println("Error");
           break;
       }
   }

    void MAgzine(){
        System.out.println("Enter year present : ");
        String year  =obj.next();
        System.out.println("Enter year Copy right : ");
        String yearcopyr  =obj.next();
        Copyrighted(year,yearcopyr);
        System.out.println("Title:  ");
        title=obj.next();
        System.out.println("Price : ");
        price=obj.nextInt();
        System.out.println("No pages : ");
        noOfPages = obj.nextInt();
        System.out.println("Total quantity: ");
        noOfCopies = obj.nextInt();
        do{
            if(noOfCopies > 1){
                break;
            }
        }
        while(noOfCopies < 1);
        System.out.println("Publish date : ");
        issue = obj.next();

        System.out.println("Your Magzines : ");
        System.out.println(title);
        System.out.println(price);
        System.out.println(noOfPages);
        System.out.println(publicationDate);
    }
   void taskeorder(){
    System.out.println("Enter No of books :   ");
    noOfCopies = obj.nextInt();
    orderBooks(noOfCopies);
    remainingBooks();
   }

    void orderBooks(int noOfBooks){

        int total = noOfBooks * price;

        if(total > 10000){
            float discount = total * 0.05f;

            float result = total - discount;

            System.out.println("Price after discount : "+result);
        }
        else{
            System.out.println("Total price : "+total);
        }
    }

    void remainingBooks(){
        int remaining_books=noOfCopies - noOfBooks;
        System.out.println("Reamiang books : "+remaining_books);
    }

    void check_last(){
        System.out.println("First check the publition");
        publishCheck();
    }
}


class test_class extends Publication{
    
    Publication pub = new Publication();
    Books b = new Books();
    Magzines m = new Magzines();

     void view(){
        int a=0;
         do{
            System.out.println("Enter type : ");
            a = obj.next().charAt(0);
            if(a == 0){
                return;
               }   
                else if(a == 1) {
                b.Book();
                b.taskeorder();
                }
                 else if(a == 2){ 
                m.MAgzine();
                m.taskeorder();
                 }
                else if(a == 9)
                {
                System.out.println("Stop");
                break;  
                } 
               else{
                System.out.println("Error");  
                }
            }
         while(a == 9);
     }


}
public class task6 {
    public static void main(String[] args) {
         
        // obj.Copyrighted("2020","2010");
        test_class b = new test_class();
        b.view();
    }
}