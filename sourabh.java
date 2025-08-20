import java.util.*;
public class sourabh {
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
		
		int m = 7;
        System.out.println("\n");
        System.out.print("\tEnter 'Y' to witness pattern logic crafted by Sourabh: ");
        char a = sc.next().charAt(0);
        System.out.println("\n\n");

        switch (a) {
            case 'Y', 'y' -> {
                for (int i = 0; i < m; i++) {
					
					
						for (int j = 0; j < m; j++) 
                  
                    System.out.print("  ");
                 
                  
            System.out.print("  ");

					
                    // S
                    for (int j = 0; j < m; j++) {
                        if ((i == 0 && j != 0) || (j == 0 && i < m / 2 && i != 0) ||
                            (i == m / 2 && j != 0 && j != m - 1) || (j == m - 1 && i > m / 2 && i != m - 1) ||
                            (i == m - 1 && j != m - 1)) {
                            System.out.print("* ");
                            Thread.sleep(30);
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.print("  ");

                    // O
                    for (int j = 0; j < m; j++) {
                        if ((i == 0 && j != 0 && j != m - 1) || (j == 0 && i != 0 && i != m- 1) ||
                            (i == m - 1 && j != 0 && j != m - 1) || (j == m - 1 && i != 0 && i != m - 1)) {
                            System.out.print("* ");
                            Thread.sleep(30);
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.print("  ");

                    // U
                    for (int j = 0; j < m; j++) {
                        if ((j == 0 && i != m - 1) || (j == m - 1 && i != m - 1) ||
                            (i == m - 1 && j != 0 && j != m - 1)) {
                            System.out.print("* ");
                            Thread.sleep(30);
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.print("  ");

                    // R
                    for (int j = 0; j < m; j++) {
                       if (i==0 &&j<m-1 ||j==0||i==m/2 &&j<m-1||j==m-1&&i<m/2&&i>0||i==j+1 && i>m/2||i==m-1&&j==m-1) {
                            System.out.print("* ");
                            Thread.sleep(30);
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.print("  ");

                    // A
                    for (int j = 0; j < m; j++) {
                        if ((i == 0 && j > 0 && j < m - 1) || (j == 0 && i > 0) ||
                            (j == m - 1 && i > 0) || (i == m / 2)) {
                            System.out.print("* ");
                            Thread.sleep(30);
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.print("  ");

                    // B
                    for (int j = 0; j < m; j++) {
                        if ((j == 0) || (i == 0 && j <= m - 2) || (i == m - 1 && j <= m - 2) ||
                            (i == m / 2 && j < m - 1) || (j == m - 1 && i > 0 && i < m - 1 && i != m / 2)) {
                            System.out.print("* ");
                            Thread.sleep(30);
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.print("  ");

                    // H
                    for (int j = 0; j < m; j++) {
                        if (j == 0 || j == m - 1 || i == m / 2) {
                            System.out.print("* ");
                            Thread.sleep(30);
                        } else {
                            System.out.print("  ");
                        }
                    }

                    System.out.println("  ");
                }
				 System.out.println(" \n\n ");
				 
		
        int n = 5;
		
        for (int i = 0; i < n; i++) {
			
			
			
			for (int j = 0; j < n; j++) 
                  
                    System.out.print("  ");
                 
                  
            System.out.print("  ");



            for (int j = 0; j < n; j++) 
                  
                    System.out.print("  ");
                 
                  
            System.out.print("  ");
			
			
            for (int j = 0; j < n; j++) 
                  
                    System.out.print("  ");
                 
                  
            System.out.print("  ");
			
            // J
            for (int j = 0; j < n; j++) {
                if ((j == n - 2 && i != n - 1) || (i == n - 1 && j <= n / 2 && j != 0) || (j == 0 && i == n - 2) || (i == 0 && j == n / 2)) {
                    System.out.print("* ");
                    Thread.sleep(30);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // A
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j > 0 && j < n - 1) || (j == 0 && i > 0) || (j == n - 1 && i > 0) || (i == n / 2)) {
                    System.out.print("* ");
                    Thread.sleep(30);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // V
            for (int j = 0; j < n; j++) {
                if ( j+2==i ||j==0&&i<=n/2||j==n-1&&i<=n/2||j==n-2&&i==n-2) {
                    System.out.print("* ");
                    Thread.sleep(30);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // A
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j > 0 && j < n - 1) || (j == 0 && i > 0) || (j == n - 1 && i > 0) || (i == n / 2)) {
                    System.out.print("* ");
                    Thread.sleep(30);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
        

         System.out.print(" \t ");

            // D
            for (int j = 0; j < n; j++) {
                if (j == 0 || (i == 0 && j < n - 1) || (i == n - 1 && j < n - 1) || (j == n - 1 && i != 0 && i != n - 1)) {
                    System.out.print("* ");
                    Thread.sleep(30);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // E
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || i == n / 2) {
                    System.out.print("* ");
                    Thread.sleep(30);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // V
            for (int j = 0; j < n; j++) {
               if ( j+2==i ||j==0&&i<=n/2||j==n-1&&i<=n/2||j==n-2&&i==n-2) {
                    System.out.print("* ");
                    Thread.sleep(30);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // E
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || i == n / 2) {
                    System.out.print("* ");
                    Thread.sleep(30);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // L
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n - 1) {
                    System.out.print("* ");
                    Thread.sleep(30);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // O
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j != 0 && j != n - 1) || (j == 0 && i != 0 && i != n - 1) ||
                    (i == n - 1 && j != 0 && j != n - 1) || (j == n - 1 && i != 0 && i != n - 1)) {
                    System.out.print("* ");
                    Thread.sleep(30);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // P
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j < n - 1) || (j == 0) || (i == n / 2 && j < n - 1) || (j == n - 1 && i > 0 && i < n / 2)) {
                    System.out.print("* ");
                    Thread.sleep(30);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // E
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || i == n / 2) {
                    System.out.print("* ");
                    Thread.sleep(30);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // R
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j < n - 1) || (j == 0) || (i == n / 2 && j < n - 1) ||
                    (j == n - 1 && i < n / 2 && i > 0) || (i == j && i >= n / 2)) {
                    System.out.print("* ");
                    Thread.sleep(30);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }
		
		System.out.println("\n\n");
    }
	
	default -> {
                System.out.println("You Are Unlucky  Try Again With 'Y' Next Time!");
            }
}
	}
}
