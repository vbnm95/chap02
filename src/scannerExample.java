import java.util.Scanner;

public class scannerExample {
	public static void main(String[] args) {
		
		System.out.print("당신의 나이는 >>");
		
		Scanner scanner = new Scanner(System.in);
		String age = scanner.nextLine();
		
		System.out.printf("10년 후 당신의 나이는 %d 살 입니다\n", Integer.parseInt(age)+10);
		
		scanner.close();
	}
}
