package org.company.Trisys;

import java.util.Scanner;

public class FiboSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range :- ");
		int rang = sc.nextInt();
		sc.close();
		int a = 0,b = 1, temp;
		System.out.print(a + " " + b + " ");
		for(int i = 2; i < rang; i++)
		{
			temp = a + b;
			System.out.print(temp + " ");
			a = b;
			b = temp;
		}
	}

}
