import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayListAndLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(34);
        arr.add(59);
        arr.add(54);
        LinkedList<Integer> ll= new LinkedList<Integer>();
        ll.add(79);
        ll.add(58);
        ll.add(90);

        for(int x: arr){
            System.out.print(x+" ");
        }
        System.out.print("\n");
        for(int x: ll){
            System.out.print(x+" ");
        }

        
    }
}
