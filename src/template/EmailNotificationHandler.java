package template;

public class EmailNotificationHandler extends NotificationHandler<EmailNotification>{
    public EmailNotificationHandler() {
        this.notification = new EmailNotification();
    }

    @Override
    protected String getValue() {
        return "Email";
    }
}
