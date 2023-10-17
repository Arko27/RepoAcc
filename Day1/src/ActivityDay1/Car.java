package ActivityDay1;

public class Car {

	private String model, color, manufacturer;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public Car(String model, String color, String manufacturer) {
		this.model = model;
		this.color = color;
		this.manufacturer = manufacturer;
	}
}