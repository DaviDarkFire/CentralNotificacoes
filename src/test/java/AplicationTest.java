import org.junit.Before;
import org.junit.Test;
import port.adapter.EmailSender;
import port.adapter.SMSSender;
import port.adapter.WhatsAppSender;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class AplicationTest {
    @Before
    public void setUp() {
        Map<String,String> example = new HashMap<String,String>();
        example.put( "TESTE", new String( "WHATS" ));
        try {
            SetEnviromentVariable.setEnv(example);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void deveEnviarTextoUsandoSMS() {
        if(Watcher.watch("TESTE").equals("SMS")) {
            SMSSender smsSender = new SMSSender();
            Aplication aplication = new Aplication(smsSender);
            aplication.app("TEXTO ALEATÓRIO");
        }
    }

    @Test
    public void deveEnviarTextoUsandoEMAIL() {
        if(Watcher.watch("TESTE").equals("EMAIL")) {
            EmailSender emailSender = new EmailSender();
            Aplication aplication = new Aplication(emailSender);
            aplication.app("TEXTO ALEATÓRIO");
        }
    }

    @Test
    public void deveEnviarTextoUsandoWHATS() {
        if(Watcher.watch("TESTE").equals("WHATS")) {
            WhatsAppSender whatsSender = new WhatsAppSender();
            Aplication aplication = new Aplication(whatsSender);
            aplication.app("TEXTO ALEATÓRIO");
        }
    }
}