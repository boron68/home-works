package hw16;

public class Run {
    public static void main(String[] args) {
        Advisor advisor = new WorkLifeAdvisor();

        System.out.print("Понеділок: ");
        advisor.advise(Day.MONDAY);

        System.out.print("П'ятниця: ");
        advisor.advise(Day.FRIDAY);

        System.out.print("Субота: ");
        advisor.advise(Day.SATURDAY);
    }
}