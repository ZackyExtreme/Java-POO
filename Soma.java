import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		
		System.out.println("Soma de números inteiros");
		System.out.print("Valor 1: ");
	    a=s.nextInt();
	    System.out.print("Valor 2: ");
	    b=s.nextInt();
	    System.out.println("Resultado: "+(a+b));
	    System.exit(0);
	}

}
