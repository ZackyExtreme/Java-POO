import java.util.Scanner;

public class Função2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float peso, altura;
		float imc;
		System.out.println("Peso da Pessoa (kg) ");
		peso = ler.netFloat();
		System.out.println("Altura d Pessoa (m) ");
		altura = ler.nextFloat();
		imc = calcIMC(peso,altura);
		System.out.println("Resultado do IMC: " + resultadoIMC(imc));
		ler.close();
		System.exit(0);

	}
	
	public

}
