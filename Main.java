package dowhileconvertendotemperaturas;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner hs = new Scanner(System.in);
		
		
		char resp = 's';
		
		do{
			System.out.print("Digite a temperatura em Graus Celsius: ");
			double C = hs.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("O equivalente em Fahrenheit: %.2f%n", F);
			System.out.println("Deseja repetir? (s/n)");
			resp = hs.next().charAt(0);
		}while (resp != 'n');
		
		hs.close();

	}

}
