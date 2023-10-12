package factory;

public class NotificationFactory {

    public static INotification create(NOTIFICATION_TYPE type) {
        switch (type){
            case EMAIL:
                return new EmailNotification();
            case CEL:
                return new PushNotification();
            case SMS:
                return new SMSNotification();
            default:
                throw new RuntimeException("Notification type not supported");
        }
    }
}
