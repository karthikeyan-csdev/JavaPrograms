package patterns;

import java.util.Scanner;

/*
C
ABC
ABC
ABC
 */

public class Ex6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char n = sc.next().charAt(0);
		int n1=(int)n-(int)'A';
		
		int i,j;
		for(i=n1;i>=0;i--) {
			for(j=n1;j>=0;j--)
				System.out.print((char)((int)n-j));
			System.out.println();
		}
	}

}
