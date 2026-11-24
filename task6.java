public class task6 {
    public static void main(String[] args) {
        Book b1=new Book();
        Book b2=new Book("Story");
        Book b3=new Book("Lion", 100);
        b1.display();
        b2.display();
        b3.display();

    }
}
class Book{
    String title;
    double price;
    Book(){
        title="Unknown";
        price=0.0;
    }
    Book(String title){
        this.title=title;
        price=0.0;
    }
    Book(String title,double price){
        this.title=title;
        this.price=price;
    }
    void display(){
        System.out.println("title:"+this.title);
        System.out.println("Price:"+this.price);
    }
}