package Zadania;
import java.io.*;

//Program oblicza pierwiastki równania kwadratowego
//Instrukcja warunkowa switch

public class Zad_2_3 {
	public static void main(String[] args)
	throws IOException
	{
		double a, b, c, delta, x1, x2;
		char liczba_pierwiastkow = 0; //Zmienna pomocnicza
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			System.out.println("Program oblicza pierwiastki równania ax^2+bx+c = 0");
			System.out.println("Podaj wartoœæ a: ");
			a = Double.parseDouble(br.readLine());
			
			if (a == 0)
			{
				System.out.println("Niedozwolona wartoœæ a.");
			}
			else
			{
				System.out.println("Podaj wartoœæ b: ");
				b = Double.parseDouble(br.readLine());
				System.out.println("Podaj wartoœæ c: ");
				c = Double.parseDouble(br.readLine());
				
				delta = b*b-4*a*c;
				
				if (delta < 0) liczba_pierwiastkow = 0;
				if (delta == 0) liczba_pierwiastkow = 1;
				if (delta > 0) liczba_pierwiastkow = 2;
				
				switch (liczba_pierwiastkow)
				{
				case 0 : System.out.println("brak pierwiastków rzeczywistych");
				break;
				case 1 : { x1 = -b/(2*a);
				System.out.printf("Dla a = " + "%4.2f,", a);
				System.out.printf("b = " + "%4.2f,", b);
				System.out.printf("c = " + "%4.2f\n", c);
				System.out.println("Trójmian ma jeden pierwiastek podwójny x1 = ");
				System.out.printf("%4.2f.\n", x1);
				}
				break;
				case 2: {
					x1 = (-b-Math.sqrt(delta))/(2*a);
					x2 = (-b+Math.sqrt(delta))/(2*a);
					System.out.printf("Dla a = " + "%4.2f,", a);
					System.out.printf("b = " + "%4.2f,", b);
					System.out.printf("c = " + "%4.2f\n", c);
					System.out.print(" x1 = ");
					System.out.printf("%4.2f,", x1);
					System.out.print("  x2 = ");
					System.out.printf("%4.2f.\n", x2);
				}
				break;
					
				}
			}
		}
	
		catch (NumberFormatException exc)
		{
			System.out.println("B³êdny format.");
		}
	}

}
