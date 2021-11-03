package port.adapter;

public class WhatsAppSender implements Sender{
    @Override
    public void send(String message) {
        System.out.println(message + "via : WhatsApp");
    }
}
