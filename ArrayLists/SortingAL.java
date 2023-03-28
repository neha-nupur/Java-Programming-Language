import java.util.ArrayList;
import java.util.Collections;

public class SortingAL {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);  // print the original list
        Collections.sort(list); // this will sort the list into ascending order
        System.out.println(list);  //this will print sorted list in ascending order


        /*  To print the list in descending order, we use Comparator. 
        Comparator is a function that tells method to do task, like sort in reverse order. */

        //descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);  // print list in descending order
    }
}
