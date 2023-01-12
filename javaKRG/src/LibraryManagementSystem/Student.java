package LibraryManagementSystem;
import java.util.Scanner;
public class Student {

    String studentName;
    String regNum;

    Book borrowedBooks[] = new Book[3];
    public int booksCount = 0;


    Scanner input = new Scanner(System.in);

    public Student()
    {
        System.out.println("Enter Student Name:");
        try{
            this.studentName = input.nextLine();

        }catch (Exception e){
            System.out.println("Name is Invalid");
        }


        System.out.println("Enter Registration Number:");
        this.regNum = input.nextLine();
    }
}
