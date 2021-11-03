import port.adapter.Sender;

public class Aplication {
    private Sender sender;

    public Aplication(Sender sender) {
        this.sender = sender;
    }

    public void app(String message) {
        sender.send(message);
    }
}
