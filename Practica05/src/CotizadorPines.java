public class CotizadorPines {
    public static void main(String[] args){
        //Declaracion de variables
		String Client1= "Robbie Valentino";
		double precioCl1 = 12899.00;
		int periodopago = 21;
		int interesAn = 15;
		final int AN = 12;
        double deuda = precioCl1;
		char preferente = 'P';
		char estandar = 'E';
		char riesgosos = 'R';
        char tipoClient1 = estandar;
		double saldoComFin = 0.0;
		//Evaluación del tipo de cliente que es y si se suma o resta al intéres
        if (tipoClient1==preferente) {
            interesAn -=2; 
        }else if(tipoClient1==riesgosos){
            interesAn += 3;
		}
		//para que el if afecte al interes compuesto tambien
		double interesMen = interesAn/100.0/AN;
		//Compracion de las variables sean mayores a 0 o que sean un char específico para que no de cosas raras 
		if ((periodopago>0&&AN==12)&&(precioCl1>0&&interesAn>0)&&(tipoClient1=='P'||tipoClient1=='E'||tipoClient1=='R')&&(interesMen>=0&&deuda==precioCl1)) {
            double tiempoAn = (double) periodopago / AN;
            double interesTotl= ((((double)precioCl1 * interesAn) / 100 ) * tiempoAn);
			double pagoTotl = (double) precioCl1 + interesTotl;
		//Interes compuesto con Mathpow
		saldoComFin = deuda*Math.pow((1.0+interesMen), periodopago);
		//Calculo de interes compuesto
		for(int i=1; i<=periodopago; i++){
            deuda = deuda*(1.0+interesMen);
        }
             //Impresion de variables mas texto
			 	System.out.println("Tasa aplicada: "+interesAn+"%");
				System.out.printf("Préstamo= "+"$%.2f%n",precioCl1);
				System.out.println("Meses de pago= "+periodopago);
				System.out.printf(Client1 + " pagará de interés simple: %.2f%n", interesTotl);
				System.out.printf(Client1 + " pagará en total con intéres simple: %.2f%n", pagoTotl);
				System.out.printf("El interés compuesto fue de: %.2f%n",(deuda-precioCl1));
				System.out.printf("Total con interés compuesto: %.2f%n",deuda);
				System.out.printf("Total con interés compuesto(Math.Pow): %.2f%n",saldoComFin);
				System.out.printf(Client1 + " es cliente : %c%n ", tipoClient1);
        }else{
            System.out.println("Números o tipo de cliente no valido");
        }
    }

}