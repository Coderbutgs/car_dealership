package car_dealership;

public class Customers {
	private String name;
	private String address;
	private int CashOnHand;
	
	public void PurchaseCar(Vehicles vehicle , Employees employee , Boolean finance ) {
		employee.HandleCust(this, vehicle, finance);
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address += " Dealership City";
		this.address = address;
	}

	public double getCashOnHand() {
		return CashOnHand;
	}

	public void setCashOnHand(int cashOnHand) {
		CashOnHand += 50000;
		CashOnHand = cashOnHand;
	}
	

}
