import junit.framework.TestCase;
import org.example.Main;

public class ProcessLineTest extends TestCase {
    public void testProcessLine() {
        String actual = Main.processLine("as1f h3a");
        String expected = "LOGah_fsa";
        assertEquals(expected, actual);
    }
}
