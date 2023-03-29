import java.util.ArrayList;

public class Monotonic {
    public static boolean Monotonic(ArrayList<Integer> list){
        int i = 0;
        int j = i+1;
        while (i<j) {
            if(list.get(i) <=list.get(j)) {
                return true;
            }
            if(list.get(i) >= list.get(j)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isMonotonic(ArrayList<Integer> A) {
        boolean inc = true;
        boolean dec = true;

        for(int i=0; i<A.size()-1; i++) {
            if(A.get(i) > A.get(i+1))
                inc = false;

            if(A.get(i) < A.get(i+1)) {
                dec = false;
            }
        }
        return inc || dec;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(isMonotonic(list));
    }
}
