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

	public void printCalendar(int year, int month, int weekDay) {
		System.out.printf("    <<%4d년%3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("----------------------");

		int maxDay = getMaxDaysOfMonth(year, month);
		
		// print blank space
		for (int i = 0; i < weekDay; i++) {
			System.out.printf("%3s", " ");
		}
		
		// print from first line to last
		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if ((i + weekDay) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
	}
}
