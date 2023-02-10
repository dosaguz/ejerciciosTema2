package ejercicioTema2;

public class ejercicio6 {

	public static void main(String[] args) {
		Rebajas r1 = new Rebajas();

		System.out.println(r1.descubrePorcentaje(100,70));
	}

}
class Rebajas{
	double descubrePorcentaje(double precio, double nuevoPrecio){
		return (precio-nuevoPrecio)*100/precio;
	}
}