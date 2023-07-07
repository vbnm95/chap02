
public class StringExample {
	public static void main(String[] args) {
		
		//char c ='';  char 타입은 ''불가
		
		String str1 = ""; //empty string
		String str2 = "\"Hello\"";
		char c1 = '\'';
		char c2 = '\'';
		String str3 = "Hello\\\\ \nWor\tld";
		String str4 = "\033[10;20H";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println((int)c1);
		System.out.println(c2);
		System.out.println(str3);
		System.out.print(str4);
		
	}
}
