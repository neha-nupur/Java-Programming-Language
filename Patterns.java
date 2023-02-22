public class Patterns {
//-------------------------------------------------------------
/* * * * *
 * * * * *
 * * * * *
 * * * * *
 */
    // public static void main(String args[]) {
    //     for(int i = 1; i<=4; i++) {
    //         for(int j = 1; j<=4; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
//     public static void main(String agrs[]) {
       
// * 
// * *
// * * *
// * * * *

//         for(int line = 1; line <= 4; line++) {
//             for(int star = 1; star <= line; star++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
// --------------------------------------------------------------------------

// * * * *
// * * * 
// * * 
// *
//         int n = 4;
//         for ( int line = 1; line <= 4; line++) {
//             for (int star = 1; star <= (n - line + 1); star++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
// -----------------------------------------------------------------------------------

// 1
// 1 2
// 1 2 3 
// 1 2 3 4   (Half Pyramid Pattern)

//             int n = 4; 
//             for(int line = 1; line <= n; line++) {
//                 //numbers print
//                 for(int number = 1; number <= line; number++) {
//                     System.out.print(number+" ");
//                 }
//                 System.out.println();
//             }
// ---------------------------------------------------------------------------------------
// A 
// B C 
// D E F 
// G H I J  (Character Pattern) 

//             int n = 4; 
//             char ch = 'A';

//             for(int line = 1; line <= n; line++) {
//                 for (int chars = 1; chars <= line; chars++) {
//                     System.out.print(ch+ " ");
//                     ch++;
//                 }
//                 System.out.println();
//             }

// -------------------------------------------------------------------------------------
// * * * * * 
// *       *
// *       *
// * * * * *  ( Hollow Rectangle Pattern)

            public static void hollow_rectangle(int totRows, int totCols) {
                //outer loop
                for(int i = 1; i <= totRows; i++){
                    //inner loop
                    for(int j = 1; j <= totCols; j++) {
                        // cell(i,j)
                        if(i == 1 || i == 4 || j == 1 || j == 5) {
                            //boundary
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();

                }
            }

//             public static void main(String arg[]) {
//                   hollow_rectangle( 4, 5);
//             }

// ---------------------------------------------------------------------------------------------
//       *
//     * *
//   * * *
// * * * *  Inverted & Rotated Half-Pyramid Pattern 


                public static void inverted_rotated_half_pyramid(int n) {
                    //outer loop
                    for(int i = 1; i <= n; i++) {

                        //inner loop- spaces
                        for(int j = 1; j <= n-i ; j++) {
                            System.out.print("  ");
                        }

                        //stars
                        for(int j = 1; j <= i; j++) {
                                System.out.print("* ");
                        }
                        
                        System.out.println();
                    }
                }

//                 public static void main(String args[]) {
//                     inverted_rotated_half_pyramid(4);
//                 }

// --------------------------------------------------------------------------------------------

// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1         Inverted Half Pyramid with Number Pattern

                    public static void inverted_half_pyramid(int n) {
                        //outer loop
                        for(int i = 1; i <= n; i++) {
                            // inner loop
                            for(int j = 1; j <= n-i+1; j++) {
                                System.out.print(j+ " ");
                            }
                            System.out.println();
                        }
                    }
                    
//                     public static void main(String arg[]) {
//                         inverted_half_pyramid(4);
//                     }
// -----------------------------------------------------------------------------------------
// 1 
// 2  3 
// 4  5  6 
// 7  8  9  10
// 11 12 13 14 15  Floyd's Triangle Pattern 

                        public static void floyds_triangle(int n) {
                            int counter = 1;
                            //outer loop
                            for(int i = 1; i <= n; i++) {
                                //inner loop
                                for(int j = 1; j <= i; j++) {
                                    System.out.print(counter+ " ");
                                    counter++;
                                }
                                System.out.println();
                            }
                        }

//                         public static void main(String arg[]) {
//                             floyds_triangle(5);
//                         }

// -----------------------------------------------------------------------------------------------

// 1 
// 0 1 
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1  (0-1 Triangle pattern)

                            public static void zero_one_triangle(int n) {
                                //outer loop
                                for (int i = 1; i <= n; i++) {
                                    //inner loop
                                    for(int j = 1; j <= i; j++) {
                                        //print 1 if even
                                        if((i+j)%2 == 0){
                                            System.out.print("1 ");
                                        } else { //print 0 if odd
                                            System.out.print("0 ");
                                        }
                                    }
                                    System.out.println();
                                }
                            }

                            // public static void main(String args[]) {
                            //     zero_one_triangle(5);
                            // }

//------------------------------------------------------------------------------------------------------

// *             *
// * *         * *
// * * *     * * *
// * * * * * * * *
// * * * * * * * *
// * * *     * * *
// * *         * *
// *             *  Butterfly Patterns

                        public static void butterfly(int n) {
                            // 1st Half
                            for(int i=1; i<=n; i++) {
                                //stars - i
                                for(int j=1; j<=i; j++) {
                                    System.out.print("*");
                                }

                                //spaces - 2*(n-i)
                                for(int j=1; j<=2*(n-i); j++) {
                                    System.out.print(" ");
                                }

                                //stars - i
                                for(int j=1; j<=i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }


                            // 2nd Half
                            for(int i=n; i>=1; i--) {
                                //stars - i
                                for(int j=1; j<=i; j++) {
                                    System.out.print("*");
                                }

                                //spaces - 2*(n-i)
                                for(int j=1; j<=2*(n-i); j++) {
                                    System.out.print(" ");
                                }

                                //stars - i
                                for(int j=1; j<=i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                        
                        }

                        // public static void main(String args[]) {
                        //     butterfly(4);
                        // }
//----------------------------------------------------------------------------------------------

                    //         * * * * * * *
                    //       * * * * * * *
                    //     * * * * * * *
                    //   * * * * * * *
                    // * * * * * * *     Solid rhombus                  
                 

                            public static void solidRhombus(int n) {
                                // lines 
                                for(int i=1; i<=n; i++) {
                                    //spaces
                                    for(int j=1; j<=(n-i); j++) {
                                        System.out.print("  ");
                                    }

                                    //stars
                                    for(int j=1; j<=n; j++) {
                                        System.out.print(" *");
                                    }
                                    System.out.println();
                                }
                            }

                            // public static void main(String args[]) {
                            //     solidRhombus(7);
                            // }
//-----------------------------------------------------------------------------------


//     *****
//    *   *
//   *   *
//  *   *
// *****        Hollow Rhombus

                                public static void hollow_rhombus(int n) {
                                    for(int i=1; i<=n; i++) {
                                        //spaces
                                        for(int j=1; j<=(n-i); j++) {
                                            System.out.print(" ");
                                        }

                                        //hollow rectangle
                                        for(int j=1; j<=n; j++) {
                                            if(i == 1 || i == n || j == 1 || j == n) {
                                                System.out.print("*");
                                            } else {
                                                System.out.print(" ");
                                            }
                                        }
                                        System.out.println();
                                    }
                                }

                                // public static void main(String args[]) {
                                //     hollow_rhombus(5);
                                // }
                            
//---------------------------------------------------------------------------------------------------

//     *
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***         Diamond
//     *

                                    public static void diamond(int n) {
                                        //1st half
                                        for(int i=1; i<=n; i++) {
                                            //spaces
                                            for(int j=1; j<=(n-i); j++) {
                                                System.out.print(" ");
                                            }
                                            //stars
                                            for(int j=1; j<=(2*i)-1; j++){
                                                System.out.print("*");
                                            }

                                            System.out.println();
                                        }

                                        //2nd half
                                        for(int i=n; i>=1; i--) {
                                        //spaces
                                        for(int j=1; j<=(n-i); j++) {
                                            System.out.print(" ");
                                        }
                                        //stars
                                        for(int j=1; j<=(2*i)-1; j++){
                                            System.out.print("*");
                                        }

                                        System.out.println();
                                    }
                                    }

                                    // public static void main(String args[]) {
                                    //     diamond(5);
                                    // }

    }

