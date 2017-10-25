package se.thinkcode.app;

import org.junit.Test;
import se.thinkcode.api.Mirror;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MainTest {

    @Test
    public void main_should_use_mirror() {
        Mirror mirror = mock(Mirror.class);
        Main main = new Main(mirror);

        main.reflect("beam");

        verify(mirror).reflect("beam");
    }
}
