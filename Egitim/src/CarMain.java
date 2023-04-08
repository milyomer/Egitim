
public class CarMain {	
	public static void main(String[] args) {
		
		Car audi = new Car();
		audi.model= "Audi A6";
		audi.speed= 10;
		audi.increaseSpeed(20);
		audi.decreaseSpeed(10);
		
		audi.printSpeed();
		
		Car bmw = new Car();
		bmw.model= "Bmw M110";
		bmw.speed= 20;
		bmw.increaseSpeed(20);
		bmw.increaseSpeed(50 );
		bmw.increaseSpeed(5);
		bmw.increaseSpeed(100);

		bmw.printSpeed();
		
		Car mercedes = new Car();
		mercedes.model= "Mercedes Clk";
		mercedes.speed=30;
		
		mercedes.printSpeed();
		
	}
}
