package codeSquad.JavaCalendar;

import java.util.Scanner;

public class Prompt {
	
	public void runPrompt() {
		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar();

		while (true) {
			System.out.println("년도을 입력하세요.");
			System.out.print("YEAR> ");
			int year = scan.nextInt();
			System.out.println("월을 입력하세요.");
			System.out.print("MONTH> ");
			int month = scan.nextInt();
			System.out.print("첫번째 요일을 입력하세요. (SU MO TU WE TH FR SA)\n");
			System.out.print("WEEKDAY> ");
			String week = scan.next();
			
			if (year == -1 || month == -1) {
				break;
			} else if (month == 0 || month > 12 || month < -2) {
				System.out.println("올바른 범위가 아닙니다!");
				continue;
			}
			cal.printCalendar(year, month, week);
		}
		System.out.println("Have a nice day~");
		scan.close();
	}
	
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
