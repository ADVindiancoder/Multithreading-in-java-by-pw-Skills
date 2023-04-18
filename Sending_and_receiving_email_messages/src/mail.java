import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.Folder;
import javax.mail.Store;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;

public class ConsoleEmailClient {

    private String username;
    private String password;
    private Properties properties;
    private Session session;
    private Store store;
    private Folder inbox;
    private Message[] messages;

    public ConsoleEmailClient(String username, String password) {
        this.username = username;
        this.password = password;

        // Set up properties for the mail session
        properties = new Properties();
        properties.put("mail.smtp.host", "vinaykumar.it2021@dscet.ac.in");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // Create a mail session with the specified properties
        session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
    }

    public void sendEmail(String recipient, String subject, String body) throws MessagingException {
        // Create a new email message
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(username));
        message.setRecipients(RecipientType.TO, InternetAddress.parse(recipient));
        message.setSubject(subject);
        message.setText(body);

        // Send the email message
        Transport.send(message);
        System.out.println("Message sent successfully.");
    }

    public void checkEmail() throws MessagingException {
        // Connect to the email server
        store = session.getStore("imaps");
        store.connect("imap.gmail.com", username, password);

        // Open the inbox folder and retrieve the email messages
        inbox = store.getFolder("inbox");
        inbox.open(Folder.READ_ONLY);
        messages = inbox.getMessages();

        // Print the subject and sender of each email message
        for (Message message : messages) {
            System.out.println("Subject: " + message.getSubject());
            System.out.println("From: " + message.getFrom()[0]);
        }
    }

    public static void main(String[] args) {
        // Create a new email client instance
        ConsoleEmailClient client = new ConsoleEmailClient("your_email_address@gmail.com", "your_email_password");

        try {
            // Send an email message
            client.sendEmail("recipient_email_address@gmail.com", "Test Subject", "Test Body");

            // Check for new email messages
            client.checkEmail();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
