import java.text.SimpleDateFormat;
import java.util.Date;

class DateStampedMessage implements Message {
    private final Message message;

    public DateStampedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getText() {
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        return message.getText() + " [" + date + "]";
    }
}