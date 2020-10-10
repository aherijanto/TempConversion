package Main;

import java.util.Scanner;

import Model.Celcius;
import Model.Fahrenheit;
import Model.Reamur;

public class TemperaturConversion {

	public static void main(String[] args) {
		System.out.println("------------------------------------------");
		System.out.println("         Temperatur Conversion");
		System.out.println("       Celcius, Reamur, Fahrenheit");
		System.out.println("  Using Primitive and Reference Data Type");
		System.out.println("            by Ary Herijanto");
		System.out.println("------------------------------------------");
		
		System.out.print("Input Celcius =  ");
		Scanner sc = new Scanner(System.in);
		double InputCelcius = sc.nextDouble();
		
		
		Celcius myCelcius = new Celcius(InputCelcius);
		double celciusTemp= myCelcius.getcTemp();
		
		System.out.println("Celcius Value    = " + celciusTemp + "C");
		
		Reamur myReamur = new Reamur (celciusTemp);
		System.out.println("Reamur Value     = " + myReamur.getReamur() + "R");
		
		Fahrenheit myFahrenheit = new Fahrenheit (celciusTemp);
		System.out.println("Fahrenheit Value = " + myFahrenheit.getFahrenheit() + "F");
		
	}

}
