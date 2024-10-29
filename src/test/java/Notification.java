abstract class Notification {
    public abstract void sendNotification(String message);
}


class EmailNotification extends Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email Notification: " + message);
    }
}


class SMSNotification extends Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS Notification: " + message);
    }
}


public class NotificationService {
    public static void sendAlert(Notification notification, String message) {
        notification.sendNotification(message);
    }

    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();

        sendAlert(email, "This is an email alert!");
        sendAlert(sms, "This is an SMS alert!");
    }
}
