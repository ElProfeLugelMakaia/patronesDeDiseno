package template;

public abstract class NotificationHandler <T extends Notification>{

    T notification;

    protected abstract String getValue();
    protected void sendNotification(String message) {
        System.out.println("________________________");
        System.out.println("This is a notifiation");
        System.out.println("________________________");
        System.out.println(this.notification.getNotificationFormat());
        System.out.println("________________________");
        System.out.println("Value: " + this.getValue());
        System.out.println(message);
    }
}
