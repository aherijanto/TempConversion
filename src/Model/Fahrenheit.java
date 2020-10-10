package Model;

public class Fahrenheit {
	
	private double cTemp;
	
	public Fahrenheit(double CTemp ) {
		this.cTemp = CTemp;
	}
	public double getFahrenheit() {
		return (cTemp * 1.8) + 32;
	}
	public void setcTemp(double cTemp) {
		this.cTemp = cTemp;
	}
}
