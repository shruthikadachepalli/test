package first;

public class Cars {
	String model;
	String maker;
	int mileage;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	 
	public Cars(String model, String maker, int mileage){
		super();
		this.model= model;
		this.maker=maker;
		this.mileage=mileage;
	}
	
	
}
