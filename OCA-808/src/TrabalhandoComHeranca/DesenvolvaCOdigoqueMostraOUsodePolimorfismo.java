package TrabalhandoComHeranca;

public class DesenvolvaCOdigoqueMostraOUsodePolimorfismo {
	
	public static void main(String args[]) {
	Car c = new Car();
	c.turnon(); // Car running
	c.turnoff();
	
	Vehicle v = new Car();
	v.turnon(); //(Car running) Em Java, quando você sobrescreve um método em uma subclasse 
				//e faz uma chamada através de uma referência do tipo da superclasse, 
				//o método chamado será o do objeto instanciado (subclasse), não o da 
	            //referência.
	//v.turnoff(); // compile error
	}
}
class Vehicle {
	void turnon() {
		System.out.println("Vehicle running");
	}
}

class Car extends Vehicle {
	void turnon() {
		System.out.println("Car running");
	}

	void turnoff() {
	}
}