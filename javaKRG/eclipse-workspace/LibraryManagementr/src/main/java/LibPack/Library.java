package LibPack;

import java.util.ArrayList;

public class Library extends Book{
    static ArrayList<Book> books=new ArrayList<>();

    public static void addNewBook(String name, String price,  String quantity){
//        for(int i=0; i<books.size(); i++){
//            if(books.get(i).getName().equals(name)){
//                String x=books.get(i).getQuantity();
//                books.get(i).setQuantity(x+quantity);
//                return;
//            }
//        }
        Book b=new Book(books.size(), name, price, quantity);
        books.add(b);
        System.out.println("Book Added Succesfully.");
    }

    public static boolean rentBook(String name){
        for(int i=0; i<books.size(); i++){
            if(books.get(i).getName().equals(name)){
//                if(books.get(i).getQuantity()==0) System.out.println("Book not available currently.");
//                else{
//                    int x=books.get(i).getQuantity();
//                    books.get(i).setQuantity(x-1);
                    System.out.println("Book issued succesfully.");
//                }
                return true;
            }
        }
        System.out.println("Book not available");
        return false;
    }
//
//    public void returnBook(String name){
//        for(int i=0; i<books.size(); i++){
//            if(books.get(i).getName().equals(name)){
//                int x=books.get(i).getQuantity();
//                books.get(i).setQuantity(x+1);
//                System.out.println("Book return successful.");
//                return;
//            }
//        }
//    }
}
