package org.company.Trisys;

import java.util.Scanner;

public class AlterFibo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range :- ");
		int rang = sc.nextInt();
		sc.close();
		
		int a=0,b=1, temp;
		System.out.print(a + " ");
		for(int i = 2; i < rang*5; i++)
		{
			temp = a+b;
			if(i % 5==0)
			{
				System.out.print(temp + " ");
			}
			a = b;
			b = temp;
		}
	}

}
