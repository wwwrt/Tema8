package Pb2;

public class EmailMessage implements Message {
    private String sender;
    private String recipient;
    private String content;

    public EmailMessage(String sender, String recipient, String content) {
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
    }

    @Override
    public String getSender() {
        return sender;
    }

    @Override
    public String getRecipient() {
        return recipient;
    }

    @Override
    public String getContent() {
        return content;
    }
}


