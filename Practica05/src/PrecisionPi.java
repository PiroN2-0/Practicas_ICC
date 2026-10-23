public class PrecisionPi {
    public static void main(String[] args) {
    //Variables que va a usar el while o actualizar
    double tolerencia = 0.001;
    double cantidadDards = 0.0;
    double dardos = 0.0;
    double error = 1;
    double estimPi = 0.0;
    //While que no va a parar hasta que el error sea mayor o igual a la tolerancia
    while (error>=tolerencia) {
        double cordenadaX = Math.random();
        double cordenadaY = Math.random();
        if ((cordenadaX*cordenadaX)+(cordenadaY*cordenadaY)<=1) {
            dardos++;
        }
        cantidadDards++;
        //Actualizacion de las variables que se usan para que llegue a la tolerancia deseada
        estimPi = 4 * (dardos / cantidadDards);
        error = Math.abs((estimPi-Math.PI));   
    }
    //Impresiones de texto mas variables
    System.out.printf("La estiamcion de Pi es: %.6f%n",estimPi);
    System.out.println("Dardos necesarios: "+(int)cantidadDards);
    }
}
