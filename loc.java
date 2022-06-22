package javapackage;

import java.util.Scanner;

public class loc {
	{// here no method & function then why its print or call
		System.out.println("Hello World");
	}
	public static void main(String[] args) {
		int x1;
		int x3;
		int x2;
		int x4;
		int y1;
		int y3;
		int y2;
		int y4;

		Scanner input = new Scanner(System.in);
		System.out.println("enter the x1 value : ");
		x1 = input.nextInt();
		System.out.println("enter the y1 value : ");
		y1 = input.nextInt();
		System.out.println("enter the x2 value : ");
		x2 = input.nextInt();
		System.out.println("enter the y2 value : ");
		y2 = input.nextInt();

		int length1 = (int) Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
		System.out.println("length of line : " + length1);

		Scanner input1 = new Scanner(System.in);
		System.out.println("enter the x3 value : ");
		x3 = input.nextInt();
		System.out.println("enter the y3 value : ");
		y3 = input.nextInt();
		System.out.println("enter the x4 value : ");
		x4 = input.nextInt();
		System.out.println("enter the y4 value : ");
		y4 = input.nextInt();

		int length2 = (int) Math.sqrt((x4 - x3) ^ 2 + (y4 - y3) ^ 2);
		System.out.println("length of line : " + length2);

		if (length1 == length2) {
			System.out.println("both lines are equal");
		} else
			System.out.println("both lines are not equal");
		loc sc = new loc();//class object create campareto method ko call 
		sc.compareto(length1, length2);
	}

	public void compareto(Integer length1, Integer length2) {
		if (length1.compareTo(length2) == 0) {
			System.out.println("both lines are equal");
		} else if (length1.compareTo(length2) > 0)
			System.out.println("length of line1 is greater ");
		else
			System.out.println("length of line2 is greater ");
	}
}
