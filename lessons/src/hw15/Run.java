package hw15;

public class Run {
    public static void main(String[] args) {
        Printer printer=new ConsolePrinter();
        ConsolePrinter.Message msg1=new ConsolePrinter.Message("Доброго дня!", "Станіслав");
        printer.print(msg1);
        ConsolePrinter.Message msg2=new ConsolePrinter.Message("Тестовий текст",null);
        printer.print(msg2);

        ConsolePrinter.Message msg3= new ConsolePrinter.Message(null,null);
        printer.print(msg3);
    }
}
