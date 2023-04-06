import java.util.Scanner;

class Book{
    private String title;
    private String author;
    private String publisher;
    private int isbn;
    private int year;
    private float price;
    private int quantity;
    public Book(){
        this.title="";
        this.author="";
        this.publisher="";
        this.isbn=0;
        this.year=0;
        this.price=0;
        this.quantity=0;
    }
    public Book(String title,String author,String publisher,int isbn,int year,float price,int quantity){
        this.title=title;
        this.author=author;
        this.publisher=publisher;
        this.isbn=isbn;
        this.year=year;
        this.price=price;
        this.quantity=quantity;
    }
    //Setter Method
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setPublisher(String publisher){
        this.publisher=publisher;
    }
    public void setIsbn(int isbn){
        this.isbn=isbn;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setPrice(float price){
        this.price=price;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    //Getter Method
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getPublisher(){
        return this.publisher;
    }
    public int getISBN(){
        return this.isbn;
    }
    public int getYear(){
        return this.year;
    }
    public float getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    //Business Logic
    public void increaseInventory(int n){
        this.quantity=this.quantity+n;
    } 
    public void decreaseInventory(int n){
        this.quantity=this.quantity-n;
    }
    public float getInventoryValue(){
        return this.price*this.quantity;
    }
}
class BookDetails{
    Scanner sc=new Scanner(System.in);
    Book b= new Book();
    public void acceptRecord(){
        System.out.println("Enter Title:");
        //sc.nextLine();
        b.setTitle(sc.nextLine());
        System.out.println("Enter Author:");
        //sc.nextLine();
        b.setAuthor(sc.nextLine());
        System.out.println("Enter Publisher:");
        //sc.nextLine();
        b.setPublisher(sc.nextLine());
        System.out.println("Enter ISBN:");
        b.setIsbn(sc.nextInt());
        System.out.println("Enter Year:");
        b.setYear(sc.nextInt());
        System.out.println("Enter Price:");
        b.setPrice(sc.nextFloat());
        System.out.println("Enter Quantity:");
        b.setQuantity(sc.nextInt());
    }
    public void printRecord(){
        System.out.println("Details of Book:");
        System.out.println("Title:"+b.getTitle());
        System.out.println("Author:"+b.getAuthor());
        System.out.println("Publisher:"+b.getPublisher());
        System.out.println("ISBN:"+b.getISBN());
        System.out.println("Year:"+b.getYear());
        System.out.println("Price:"+b.getPrice());
        System.out.println("Quantity:"+b.getQuantity());
    }
    public void increaseQuantity(){
        System.out.println("Add no. of books:");
        b.increaseInventory(sc.nextInt());
    }
    public void decreaseQuantity(){
        System.out.println("Decrease no. of books:");
        b.decreaseInventory(sc.nextInt());
    }
    public void getInventoryValue(){
        System.out.println("Inventory Value is:"+b.getInventoryValue());
    }
    /* 
    public int MenuList(){
        System.out.println("0.Exit");
        System.out.println("1.Accept Record.");
        System.out.println("2.Print Record");
        System.out.println("3.Increase Book Quantity");
        System.out.println("4.Decrease Book Quantity");
        System.out.print("Enter choice  : ");
        return sc.nextInt();
    }
    */

}
public class BookInventoryManagement {
    public static void main(String[] args) {
        BookDetails b1=new BookDetails();
        b1.acceptRecord();
        b1.printRecord();
        b1.increaseQuantity();
        b1.decreaseQuantity();
        b1.printRecord();
        b1.getInventoryValue();
    }
}
