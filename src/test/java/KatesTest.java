import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KatesTest {

    @Test
    public void testName() throws Exception {
        assertEquals("Мяу!", Kates.voice());
    }
}
