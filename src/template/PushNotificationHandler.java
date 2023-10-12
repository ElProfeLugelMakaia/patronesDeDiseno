package template;

public class PushNotificationHandler extends NotificationHandler<PushNotification>{
    public PushNotificationHandler() {
        this.notification = new PushNotification();
    }

    @Override
    protected String getValue() {
        return "Push";
    }
}
