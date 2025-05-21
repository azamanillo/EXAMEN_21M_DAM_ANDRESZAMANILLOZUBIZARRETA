package primos;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Buenos días Ceinmark, soy Marta Gómez");
		System.out.println("Introduce un número para averiguar si es primo o no: ");

		int num = teclado.nextInt();
		teclado.close();
		boolean primo = true;
		String divisores = "";

		if (num <= 1) {
			primo = false;
		} else {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					divisores += i + ", ";
					if (i != 1 && i != num) {
						primo = false;
					}
				}
			}
		}

		if (primo) {
			System.out.println(num + " es primo");
		} else {
			System.out.println(num + " no es primo");
			System.out.println("Los divisores del " + num + " son: " + divisores);
		}
	}

}



