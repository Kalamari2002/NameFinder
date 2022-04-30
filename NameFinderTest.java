import static org.junit.Assert.*;
import org.junit.*;

public class NameFinderTest {
    String[] names = new String[]{"Jose", "Mateus", "Luiza"};
    NameFinder finder;

    @Before
    public void setUp() throws Exception{
        finder = new NameFinder();
    }

    @Test
    public void findJoao(){
        assertTrue(finder.FindNames(names, "Joao"));
    }
}
