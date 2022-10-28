package codeSquad.JavaCalendar;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.");
		String num = scan.nextLine();
		int pos = num.indexOf(" ");
		int a = Integer.parseInt(num.substring(0, pos));
		int b = Integer.parseInt(num.substring(pos + 1));
		System.out.printf("%d와 %d의 합은 %d입니다.", a, b, a + b);
		scan.close();
	}

}
