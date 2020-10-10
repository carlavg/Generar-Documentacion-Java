import javax.swing.*;
/**
 * Esta clase permite definir unos m�todos basicos de l�gica matem�tica,
 * como la suma, resta, multiplicaci�n.
 * 
 * @author MIpc
 *
 */
public class Logica {
 
	/**
	 * M�todo que permite sumar dos valores de tipo enteros y mostrarlos.
	 */
	
	public void sumar() {
		
		int num1=5;  //Esto es una variable entera que almacena el 5.
		int num2=6;
		
		JOptionPane.showMessageDialog(null, (num1+num2));
	}

	/**
	 * M�todo que me permite restar 2 valores enteros
	 * @param num1 - valor ingresado por el usuario.
	 * @param num2 - valor ingresado por el usuario.
	 */

	
	public void restar(int num1, int num2) {
	
	/**
	 * Este es un mensaje que muestra la resta de los 2 
	 * valores que llegan como p�rametro.
	 */
	
	JOptionPane.showMessageDialog(null, (num1-num2));
}

	/**
	 * Este m�todo permite multiplicar dos valores.
	 * @param num1 - valor 1
	 * @param num2 - valor 2
	 * @return - retorna un valor entero con el resultado de la operaci�n.
	 */
public int multiplicar(int num1, int num2) {
	return num1*num2;
	
	
}


}
