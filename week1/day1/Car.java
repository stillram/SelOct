package week1.day1;

public class Car {
	
	// 
	boolean isPuncture = true;
	char brandSymbol = '$';
	int vehicleAge = 40101;
	long vehOwnerPhone = 9234567890L;
	float vehCost = 1233.33f;
	double vehCost2 = 1235.4567888;
	String brand = "Maruti";
	
	
	
	public void printGears() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Gear "+i);
		}
	}
	
	
	
	
	
	
	public void applyBrake() {
		System.out.println("brake is applied");
	}
	
	public String getColor() {
		return "red";
	}
	
	public void changeGear(int gear) {
		if (gear < 0) {
			System.out.println("Reverse gear");
		}else if(gear > 0){
			System.out.println("Forward gear");
		}else {
			System.out.println("neutral");
		}
//		System.out.println(gear);
	}
	
	
	
}


/*// ClassName obj = new ClassName();
		Vehicle veh = new Vehicle();*/