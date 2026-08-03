package hw12;

public class Hw12 {
    public static void main(String[] args) {
        Person person1 = new Person("Joshn",30,"Інженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");
        person1.printInfo();
        person2.printInfo();
        person3.printInfo();

        System.out.println();
        Person alice = new Person("Alice", 28, "Архітектор");
        alice.printInfo();

        alice.setProfession("Дизайнер");
        System.out.println("(Після оновлення професії)");
        alice.printInfo();
    }
}
