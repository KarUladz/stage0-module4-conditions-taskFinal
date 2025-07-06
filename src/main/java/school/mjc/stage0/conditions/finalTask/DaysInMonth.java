package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year >= 0) {
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            int februaryDaysCount = isLeapYear ? 29 : 28;
            printCountDaysMessage(februaryDaysCount, month);
        } else {
            printInvalidMessage();
        }
    }

    public static void printCountDaysMessage(int februaryDaysCount, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            case 2:
                System.out.println(februaryDaysCount);
                break;
            default:
                printInvalidMessage();
                break;
        }
    }

    public static void printInvalidMessage() {
        System.out.println("invalid date");
    }

}
