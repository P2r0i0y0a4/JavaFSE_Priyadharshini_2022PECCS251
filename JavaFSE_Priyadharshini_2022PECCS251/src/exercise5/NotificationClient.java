package exercise5;

public class NotificationClient {
    public static void main(String[] args) {
        System.out.println("Demonstrating Decorator Pattern for Notification System:\n");

        String message = "Urgent: Server is down!";

        // 1. Basic Email Notification
        System.out.println("--- Basic Email Notification ---");
        Notifier emailOnlyNotifier = new EmailNotifier();
        emailOnlyNotifier.send(message);
        System.out.println("\n");

        // 2. Email + SMS Notification
        System.out.println("--- Email + SMS Notification ---");
        // Decorate an EmailNotifier with SMS functionality
        Notifier emailAndSMSNotifier = new SMSNotifierDecorator(new EmailNotifier());
        emailAndSMSNotifier.send(message);
        System.out.println("\n");

        // 3. Email + Slack Notification
        System.out.println("--- Email + Slack Notification ---");
        // Decorate an EmailNotifier with Slack functionality
        Notifier emailAndSlackNotifier = new SlackNotifierDecorator(new EmailNotifier());
        emailAndSlackNotifier.send(message);
        System.out.println("\n");

        // 4. Email + SMS + Slack Notification (Chained Decorators)
        System.out.println("--- Email + SMS + Slack Notification ---");
        // First, decorate Email with SMS, then decorate the result with Slack
        Notifier allChannelNotifier = new SlackNotifierDecorator(
                                        new SMSNotifierDecorator(
                                            new EmailNotifier()
                                        )
                                    );
        allChannelNotifier.send(message);
        System.out.println("\n");

        // You can also start with a different base, e.g., an SMS-only notifier
        System.out.println("--- SMS Only then add Slack ---");
        Notifier smsOnlyBase = new SMSNotifierDecorator(new EmailNotifier() {
            // Anonymous inner class or a dedicated SMSNotifier if it's the base
            @Override
            public void send(String msg) {
                // In a real scenario, this would be the actual SMS sending base
                System.out.println("Base SMS (simulated only for this example) : " + msg);
            }
        });
        Notifier smsThenSlack = new SlackNotifierDecorator(smsOnlyBase);
        smsThenSlack.send("Reminder: Meeting at 3 PM");
        System.out.println("\n");
    }
}