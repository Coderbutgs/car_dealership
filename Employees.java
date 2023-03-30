package car_dealership;

public class Employees {
	public String namee;
	public String getNamee() {
		return namee;
	}
	public void setNamee(String namee) {
		this.namee = namee;
	}
	public void HandleCust( Customers customer, Vehicles vehicle , Boolean finance ) {
		
		System.out.println("Employee : Hello Sir . My name is " +this.getNamee() + " I am here to help you choose your vehicle.");
		System.out.println("Employee : Please tell me the name of the vehicle you want");
		System.out.println("Customer : " + vehicle.getNamev());
		System.out.println("Employee : " + vehicle.getNamev() + " has a price of : " + vehicle.getPrice() );
		System.out.println("Employee : Do you want to finance the car ?");
		if (finance == true)
			System.out.println("Customer : Yes");
		else
			System.out.println("Customer : No" );
		
		if (finance == true)
			runCreditHistory(customer , vehicle);
		else if(vehicle.getPrice() <= customer.getCashOnHand())
			processTransactions(customer , vehicle);
		else 
			System.out.println("Employee : Please visit again");
			
			
			
	}
	private void runCreditHistory(Customers customer, Vehicles vehicle) {
		System.out.println("Employee : You can get this car at an interest rate of 2% which you have to pay in installments every month for 10 years");
		double SI = vehicle.getPrice() * 2 * 10/100;
		System.out.println("Employee : Total price to be paid at the span of 10 years : " +(SI+vehicle.getPrice()));
		System.out.println("Employee : Do you wish to buy this car ?");
		System.out.println("Customer : Yes");
		System.out.println("Employee : Please provide your address.");
		System.out.println("Customer : " +customer.getAddress());
		System.out.println("Employee : Congratulations Mr." +customer.getName() + " " + vehicle.getNamev() + " belongs to you now");
		
	}
	private void processTransactions(Customers customer, Vehicles vehicle) {
		//double change = customer.getCashOnHand() - vehicle.getPrice();
		//System.out.println("Your change is:" +change);
		System.out.println("Employee : Do you wish to buy this car ?");
		System.out.println("Customer : Yes");
		System.out.println("Employee : Please provide your address.");
		System.out.println("Customer : " +customer.getAddress());
		System.out.println("Employee : Congratulations Mr." +customer.getName() + " " + vehicle.getNamev() + " belongs to you now");
	}
	
		
	}


