package ejercicioTema2;

public class Moto {
	String marca;
	double velocidad;
	
	public Moto() {
		marca = "Sin marca";
		velocidad= 0.0;
	}
	
	public Moto(String lamarca, double lavelocidad) {
		marca = lamarca;
		velocidad = lavelocidad;
	}
	
	public String obtenerMarca() {
		return marca;
	}
	public double obtenerVelocidad() {
		return velocidad;
	}
	public void modificarMarca(String lamarca) {
		marca = lamarca;
	}
	public void modificarVelocidad(double lavelocidad) {
		velocidad = lavelocidad;
	}
	
	public static void main(String[] args) {
		

	}

}
