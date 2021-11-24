package Dios;

	
public class Humano {
	//Atributos 
	String name;
	String race;
	String hairColour;
	String eyesColour;
	int age;
	String sex;
	Integer hands = 2;
	Integer foots = 2;
	
	public Humano() {
		
	}
	//Métodos
	public void sumar(int x, int y) {
		 int suma = x + y;
		 System.out.println("El resultado es " + suma);
	}

	public static void main(String[] args) {
		Humano h = new Humano();
		h.sumar(7, 10);
	}
}
