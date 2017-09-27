import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class HikerTest {

    @Test
    public void life_the_universe_and_everything() {
        HikerHelper helper = mock(HikerHelper.class);
        Hiker douglas = new Hiker(helper);
        when(helper.multiplier()).thenReturn(9);
        assertEquals(42, douglas.answer());
    }
}
