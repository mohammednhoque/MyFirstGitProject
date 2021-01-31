package secondProject;

public abstract class Animal {

String type, size, noise, fur;
int legs, hands;  


Animal(String type, String size, String noise, String fur, int legs, int hands){
	this.type = type;
	this.size = size;
	this.noise = noise;
	this.fur = fur;
	this.legs = legs;
	this.hands = hands;
	
	
}


	public abstract void details ();
	//abstract void detailsBird();
	//abstract void detailsFish();
	
}
