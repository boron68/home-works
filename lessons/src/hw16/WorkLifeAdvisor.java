package hw16;

public class WorkLifeAdvisor implements Advisor {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Фокусуйтеся на головних завданнях, робіть короткі перерви щогодини та вимикайте сповіщення, щоб залишатися продуктивними на роботі!");
                break;

            case FRIDAY:
                System.out.println("Happy Friday!");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("Чудові вихідні! Рекомендую відвідати місцевий парк, затишну кав'ярню або відправитися за місто на природу.");
                break;
        }
    }
}