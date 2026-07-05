package hw05;

public class Main {
    public static void main(String[] args) {


        // Змінні, які будуть перевикористовуватися для кожного товару
        String name;
        int days;
        int quantity;
        double price;
        double totalSales;
        double salesPerDay;
        name = "smartphone";
        days =5;
        quantity = 7;
        price = 1736.2014;
        totalSales = quantity * price;
        salesPerDay = totalSales / days;
        System.out.printf("product No 1: %s,%n", name);
        System.out.printf("total sales for %d days is EUR %.2f,%n", days, totalSales);
        System.out.printf("sales by day is EUR %.2f.%n", salesPerDay);
        name ="laptop";
        days = 7;
        quantity = 5;
        price = 2037.97;
        totalSales = quantity * price;
        salesPerDay = totalSales / days;
        System.out.printf("Product No 2: %s,%n", name);
        System.out.printf("total sales for %d days is EUR %.2f,%n", days, totalSales);
        System.out.printf("sales by day is EUR %.2f.%n", salesPerDay);
    }

}
