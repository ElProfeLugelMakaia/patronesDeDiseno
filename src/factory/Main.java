package factory;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        INotification notification = NotificationFactory.create(NOTIFICATION_TYPE.CEL);
        notification.notifyUser("Hola amigos de youtube");
    }
}