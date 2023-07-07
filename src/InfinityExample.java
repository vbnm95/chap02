import java.util.Scanner;

public class InfinityExample {
	
	public static void main(String[] args) {
		double d1 = Double.POSITIVE_INFINITY;
		double d2 = 100/0.0;
		double d3 = 100/3.0;
		double i1 = 0.0/0.0;
		double i2 = 0.0/0.0;
		
		System.out.println("d1=" + d1);
		System.out.println("d2=" + d2);
		System.out.println("d3=" + d3);
		System.out.println("i1=" + i1);
		System.out.println("i2=" + i2);
		
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		
		System.out.println(str);
		
		scanner.close();
	}
	
}
