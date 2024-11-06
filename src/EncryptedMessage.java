class EncryptedMessage implements Message {
    private Message message;

    public EncryptedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getText() {
        return new StringBuilder(message.getText()).reverse().toString();
    }
}