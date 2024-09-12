public class advance_patterns {
    public static void hollow_rectangle(int totRows, int totCols) {
        // outer loop
        for(int i = 1; i<=totRows; i++) {
            // inner loop 
            for(int j = 1; j<=totCols; j++) {
                // cell - (i,j)
                if(i==1||i==totRows||j==1||j==totCols) {
                    // boundary cells : 
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void inverted_rotated_half_pyramid(int n) {
        // outer 
        for(int i = 1; i<=n; i++) {
            // spaces
            for(int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void inverted_half_pyramid_withNumbers(int n) {
            //outer 
            for(int i = n; i>=1; i--) {
                //number
                for(int j = 1; j<=i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    public static void floyds_triangle(int n) {
        //outer 
        int counter = 1;
        for(int i = 1 ; i<=n; i++) {
            // numbers 
            for(int j = 1; j<=i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void triangle_01(int n) {
        //outer 
        for(int i = 1; i<=n; i++) {
            // if(i%2!=0) {
            //     // inner
            //     for(int j=1; j<=i; j++) {
            //         if(j%2!=0) {
            //             System.out.print("1");
            //         } else {
            //             System.out.print("0");
            //         }
            //     }
            // } else {
            //     //inner
            //     for(int j=0; j<i; j++) {
            //         if(j%2!=0) {
            //             System.out.print("1");
            //         } else {
            //             System.out.print("0");
            //         }
            //     }
            // }

            // (acc to mam) 
            for(int j=1; j<=i; j++) {
                if((i+j)%2==0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void solid_rhombus(int n) {
        //outer 
        for(int i = 1; i<=n; i++) {
            //space 
            for(int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void diamand(int n) {
        //outer 
        for(int i = 1; i<=n; i++) {
            // space
            for(int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // stars 
            for(int j=1; j<=(i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // inverted 
        for(int i=n; i>=1; i--) {
            // space
            for(int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // stars 
            for(int j=1; j<=(i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int n) {
        // outer 
        for(int i = 1; i<=n; i++) {
            //space
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // //star
            // if(i==1||i==n) {
            //     for(int j=1; j<=n; j++) {
            //         System.out.print("*");
            //     }
            // } else {
            //     System.out.print("*");
            //     //space
            //     for(int j=1; j<=n-2; j++) {
            //         System.out.print(" ");
            //     }
            //     System.out.print("*");
            // }
            // star (acc to mam)
            for(int j=1; j<=n; j++) {
                if(i==1||i==n||j==1||j==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void butterfly(int n) {
        //outer 
        // first half : 
        for(int i=1; i<=n; i++) {
            //star 
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //space 
            for(int j=1; j<=(n-i)*2; j++) {
                System.out.print(" ");
            }
            //star 
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //  inverted half : 
        for(int i=n; i>=1; i--) {
            //star 
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //space 
            for(int j=1; j<=(n-i)*2; j++) {
                System.out.print(" ");
            }
            //star 
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // hollow_rectangle(10, 7);
        // inverted_rotated_half_pyramid(7);
        // inverted_half_pyramid_withNumbers(5);
        // floyds_triangle(5); 
        // triangle_01(5);
        // solid_rhombus(5);
        // hollow_rhombus(5);
        // diamand(5);
        // butterfly(4);
    }
}

// butterfly pattern remaining ...   