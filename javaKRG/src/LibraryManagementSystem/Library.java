package LibraryManagementSystem;
import java.util.Scanner;


public class Library {

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);



        Books ob = new Books();
        Students obStudent = new Students();

        int choice;
        int searchChoice;


        do {

            ob.dispMenu();
            choice = input.nextInt();

            switch (choice) {


                case 1:
                    Book b = new Book();
                    ob.addBook(b);
                    break;



                case 2:

                    System.out.println(
                            " press 1 to Search with Book Serial No.");
                    searchChoice = input.nextInt();

                    switch (searchChoice) {

                        case 1:
                            ob.searchBySno();
                            break;
                    }
                    break;


                case 3:
                    ob.showAllBooks();
                    break;

                case 4:
                    Student s = new Student();
                    obStudent.addStudent(s);
                    break;



                case 5:
                    obStudent.checkOutBook(ob);
                    break;

                case 6:
                    obStudent.checkInBook(ob);
                    break;

                default:

                    System.out.println("ENTER BETWEEN 0 TO 6.");
            }

        }


        while (choice != 0);
    }
}

