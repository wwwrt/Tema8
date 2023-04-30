package Pb2;

public class EmailTransmitter implements Transmitter {
    @Override
    public void sendMessage(Message message) {
       
        System.out.println("Email sent to " + message.getRecipient() + " from " + message.getSender() + " with content: " + message.getContent());
    }
}