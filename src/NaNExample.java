
public class NaNExample {
	/*
	 * 1. +0, -1
	 * 2. Infinity, -Infinity
	 * 3. NaN
	 * 
	 * 
	 */
	public static void main(String[] args) {
		double d1 = Double.NaN;
		double d2 = 0.0 / 0.0;
		//int i1 = 0/0;
		
		d1 = d1 * 100;
		
		System.out.println(d1);
		System.out.println(d2);
		//System.out.println(i1);

	}

}
