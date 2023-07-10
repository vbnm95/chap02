
public class VariableScope {
	public static void main(String[] args) {
		int num1 = 100;
		
		{
			int num2 = 200;
			
			System.out.println(num1);
			System.out.println(num2);
		}
		
		System.out.println(num1);
		//System.out.println(num2);
	}
}
