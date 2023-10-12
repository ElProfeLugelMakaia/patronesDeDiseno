package factory;

public class PushNotification implements INotification{
    @Override
    public void notifyUser(String message) {
        System.out.println("Notificación push enviada correctamente: " + message);

    }
}
