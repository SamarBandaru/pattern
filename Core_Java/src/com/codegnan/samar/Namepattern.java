package com.codegnan.samar;
import java.util.*;
class Namepattern {
    public static void main(String[] args) {
        int i, j, n = 7;
        String s;
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter Text");
            s = sc.nextLine();
            
            for (i = 0; i < n; i++) {
                for (char c : s.toCharArray()) {
                    for (j = 0; j < n; j++) {
                        if (c == 'S' || c == 's') {
                            if ((i == 0 && j != 0) || (i == n - 1 && j != n - 1) || (i == n / 2 && j != 0 && j != n - 1) || (j == 0 && i <= n / 2 && i != 0 && i != n / 2) || (j == n - 1 && i >= n / 2 && i != n / 2 && i != n - 1)) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        } else if (c == 'A' || c == 'a') {
                            if ((i == 0 && j != 0 && j != n - 1) || (j == 0 && i != 0) || i == n / 2 || (j == n - 1 && i != 0)) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        } else if (c == 'M' || c == 'm') {
                            if (j == 0 || j == n - 1 || (i == j && i <= n / 2) || (i == (n - 1) - j && i < n / 2)) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        } else if (c == 'R' || c == 'r') {
                            if ((i == 0 && j != n - 1) || j == 0 || (j == n - 1 && i <= n / 2 && i != 0 && i != n / 2) || (i == n / 2 && j != n - 1) || (j == i && j >= n / 2)) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                    }
                    System.out.print("  ");
                }
                System.out.println();
            }
        }
    }
}