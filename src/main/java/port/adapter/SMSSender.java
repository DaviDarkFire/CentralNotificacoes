package port.adapter;

public class SMSSender implements Sender{
    @Override
    public void send(String message) {
        System.out.println(message + " via : sms");
    }
}
