package Zadania;
// Program oblicza pierwiastki r�wnania kwadratowego
// Instrukcja warunkowa if

import java.io.*;


public class Zad_2_2 {
public static void main(String[] args)
throws IOException
{
	double a, b, c, delta, x1, x2;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	try
	
	 {
	System.out.println("Program oblicza pierwiastki r�wnania kwdratowego");
	System.out.println("Wz�r ax^2+bx+c=0");
	System.out.println();
	System.out.println("Pdaj warto�� a: ");
	a = Double.parseDouble(br.readLine());
	
	if (a == 0)
	{
		System.out.println("Niedozwolona warto�� a");
	}
	else
	{
		System.out.println("Podaj warto�� b: ");
		b = Double.parseDouble(br.readLine());
		System.out.println("Podaj warto�� c: ");
		c = Double.parseDouble(br.readLine());
		
		delta = b*b+4*a*c;
		
		if (delta == 0)
		{
			x1 = -b/(2*a);
			System.out.printf("Dla a = " + "%4.2f,", a);
			System.out.printf(" b = " + "%4.2f,", b);
			System.out.printf("c = " + "%4.2f\n", c);
			System.out.println("Tr�jmian ma jeden pierwiastek podw�jny x1 = ");
			System.out.printf("%4.2f,", x1);
			System.out.println("");
		}
		else
		{
			x1 = (-b-Math.sqrt(delta))/(2*a);
			x2 = (-b+Math.sqrt(delta))/(2*a);
			System.out.printf("Dla a = " + "%4.2f,", a);
			System.out.printf(" b = " + "%4.2f,", b);
			System.out.printf("c = " + "%4.2f\n", c);
			System.out.println("Tr�jmian ma dwa pierwiasteki: ");
			System.out.println("x1 = ");
			System.out.printf("%4.2f,", x1);
			System.out.println("x2 = ");
			System.out.printf("%4.2f,", x2);
			System.out.println("");	
		}
	}
	 }
	catch (NumberFormatException exc)
	{
		System.out.println("Niew�asciwy format.");
	}
}
}
