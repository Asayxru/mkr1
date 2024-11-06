class EncryptedMessage implements Message {
    private final Message message;

    public EncryptedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getText() {
        return new StringBuilder(message.getText()).reverse().toString();
    }
}