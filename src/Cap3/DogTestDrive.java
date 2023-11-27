package Cap3;

public class DogTestDrive {
	
	public static void main (String[] args) {
		
		Dog fido = new Dog();
		
		fido.name = "Fido";
		
		fido.bark();
		
		Dog[] myDogs = new Dog[3];
		
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = fido;
		
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";
		
		System.out.print("last dog's name is ");
		System.out.println(myDogs[2].name);
		
		int x = 0;
		
		while(x < myDogs.length) {
			myDogs[x].bark();
			x = x + 1;
		}
		
	}

}
