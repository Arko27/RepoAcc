package ActivityDay1;

public class TestCar {

	public static void main(String[] args) {
		
		Car car1 = new Car("Model1", "color1", "manuf1");
		Car car2 = new Car("Model2", "color2", "manuf2");
		Car car3 = new Car("Model3", "color3", "manuf3");
		
		System.out.println("Details of Car1");
		System.out.println(car1.getModel() + "\n" + car1.getColor() + "\n" + car1.getManufacturer());
		
		System.out.println("\nDetails of Car2");
		System.out.println(car2.getModel() + "\n" + car2.getColor() + "\n" + car2.getManufacturer());
		
		System.out.println("\nDetails of Car3");
		System.out.println(car3.getModel() + "\n" + car3.getColor() + "\n" + car3.getManufacturer());
		
		

	}

}
