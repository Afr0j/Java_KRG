package LibPack;

public class Book {
    private int BookId;
    private String name;
    private String price;
    private String Genre;
    private String quantity;

    public Book(int bid, String bname, String bprice, String quantity){
        BookId=bid;
        name=bname;
        price=bprice;
//        Genre=bgenre;
        this.quantity=quantity;
    }

    public Book(){};

    public int getBookId() {
        return BookId;
    }

    public String getName() {
        return name;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public String getQuantity() {
        return quantity;
    }

//    public String getGenre() {
//        return Genre;
//    }
}
