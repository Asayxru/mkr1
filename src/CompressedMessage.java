class CompressedMessage implements Message {
    private Message message;

    public CompressedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getText() {
        return message.getText().replaceAll("\\s+", " ").trim();
    }
}