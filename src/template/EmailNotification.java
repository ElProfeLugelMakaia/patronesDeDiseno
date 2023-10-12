package template;

public class EmailNotification extends Notification{
    @Override
    public String getNotificationFormat() {
        return "Notificación de Email";
    }
}
