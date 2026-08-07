package hw13;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Автомобіль успішно запущено!");
    }


    private void startElectricity() {
        System.out.println("Запуск електроживлення...");
    }

    private void startCommand() {
        System.out.println("Перевірка систем та подача команди...");
    }

    private void startFuelSystem() {
        System.out.println("Подача палива в систему...");
    }
}