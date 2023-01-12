import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("Enter Your String: ");
            String s;
            try {
                s=sc.nextLine();
                s.trim();
                if(s.equalsIgnoreCase("Done")){
                    System.out.println("Adios");
                    System.exit(0);

                }
                else if(s.charAt(0)==s.charAt(s.length()-1)){
                    System.out.println("First and last Character Matched!!");
                }
                else{
                    System.out.println("First and last Character NOT Matched!!");

                }
            }catch(Exception e){
                System.out.println("INVALID INPUT");
            };


        }
    }
}
