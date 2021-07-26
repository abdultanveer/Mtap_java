package basics.overrriding;

public class TestCalculation {
	
	public static void main(String[] args) {
		/*
		 * IncomeTax incomeTax = new IncomeTax(); System.out.println("your tax is"+
		 * incomeTax.calculatTax(10000));
		 */
		
		GST gst = new GST();
		System.out.println("gst is "+gst.calculatTax(10000));
		
		//incomeTax.calculatTax(10000);
	}

}
