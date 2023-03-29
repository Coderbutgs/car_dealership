package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		Customers cust1 = new Customers();
		cust1.setName("Karan");
		cust1.setAddress("LIG - 1847");
		cust1.setCashOnHand(1000000);
		
		Customers cust2 = new Customers();
		cust2.setName("Rahul");
		cust2.setAddress("Landmark City");
		cust2.setCashOnHand(6000000);
		
		Customers cust3 = new Customers();
		cust3.setName("Kunal");
		cust3.setAddress("Maruti Heights");
		cust3.setCashOnHand(600000);
		
		
		Employees emp1 = new Employees();
		emp1.setNamee("Rakesh");
		Employees emp2 = new Employees();
		emp2.setNamee("Rajesh");
		
		Vehicles veh1 = new Vehicles();
		veh1.setNamev("Breeza");
		veh1.setPrice(800000);
		
		Vehicles veh2 = new Vehicles();
		veh2.setNamev("Dzire");
		veh2.setPrice(900000);
		
		Vehicles veh3 = new Vehicles();
		veh3.setNamev("Audi");
		veh3.setPrice(5000000);
		
		cust1.PurchaseCar(veh1,emp1,false);
		cust2.PurchaseCar(veh3, emp2, true);
		cust3.PurchaseCar(veh1, emp1, false);
	
		
		
	}

}
