package first;

import java.util.ArrayList;


public class Showroom {
	
    String SRName;
    String SRArea;
	ArrayList<Cars> cars;
	public String getSRName() {
		return SRName;
	}
	public void setSRName(String sRName) {
		SRName = sRName;
	}
	public String getSRArea() {
		return SRArea;
	}
	public void setSRArea(String sRArea) {
		SRArea = sRArea;
	}
	public ArrayList<Cars> getCars() {
		return cars;
	}
	public void setCars(ArrayList<Cars> cars) {
		this.cars = cars;
	}
	
	public Showroom(String SRName, String SRArea,ArrayList<Cars> cars ){
		super();
		this.SRName=SRName;
		this.SRArea=SRArea;
		this.cars=cars;
		
	}
}
