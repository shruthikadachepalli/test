package first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Test {
public static void main(String[] args) {
	Cars car1= new Cars("beetle", "Volkswagen", 300);
	Cars car2= new Cars("alto", "maruti", 500);
	Cars car3= new Cars("civic", "Honda", 400);
	Cars car4= new Cars("duster", "Renault", 500);
	Cars car5= new Cars("city", "Honda", 400);
	Cars car6= new Cars("duster2.0", "Renault", 300);
	Cars car7= new Cars("city2.0", "Honda", 450);

	ArrayList<Cars> carsList1=new ArrayList<>();
	carsList1.add(car1);
	carsList1.add(car2);
	carsList1.add(car3);
	
	ArrayList<Cars> carsList2=new ArrayList<>();
	carsList2.add(car4);
	carsList2.add(car5);
	
	ArrayList<Cars> carsList3=new ArrayList<>();
	carsList3.add(car6);
	carsList3.add(car7);
	
	Showroom sr1= new Showroom("xyz motors","HiTech City",carsList1);
	Showroom sr2= new Showroom("abc motors","Kondapur", carsList2);
	Showroom sr3= new Showroom("pqr motors","Madhapur",carsList3);
	
	HashMap<String, ArrayList<Cars>> m = new HashMap<String, ArrayList<Cars>>();
	m.put("xyz motors", carsList1);
	m.put("abc Motors", carsList2);
	m.put("pqr motors", carsList3);
	
	//-----------------------------------------------------------------------
	
	
	System.out.println(sr1.getSRName() + "\n" + sr1.getSRArea() + "\n");
	
	
	
	ArrayList<Cars> cl1 = m.get("");
	for(Cars c : cl1) {
		System.out.println(c.model);
	}
	
	

}
}
