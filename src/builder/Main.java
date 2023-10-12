package builder;

import factory.INotification;
import factory.NOTIFICATION_TYPE;
import factory.NotificationFactory;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Account account = new AccountBuilder()
                .withType(ACCOUNT_TYPE.AHORROS)
                .withNumber(214124123L)
                .withAmmount(10000D)
                .withOwner("Lugel Franco")
                .build();

        Account defaultAc = new AccountBuilder()
                .withDefaults("Lugel Franco")
                .build();


        System.out.println(account);
        System.out.println(defaultAc);

    }
}