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
		//Conversão da String pra int
		
		JOptionPane.showMessageDialog(null,"A soma dos numeros é:"+(x+y));
		//Resultado da bagaçeira toda
		
		System.exit(0);

	}

}
