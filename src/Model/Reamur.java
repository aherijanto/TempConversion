package Model;

public class Reamur {
	private double cTemp;
	
	public Reamur(double CTemp ) {
		this.cTemp = CTemp;
	}
	public double getReamur() {
		return cTemp * 0.8;
	}
	public void setcTemp(double cTemp) {
		this.cTemp = cTemp;
	}
	
	

}
