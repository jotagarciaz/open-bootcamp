package firstLesson;

public class Main {
	
	public static void suma(int a, double b, double c) {
		System.out.println("la suma es: "+(a+b+c));
	}
	public static void main(String[] args) {
		suma(5,2.1, 3.3);
		
		Coche miCoche = new Coche(4);
		miCoche.incrementaPuertas();
		System.out.println("Mi Coche: " + miCoche.getPuertas());
	}

}
