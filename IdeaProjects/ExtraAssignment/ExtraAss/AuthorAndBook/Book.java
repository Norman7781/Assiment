package AuthorAndBook;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock=0;
    public Book(String name, Author author, double price){
        this.name= name;
        this.author = author;
        this.price = price;
    }
    public Book(String name, Author author, double price, int qtyInStock){
        this.name= name;
        this.author = author;
        this.price = price;
        this.qtyInStock= qtyInStock;
    }
    public String getName(){
        return this.name;
    }
    public Author getAuthor(){
        return this.author;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQtyInStock(){
        return this.qtyInStock;
    }
    public void setQtyInStock(int set){
        this.qtyInStock=set;
    }

    @Override
    public String toString() {
        return "name='" + this.getName() + "\n" +
                "author=" + this.getAuthor() +"\n"+
                "price=" + this.getPrice() +"\n"+
                "qtyInStock=" + this.getQtyInStock() +"\n"
                ;
    }
}
