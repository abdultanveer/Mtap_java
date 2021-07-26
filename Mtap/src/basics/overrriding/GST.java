package basics.overrriding;

public class GST extends IncomeTax{
	@Override
	public int calculatTax(int income) {
		int oldTax = super.calculatTax(income);
		int gst = 0;
		if(income > 1000) {
			gst = 100;
		}
		return oldTax + gst;
	}

}
