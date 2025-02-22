package j4g03.day02;

import java.util.Scanner;

public class MultiplicationTables {
	
	public MultiplicationTables(int start, int end) {
		for(int i=1; i<=10; i++) {
			for(int j=start; j<=end; j++) {
				System.out.print(padLeft(j,2) + " x " + padLeft(i,2) + " = " + padLeft((i*j),3) + "   ");
			}
			System.out.println();
		}
	}

	public String padLeft(int number, int length) {
		StringBuffer buf = new StringBuffer(String.valueOf(number));
		for(int i=buf.length(); i<length; i++) {
			buf.insert(0," ");     
		}
		return buf.toString();
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("enter Start point: ");
		int start= sc.nextInt();
		System.out.print("enter end point: ");
		int end = sc.nextInt();
		if(start<end) {
			int temp_end=start+4;
			while(temp_end<=end) {
				new MultiplicationTables(start, temp_end);
				start+=5;
				temp_end+=5;
				System.out.println("\n");
			}
			int remain = temp_end-end;
			temp_end-=remain;
			new MultiplicationTables(start, temp_end);
			System.out.println();
		}
		else {
			System.err.println("starting point should be smaller than or equal to ending point....");
		}
		
	}
}

