package Pb2;

import java.util.ArrayList;
import java.util.List;

public class PostTransmitter implements Transmitter {
    private List<Message> buffer;
    private int bufferSize;

    public PostTransmitter(int bufferSize) {
        this.buffer = new ArrayList<>();
        this.bufferSize = bufferSize;
    }

    @Override
    public void sendMessage(Message message) {
  
        buffer.add(message);

      
        if (buffer.size() == bufferSize) {
            for (Message msg : buffer) {
          
                System.out.println("Post message sent to " + msg.getRecipient() + " from " + msg.getSender() + " with content: " + msg.getContent());
            }

            buffer.clear();
        }
    }
}