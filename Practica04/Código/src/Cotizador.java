public class Cotizador{
	public static void main(String[] args) {
		//Declaracion de variables
		String Client1= "Robbie Valentino";
		int precioCl1 = 12899;
		int periodopago = 21;
		int interesAn = 15;
		int an = 12;
		char preferente = 'P';
		char estandar = 'E';
		char riesgosos = 'R';
			//Operaciones con variables, todo lo puse con double porque las varibles las puse en enteros para que se usaran decimales
			double tiempoAn = (double) periodopago / an;
			double interesTotl= ((((double)precioCl1 * interesAn) / 100 ) * tiempoAn);
			double pagoTotl = (double) precioCl1 + interesTotl;
			double mensualidad = (double) pagoTotl / periodopago;
				//Impresion de variables mas texto
				System.out.printf(Client1 + " pagará de interes: %.2f%n", interesTotl);
				System.out.printf(Client1 + " pagará en total : %.2f%n", pagoTotl);
				System.out.printf(Client1 + " pagará al mes por 21 meses : %.2f%n", mensualidad);
				System.out.printf(Client1 + " es cliente : %c%n ",estandar);
	}
}