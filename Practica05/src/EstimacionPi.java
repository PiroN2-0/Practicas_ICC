public class EstimacionPi{
    public static void main(String[] args){
    //Variables que quiero que actualice el while
    double cantidadDards = 0.0;
    double dardos = 0.0;
    //while que no va a parar hasta que llegue al num de dardos que quieres
    while (cantidadDards<1000000) {
        double cordenadaX = Math.random();
        double cordenadaY = Math.random();
        if ((cordenadaX*cordenadaX)+(cordenadaY*cordenadaY)<=1) {
            dardos++;
        }
        cantidadDards++;   
    }
    //Sacar la estimacion de Pi
    double estimPi = 4 * (dardos / cantidadDards);
    //Impresion de texto y variables
    System.out.printf("La estiamcion de Pi es: %.6f%n",estimPi);
    System.out.println("Total de dardos lanzados: "+(int)cantidadDards);
    System.out.println("Cantidad de dardos que cayeron dentro del circulo: "+(int)dardos);
    }
}