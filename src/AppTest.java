import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    @Test
    public void testGutterGame() throws Exception {
        Game g = new Game();
        for (int i = 0; i < 20; i++) {
            g.roll(0);
        }

        assertEquals(0, g.score());
    }

    @Test
    public void testAllOnes() throws Exception {
        Game g = new Game();
        for (int i = 0; i < 20; i++)
            g.roll(1);
        assertEquals(20, g.score());
    }

}
