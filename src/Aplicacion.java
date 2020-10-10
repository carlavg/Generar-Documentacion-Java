import javax.swing.*;

/**
 * Clase principal del sistema.
 * @author MIpc
 *
 */

public class Aplicacion {

	/**
	 * Este es el método principal.
	 * @param args
	 */
	public static void main(String args[]) {
		
		Logica miLogica=new Logica();
		miLogica.sumar();
		miLogica.restar(5, 3);
		int mult=miLogica.multiplicar(2, 4);
		JOptionPane.showMessageDialog(null, mult);
	
		
	}
}
