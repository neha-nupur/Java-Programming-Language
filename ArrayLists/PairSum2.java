import java.util.ArrayList;
public class PairSum2 {

    //brute force
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size()-1;

        while(lp < rp) { // lp != rp
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }

            if(list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }

        return false;
    }

    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int bp = -1;  // breaking point or pivot point
        int n = list.size(); // size of list

        //loop to find pivot in list
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }

        int lp = bp+1; // smallest number in the list
        int rp = bp;  // largest number in the list

        while(lp !=rp) {
            //sum = target
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // sum < target
            if(list.get(lp) + list.get(rp) < target) {
                lp = (lp+1) % n;
            } else { // sum > target
                rp = (n+rp-1) % n;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        // 11, 15, 6, 8, 9, 10
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 100;
        System.out.println(pairSum2(list, target));

    }
}
