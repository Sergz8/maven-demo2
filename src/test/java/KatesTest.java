import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class KatesTest {

    @Test
    public void testName() throws Exception {
        assertEquals("Мяу!", Kates.voice());
    }

    @Test
    public void testStringPerformance() throws Exception {
        String s = " ";
        for (int i =0; i < 1000; i++) {
            s+=i;
        }

    }

    @Test
    public void testStringBuilderPerformance() throws Exception {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            s.append(i);
        }
    }

    @Test
    public void testDemoSimpleAsserts(){
        assertEquals("Деление чисел", 4, 8/2);
        assertEquals("Деление чисел- повышенная точность",4, (7.49+0.51)/2, 0.0000001);
    }

    @Test
    public void testDemo2SimpleAsserts(){
        boolean b1=(4155>3999);
        assertTrue(b1);
        assertFalse(4001<3999);
    }


}
