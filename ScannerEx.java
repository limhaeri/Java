package review_ch02;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("이름, 나이, 키를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		int age = scanner.nextInt();
		double height = scanner.nextDouble();
		System.out.println("당신의 이름은 "+name+" 입니다.");
		System.out.println("당신의 나이는 "+age+" 입니다.");
		System.out.println("당신의 키는 "+height+" cm입니다.");
	}
}
