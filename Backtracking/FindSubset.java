public class FindSubset {
    public static void findSubset(String str, String ans, int i) {
        //base case
        if(i==str.length()) {
            if(ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        //recursion 
        findSubset(str, ans+str.charAt(i), i+1);  // Choice- Yes
        findSubset(str, ans, i+1); //Choice - No
    }

    public static void main(String args[]) {
        String str = "abc";
        String ans = "";
        findSubset(str, "", 0);

    }
    
}
