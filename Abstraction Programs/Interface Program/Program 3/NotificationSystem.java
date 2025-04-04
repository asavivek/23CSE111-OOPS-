interface NotificationService {
    void sendNotification(String message);
}

class EmailService implements NotificationService {
    public void sendNotification(String message) {
        System.out.println("Email Sent: " + message);
    }
}

class SMSService implements NotificationService {
    public void sendNotification(String message) {
        System.out.println("SMS Sent: " + message);
    }
}

class PushNotification implements NotificationService {
    public void sendNotification(String message) {
        System.out.println("Push Notification: " + message);
    }
}

public class NotificationSystem {
    public static void main(String[] args) {
        NotificationService email = new EmailService();
        NotificationService sms = new SMSService();

        email.sendNotification("Your order is confirmed!");
        sms.sendNotification("OTP: 123456");
    }
}