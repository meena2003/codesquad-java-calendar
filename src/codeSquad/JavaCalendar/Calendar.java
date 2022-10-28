package codeSquad.JavaCalendar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printSampleCalendar() {
		System.out.println("월  화  수  목  금  토  일");
		System.out.println("----------------------");
		System.out.println(" 1  2  3  4   5  6  7");
		System.out.println(" 8  9 10 11  12 13 14");
		System.out.println("15 16 17 18  19 20 21");
		System.out.println("22 23 24 25  26 27 28");
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		System.out.println("반복횟수를 입력하세요.");
		int n = scan.nextInt();
		
		List<Integer> listOfMonth = new ArrayList<>();
		
		System.out.println("월을 입력하세요.");
		do {
			listOfMonth.add(scan.nextInt());
			n--;
		} while (n > 0);

		System.out.println();
		
		for (int i = 0; i < listOfMonth.size(); i++) {
			System.out.printf("%d월은 %d일까지 있습니다.\n", listOfMonth.get(i), cal.getMaxDaysOfMonth(listOfMonth.get(i)));
		}
		
		scan.close();

	}
}
