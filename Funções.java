import java.util.Scanner;

public class Funções {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float a,b;
		System.out.print("Valor 1:");
		a=s.nextFloat();
		System.out.print("Valor 2: ");
		b=s.nextFloat();
		System.out.println("Soma: " + soma(a,b));
		System.out.println("Produto: " + produto(a,b));
		System.exit(0);

	}
	
	public static float soma(float x, float y) {
		return (x+y);
	}
	
    public static float produto(float x, float y) {
    	return (x*y);
    }
}
