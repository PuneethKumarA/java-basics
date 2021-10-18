package ecommerce;

public class Customer {

	public void walkin() {
		System.out.println("abdul is going into big bazaar");
	}
    public void shop() {
    	System.out.println("Customer is shopping");
    }
    public void checkout() {
    	Cashier ansariCashier = new Cashier();
    	ansariCashier.estimate();
    }
	
}
