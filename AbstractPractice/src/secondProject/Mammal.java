package secondProject;

public class Mammal extends Animal {

	Mammal(String type, String size, String noise, String fur, int legs, int hands) {
		super(type, size, noise, fur, legs, hands);
	}

	public void details()	{
		System.out.println(type + " " + size + " " + noise + " " + fur + " " + legs + " " + hands);
	}

}
