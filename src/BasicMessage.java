class BasicMessage implements Message {
    private String text;

    public BasicMessage(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}