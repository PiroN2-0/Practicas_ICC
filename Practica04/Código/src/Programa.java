public class Programa{	
	public static void main(String[] args) {
	//Nombre del producto:
	String producto = "Laptop para la carrera";
	//Precio del producto:
	int precio = 15000;
	//Descuento:
	int descuento = 3000;
	//Plazos a pagar
	double meses = 18.0;
	//Titulo del programa
	System.out.println("=== Ficha de compra ===");
	//Estas imprimiendo un texto mas la variable producto:
	System.out.println("- Producto : " + producto);	
	//Estas imrpimiendo un texto mas la resta del precio con el descuento:
	System.out.println("- Precio con descuento : " + (precio - descuento));
	//Estas imrpimeidno un texto mas la division de meses en 12 para convertirlo en años:
	System.out.println("- Plazo de pago en anios : " + (meses / 12.0));
	//Estas imrpimiendo un texto mas la division del precio menos el descuento entre los meses que tienes que pagar
	System.out.println("- Pago mensual :" + ((precio - descuento) / meses));
	//Titulo del fin del progrma
	System.out.println("=== Fin de la ficha ===");
	}
}