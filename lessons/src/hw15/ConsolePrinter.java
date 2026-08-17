package hw15;

public class ConsolePrinter implements Printer {

    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    @Override
    public void print(Message message) {
        boolean isTextEmpty = message.getText() == null || message.getText().trim().isEmpty();
        boolean isSenderEmpty = message.getSender() == null || message.getSender().trim().isEmpty();

        if (isTextEmpty && isSenderEmpty) {
            Runnable emptyHandler = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            emptyHandler.run();
            return;
        }

        if (isSenderEmpty) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
        } else {
            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
        }
    }
}