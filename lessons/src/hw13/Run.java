package hw13;

public class Run {
    public static void main(String[] args) {
Employee emp =new Employee("Шевченко Тарас Григорович", "Розробник", "taras@example.com", "+380991234567", 25);
System.out.println("=== Інформація про співробітника ===");
System.out.println("ПІБ: " + emp.getFullName());
System.out.println("Посада: " + emp.getPosition());
System.out.println("Email: " + emp.getEmail());
        System.out.println("Телефон: " + emp.getPhone());
        System.out.println("Вік: " + emp.getAge());

        System.out.println("\n===================================\n");
        System.out.println("=== Процес запуску автомобіля ===");
        Car myCar =new Car();
        myCar.start();
    }
}
