public class PrintPattern {
    
        public static void main(String[] args) {
            String pattern = "ABCBCDCDEF";
            int n = 3;
            
            for (int i = 0; i < n; i++) {
                for (int j = i; j < i + n; j++) {
                    System.out.print(pattern.charAt(j) + " ");
                }
                System.out.println();
            }
        }
    }
