import de.hfu.Util;
import org.junit.Test;
import static org.junit.Assert.*;

public class UtilTest {

    @Test
    public void testistErsteHalbjahr() {
        boolean test = Util.istErstesHalbjahr(7);
        assertTrue(test);

    }
}
