package epamHT_4.HT_4;

public class SI_CI {
	public double SimpleInterest(double p,int t,double r) {
		return p*t*r/100;
	}
	public double CompoundInterest(double p,int t,double r) {
		return p*Math.pow(1+(r/100), t);
	}
}
