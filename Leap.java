import java.util.*;

public class Leap {
    public static void main(String args[]) {
        for(int y = 1900; y <= 2022; y++) { 
            if(( y % 4 == 0 && y % 100 != 0)  || y % 400 == 0) 
               System.out.println(y);
            }
    }
}

