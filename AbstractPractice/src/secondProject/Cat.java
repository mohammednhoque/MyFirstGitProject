package secondProject;

public class Cat extends Mammal {
	Cat(String type, String size, String noise, String fur, int legs, int hands) {
		super(type, size, noise, fur, legs, hands);
	}

	public void details() {
		System.out.println("From cat: "+ type + " " + size + " " + noise + " " + fur + " " + legs + " " + hands);
	}

}
