import javax.swing.JOptionPane;
public class Soma2 {

	public static void main(String[] args) {
		String a,b;
		int x,y;
		//ScanF com PrintF e tela de input
		
		a=JOptionPane.showInputDialog("Valor 1");
		b=JOptionPane.showInputDialog("Valor 2");
		//Janelas de Dialogo
		
		x=Integer.parseInt(a);
		y=Integer.parseInt(b);
		//Convers�o da String pra int
		
		JOptionPane.showMessageDialog(null,"A soma dos numeros �:"+(x+y));
		//Resultado da baga�eira toda
		
		System.exit(0);

	}

}
