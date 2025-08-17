package services;

public class EuaTaxService implements TaxService {
	
	public double tax(double amount) {
		if(amount <=100.0) {
			return amount * 0.4;
		}else {
			return amount * 0.30;
		}
	}

}
