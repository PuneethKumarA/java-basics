package inheritance;

public class DemoTaxation {

	public static void main(String[] args) {
		IncomeTax incometax = new IncomeTax();
		Gst gst = new Gst();
		int tax = gst.calculateTax(10000);
		System.out.println("Tax is"+ tax);
	}

}
