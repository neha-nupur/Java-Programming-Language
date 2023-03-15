public class RemoveDuplicates {
    public static void main(String args[]) {
        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }

    static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        //base case
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        //Kaam - Check if the character present in the array has true value or false
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true) {
            // it means current character is present. So, no need to add again
            removeDuplicates(str, idx+1, newStr, map);
        }  else {
            //Add the character because it is not present in the array- Add true into map 
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }

    }
}
