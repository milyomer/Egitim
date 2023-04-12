class Car {

	String type;
	String model= "Sedan";
	String color;
	int speed;
	int speedLimit= 180;
	
	void increaseSpeed(int increment) {
		
		
		speed+=increment;
		
	}
	
	void decreaseSpeed(int decrease){
		
		if(speed>0) {
		speed-=decrease;
		
		}
	}
		void printSpeed() {
			System.out.println(model+ " hızınız: "+ speed);
	}
}