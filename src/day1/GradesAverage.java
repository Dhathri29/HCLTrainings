package day1;

import java.util.Scanner;

public class GradesAverage {
	public static void main(String[] args) {
		int[] grades = new int[10];
		System.out.println("Enter the number of students:");
		Scanner sc= new Scanner(System.in);
		int stud= sc.nextInt();
		for(int i=1;i<=stud;i++) {
			System.out.println("enter the grade for student"+i+":");
			int mark=sc.nextInt();
			if(mark>100) {
				System.out.println("please enter valid marks");
				i--;
				continue;
			}
			grades[i-1]=mark;
			
		}
		double sum=0;
		for(int j=0;j<stud;j++) {
			sum=sum+grades[j];
		}
		System.out.println("the average is: "+sum/stud);
		sc.close();
	}
}
