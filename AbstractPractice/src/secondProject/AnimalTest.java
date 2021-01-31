package secondProject;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal;
		animal = new Cat("cat", "small", "mew", "hairy", 4, 1);
		animal.details();
		Animal dog = new Mammal("dog", "small", "mew", "hairy", 4, 1);
		dog.details();
		animal = new Bird("crow", "small", "kaka", "feather", 2, 2);
		animal.details();
		animal = new Fish("catFish", "small", " ", "bond", 0, 0);
		animal.details();

	}

}
