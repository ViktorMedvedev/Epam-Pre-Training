public class TomorrowDate {
    public static String determineTomorrowDate(int day, int month, int year) {
        int maxDays;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                    maxDays = 29;
                } else {
                    maxDays = 28;
                }
                break;
            default:
                maxDays = 31;
                break;
        }
        if (day > 0 && day <= maxDays) {
            if (day != maxDays) {
                day++;
            } else {
                day = 1;
                if (month != 12) {
                    month++;
                } else {
                    month = 1;
                    year++;
                }
            }
            return day + "." + month + "." + year;
        } else {
            return "There is no such date in a calendar";
        }
    }

    public static void run() {
        int day = 23;
        int month = 12;
        int year = 1997;
        System.out.println("Today is " + day + "." + month + "." + year);
        System.out.println("Tomorrow is " + determineTomorrowDate(day, month, year));
    }
}
