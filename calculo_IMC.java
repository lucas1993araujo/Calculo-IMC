import java.util.Locale;
import java.util.Scanner;

public class calculo_IMC {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double altura, peso, IMC;

		System.out.println("Por favor digite sua altura em cm: ");
		altura = sc.nextDouble();

		System.out.println("Por favor digite seu peso kg: ");
		peso = sc.nextDouble();

		IMC = peso / (altura * altura);
		System.out.printf("%.1f%n", IMC);

		if (IMC < 18.5) {
			System.out.printf("Seu IMC é de %.1f, e é classificado como MAGREZA%n", IMC);
		} else if (IMC >= 18.5 && IMC < 24.9) {
			System.out.printf("Seu IMC e de %.1f, e é classificado como NORMAL%n", IMC);
		} else if (IMC >= 25 && IMC < 29.9) {
			System.out.printf("Seu IMC e de %.1f, e é classificado como SOBREPESO%n", IMC);
		} else if (IMC >= 30 && IMC < 39.9) {
			System.out.printf("Seu IMC %.1f, e é classificado como OBESIDADE%n", IMC);
		} else {
			System.out.printf("Seu IMC %.1f, foi classificado como OBESIDADE MÓRBIDA", IMC);
		}

		sc.close();

	}

}
