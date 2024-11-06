import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Message message = new BasicMessage("  Привіт,   як  справи?   ");
        System.out.println("Basic Message: " + message.getText());

        message = new EncryptedMessage(message);
        System.out.println("Encrypted: " + message.getText());

        message = new DateStampedMessage(message);
        System.out.println("Date and Time: " + message.getText());

        message = new AuthorStampedMessage(message);
        System.out.println("Author: " + message.getText());
    }
}