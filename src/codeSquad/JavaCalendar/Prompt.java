package codeSquad.JavaCalendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT = "cal> ";
	
	public void runPrompt() {
		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar();

		while (true) {
			System.out.println("월을 입력하세요.");
			System.out.print(PROMPT);
			int month = scan.nextInt();
			if (month == -1) {
				break;
			} else if (month == 0 || month > 12 || month < -2) {
				System.out.println("올바른 범위가 아닙니다!");
				continue;
			}
			cal.printCalendar(2022, month);
		}
		System.out.println("Have a nice day~");
		scan.close();
	}
	
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
