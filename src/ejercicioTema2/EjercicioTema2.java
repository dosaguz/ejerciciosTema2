package ejercicioTema2;

public class EjercicioTema2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperatura myTemp = new Temperatura();
		System.out.println(myTemp.celsiusToFarenheit(0));
		System.out.println(myTemp.FarenheitTocelsius(32));
	}

}

class Temperatura{	
	public static double celsiusToFarenheit(double grados) {
	return (1.8)*grados+32;
	}
	public static double FarenheitTocelsius(double grados) {
	return (grados-32)/1.8;
	}
}

class TemperaturaMejorada{
	double temperaturaActual;
	void darTemperatura(double temp) {
		this.temperaturaActual = temp;
	}
	double devolverTemperatura(){
	return this.temperaturaActual;	
	}
}