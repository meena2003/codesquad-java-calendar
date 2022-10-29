package codeSquad.JavaCalendar;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public int getMaxDaysOfMonth(int year, int month) {
		return isLeapYear(year) ? LEAP_MAX_DAYS[month - 1] : MAX_DAYS[month - 1];
	}

	public void printCalendar(int year, int month, String week) {
		System.out.printf("    <<%4d년%3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("----------------------");

		int maxDay = getMaxDaysOfMonth(year, month);

		int blank = 0;
		switch (week) {
			case "SU":
				blank = 0;
				break;
			case "MO":
				blank = 1;
				break;
			case "TU":
				blank = 2;
				break;
			case "WE":
				blank = 3;
				break;
			case "TH":
				blank = 4;
				break;
			case "FR":
				blank = 5;
				break;
			case "SA":
				blank = 6;
				break;
		}
		
		for (int i = 0; i < blank; i++) {
			System.out.printf("%3s", " ");
		}
		
		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if ((i + blank) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
}
