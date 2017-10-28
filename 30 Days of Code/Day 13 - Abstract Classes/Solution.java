// Declare your class here. Do not use the 'public' access modifier.

class MyBook extends Book{
    int price;
    // Declare the price instance variable
    
    /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    MyBook(String title, String author, int price)
    {
        super(title, author);
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
   void display()
        {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " +this.price);
    }
    
}    
// End class
    
public class Solution {
   public static void main(String[] args) {
      Scanner sc     = new Scanner(System.in);
      String title   = sc.nextLine();
      String author  = sc.nextLine();
      int price      = sc.nextInt();
      Book new_novel = new MyBook(title, author, price);
      new_novel.display();
   }
}
