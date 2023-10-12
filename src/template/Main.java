package template;

import factory.INotification;
import factory.NOTIFICATION_TYPE;
import factory.NotificationFactory;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        NotificationHandler<EmailNotification> handler = new EmailNotificationHandler();
        handler.sendNotification("Hola");

        NotificationHandler<PushNotification> handler2 = new PushNotificationHandler();
        handler2.sendNotification("Hola 2");
    }
}