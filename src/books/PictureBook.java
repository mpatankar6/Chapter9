package books;

public class PictureBook extends Book {

    String illustrator;

    public PictureBook(String t, String a, String illustrator) {
        super(t, a);
        this.illustrator = illustrator;
    }

    @Override
    public void printBookInfo() {

        super.printBookInfo();
        System.out.print(illustrator + "\n");
    }
}
