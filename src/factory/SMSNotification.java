package factory;

public class SMSNotification implements INotification{
    @Override
    public void notifyUser(String message) {
        System.out.println("Notificación de mensaje de texto enviada correctamente: " + message);

    }
}
