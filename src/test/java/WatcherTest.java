import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class WatcherTest {
    @Before
    public void setUp() throws Exception {
        Map<String,String> example = new HashMap<String,String>();
        example.put( "K1", new String( "V1" ));
        try {
            SetEnviromentVariable.setEnv(example);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void name() {
        System.out.println(System.getenv("K1"));
    }
}