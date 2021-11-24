package Dios;

public class Animal {
	private String name;
	private String continent;
	private int age;
	
	public Animal(String name, String continent, int age) {
		this.name = name;
		this.continent = continent;
		this.age = age;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		
		Animal leon = new Animal("León", "África", 15);
		
		System.out.println("El " + leon.getName() + 
				" es un animal que vive en " + leon.getContinent() + 
				" y suele alcanzar una edad máxima de " +
				leon.getAge() + " años.");
		
		
	}

}

