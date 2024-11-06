

class AuthorStampedMessage implements Message {
    private final Message message;

    public AuthorStampedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getText() {
        return message.getText() + " - author @Шевчук Арсеній";
    }
}