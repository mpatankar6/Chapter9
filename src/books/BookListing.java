package books;

public class BookListing {

    private double price;
    private Book book;

    public BookListing(Book book, double a) {
        this.book = book;
        this.price = price;
    }

    public void printDescription(){
        book.printBookInfo();
        System.out.print(", $" + price + "\n");
    }
}
