package factory;

public class EmailNotification implements INotification{
    @Override
    public void notifyUser(String message) {
        System.out.println("Notificación de email enviada correctamente: " + message);
    }
}
