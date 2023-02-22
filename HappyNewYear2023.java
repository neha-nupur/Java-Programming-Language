import java.util.*;
public class HappyNewYear2023 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int year = sc.nextInt();
        if(year == 2022) {
            System.out.println("You have entered the wrong one.");
            System.out.println("Please enter 2023");
         } else {
            System.out.println("Cheers to the New Beginning.");
            System.out.println("Happy New Year 2023.");
            System.out.println("Let your dreams take flight in the new year!");
         }
    }
}
