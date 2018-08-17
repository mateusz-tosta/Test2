package Zadania;
import java.io.*;
import java.util.*;

public class Zad_2_5 

{
	public static void main(String[] args)
	throws IOException
	{
		double los_liczb, zgd_liczb;
		
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		try
		{
		System.out.println("Program losujê liczbê w przedziale od 0 do 10. Zgadnij tê liczbê.");
		
		Random r = new Random();
		los_liczb = Math.round(10*(r.nextDouble()));
		zgd_liczb = Double.parseDouble(br.readLine());
		
		if (zgd_liczb == los_liczb)
		{
			System.out.println("Brawo! to jest ta liczba");
		}
		else
		{
			System.out.println("Przykro mi, to nie ta liczba.");
			System.out.print("Prawid³owa liczba to: ");
			System.out.println((int) los_liczb + ".");
		}
		}
		catch (NumberFormatException exc)
		{
			System.out.println("B³êdny format !");
		}
		
	}
	}