package port.adapter;

public class EmailSender implements Sender{
    @Override
    public void send(String message) {
        System.out.println(message + "via : email");
    }
}
