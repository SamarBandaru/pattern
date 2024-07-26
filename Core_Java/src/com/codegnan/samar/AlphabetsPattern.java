package com.codegnan.samar;
import java.util.*;
class AlphabetsPattern {
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
                    	if(c == 'A' || c == 'a') {
                    		 if((i==0 && j!=0 && j!=n-1) || (j==0 && i!=0) || i==n/2 || (j==n-1 && i!=0)){
                                 System.out.print("A ");
                             }
                             else{
                                 System.out.print("  ");
                             }
                    	}
                    	else if(c == 'B' || c == 'b') {
                    		if((i==0 && j!=n-1) || j==0 || (i==n/2 && j!=n-1) || (j==n-1 && i!=0 && i!=n-1 && i!=n/2) || (i==n-1 && j!=n-1)){
                                System.out.print("B ");
                            }
                            else{
                                System.out.print("  ");
                            }
                    	}
                    	else if(c == 'C' || c == 'c') {
                        		if((i==0 && j!=0) || (i==n-1 && j!=0) || (j==0 && i!=0 && i!=n-1)){
                                    System.out.print("C ");
                                }
                                else{
                                    System.out.print("  ");
                                }
                    	}
                    	
                    	else if(c == 'D' || c == 'd') {
                    		if((i==0 && j!=n-1)|| (i==n-1 && j!=n-1) || j==0 || (j==n-1 && i!=0 && i!=n-1)){
                                System.out.print("D ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
                    	else if(c == 'E' || c == 'e') {
                    		if(i==0 || i==n-1 || j==0 || i==n/2){
                                System.out.print("E ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
                    	else if(c == 'F' || c == 'f') {
                    		if(i==0 || j==0 || i==n/2){
                                System.out.print("F ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
                    	else if(c == 'G' || c == 'g') {
                    		if(i==0 || j==0 || (i==n/2 && j>=n/2) || i==n-1 || (j==n-1 && i>=n/2)){
                                System.out.print("G ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
                    	else if(c == 'H' || c == 'h') {
                    		if(j==0 || j==n-1 || i==n/2){
                                System.out.print("H ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
                    	else if(c == 'I' || c == 'i') {
                    		if(i==0 || i==n-1 || j==n/2){
                                System.out.print("I ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
                    	else if(c == 'J' || c == 'j') {
                    		if( i==0 || (i==n-1 && j<=n/2) || j==n/2 || (j==0 && i>n/2)){
                                System.out.print("J ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
                    	else if(c == 'K' || c == 'k') {
                    		if(j==0 || (i==n/2 && j<n/2) || (i==(n-2)-j && i<n/2) ||(j == i-1 && i > n / 2)){
                                System.out.print("K ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
                    	else if(c == 'L' || c == 'l') {
                    		if(j==0 || i==n-1){
                                System.out.print("L ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
                    	else if(c == 'M' || c == 'n') {
                    		if(j==0 || j==n-1 || (i==j && i<=n/2) || (i==(n-1)-j && i<n/2)){
                                System.out.print("N ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
                    	else if(c == 'N' || c == 'n') {
                    		if(j==0 || j==n-1 || i==j){
                                System.out.print(" ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
                    	else if(c == 'O' || c == 'o') {
                    		if(j==0 || j==n-1 || i==0 || i==n-1){
                                System.out.print("O ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
                    	else if(c == 'P' || c == 'p') {
                    		if(j==0 || (j==n-1 && i<=n/2) || i==0 ||i==n/2){
                                System.out.print("P ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
                    	else if(c == 'Q' || c == 'q') {
                    		if((j==0 && i!=n-2 && i!=n-1 && i!=0 ) || (i==0 && j!=0 && j!=n-1) || (j==n-1 && i!=0 && i!=n-1 && i!=n-2) || (i==n-2 && j!=0 && j!=n-1) || (j==i && i>=n/2)){
                                System.out.print("Q ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
                    	else if(c == 'R' || c == 'r') {
                    		if((i==0 && j!=n-1)|| j==0 || (j==n-1 && i<=n/2 && i!=0 && i!=n/2) || (i==n/2 && j!=n-1) || (j==i && j>=n/2)){
                                System.out.print("R ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
                    	else if(c == 'S' || c == 's') {
                    		if((i==0 && j!=0) || (i==n-1 && j!=n-1) || (i==n/2 && j!=0 && j!=n-1) ||(j==0 && i<=n/2 && i!=0 && i!=n/2) || (j==n-1 && i>=n/2 && i!=n/2 && i!=n-1)){
                                System.out.print("S ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
                    	else if(c == 'T' || c == 't') {
                    		if(i==0 || j==n/2){
                                System.out.print("T ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
                    	else if(c == 'U' || c == 'u') {
                    		if((j==0 && i!=n-1) || (j==n-1 && i!=n-1) || (i==n-1 && j!=0 && j!=n-1)){
                                System.out.print("U ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
                    	else if(c == 'V' || c == 'v') {
                    		if((j==0 && i<=n/2) || (j==n-1 && i<=n/2) || j==i-3 || j==n-i+2){
                                System.out.print("V ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
                    	else if(c == 'W' || c == 'w') {
                    		if(j==0 || j==n-1 || (j==i && i>=n/2) || (i==n-1-j && i>=n/2)){
                                System.out.print("W ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
                    	else if(c == 'X' || c == 'x') {
                    		if(i==j|| i==n-1-j){
                                System.out.print("X ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
                    	else if(c == 'Y' || c == 'y') {
                    		if((i==j && i<=n/2) || (i==n-1-j && i<=n/2) || (j==n/2 && i>=n/2)){
                                System.out.print("Y ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
                    	else if(c == 'Z' || c == 'z') {
                    		if(i==0 || i==n-1 || i==n-1-j){
                                System.out.print("Z ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
                    	else if(c == '1') {
                    		if(j==n/2 || (i==n/2-j && j!=0)){
                                System.out.print("1 ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
                    	else if(c == '2') {
                    		if((i==0 && j!=0 && j!=n-1) || ((j==0 && i<(n/2)-1) && i!=0) || (i==n-1 && j!=n-1) || (i==n-1-j && i!=0)){
                                System.out.print("2 ");
                            }
                            else{
                                System.out.print("  ");
                            }
                	}
//                    	else if(c == '' || c == '') {
//                    		if(){
//                                System.out.print(" ");
//                            }
//                            else{
//                                System.out.print("  ");
//                            }
//                	}
                    }
                    System.out.print("  ");
                }
                    	System.out.println();
                    	
                        		
                    }
                }
            }
        }
