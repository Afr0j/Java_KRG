package LibraryManagementSystem;
import java.util.Scanner;

public class Books extends Book{

    Book theBooks[] = new Book[50];
    public static int count;

    Scanner input = new Scanner(System.in);


    public int compareBookObjects(Book b1, Book b2)
    {

        if (b1.bookName.equalsIgnoreCase(b2.bookName)) {

            System.out.println(
                    "Book of this Name Already Exists.");
            return 0;
        }

        if (b1.sNo == b2.sNo) {

            System.out.println(
                    "Book of this Serial No Already Exists.");

            return 0;
        }
        return 1;
    }


    public void addBook(Book b)
    {

        for (int i = 0; i < count; i++) {

            if (this.compareBookObjects(b, this.theBooks[i])
                    == 0)
                return;
        }

        if (count < 50) {

            theBooks[count] = b;
            count++;
        }
        else {

            System.out.println(
                    "No Space to Add More Books.");
        }
    }


    public void searchBySno()
    {

        System.out.println(
                "\t\t\t\tSEARCH BY SERIAL NUMBER\n");

        int sNo;
        System.out.println("Enter Serial No of Book:");
        sNo = input.nextInt();

        int flag = 0;
        System.out.println(
                "S.No\t\tName\t\tAvailable Qty\t\tTotal Qty");

        for (int i = 0; i < count; i++) {
            if (sNo == theBooks[i].sNo) {
                System.out.println(
                        theBooks[i].sNo + "\t\t"
                                + theBooks[i].bookName + "\t\t"
                                + theBooks[i].bookQtyCopy + "\t\t"
                                + theBooks[i].bookQty);
                flag++;
                return;
            }
        }
        if (flag == 0)
            System.out.println("No Book for Serial No "
                    + sNo + " Found.");
    }




    public void showAllBooks()
    {

        System.out.println("\t\t\t\tSHOWING ALL BOOKS\n");
        System.out.println(
                "S.No\t\tName\t\tAvailable Qty\t\tTotal Qty");

        for (int i = 0; i < count; i++) {

            System.out.println(
                    theBooks[i].sNo + "\t\t"
                            + theBooks[i].bookName + "\t\t"
                            + theBooks[i].bookQtyCopy + "\t\t"
                            + theBooks[i].bookQty);
        }
    }


    public void upgradeBookQty()
    {

        System.out.println(
                "\t\t\t\tUPGRADE QUANTITY OF A BOOK\n");
        System.out.println("Enter Serial No of Book");

        int sNo = input.nextInt();

        for (int i = 0; i < count; i++) {

            if (sNo == theBooks[i].sNo) {

                System.out.println(
                        "Enter No of Books to be Added:");

                int addingQty = input.nextInt();
                theBooks[i].bookQty += addingQty;
                theBooks[i].bookQtyCopy += addingQty;

                return;
            }
        }
    }


    public void dispMenu()
    {


        System.out.println("Press 0: Exit Application.");
        System.out.println("Press 1: Add new Book.");
        System.out.println("Press 2: Search a Book.");
        System.out.println("Press 3: Show All Books.");
        System.out.println("Press 4: Register Student.");
        System.out.println("Press 5: Check Out Book. ");
        System.out.println("Press 6: Check In Book");

    }


    public int isAvailable(int sNo)
    {

        for (int i = 0; i < count; i++) {
            if (sNo == theBooks[i].sNo) {
                if (theBooks[i].bookQtyCopy > 0) {

                    System.out.println(
                            "Book is Available.");
                    return i;
                }
                System.out.println("Book is Unavailable");
                return -1;
            }
        }

        System.out.println("No Book of Serial Number "
                + " Available in Library.");
        return -1;
    }


    public Book checkOutBook()
    {

        System.out.println(
                "Enter Serial No of Book to be Checked Out.");
        int sNo = input.nextInt();

        int bookIndex = isAvailable(sNo);

        if (bookIndex != -1) {
            theBooks[bookIndex].bookQtyCopy--;
            return theBooks[bookIndex];
        }
        return null;
    }


    public void checkInBook(Book b)
    {
        for (int i = 0; i < count; i++) {
            if (b.equals(theBooks[i])) {
                theBooks[i].bookQtyCopy++;
                return;
            }
        }
    }
}
