import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class HikerTest {

    @Test
    void life_the_universe_and_everything() {
        HikerHelper helper = mock(HikerHelper.class);
        Hiker douglas = new Hiker(helper);
        when(helper.multiplier()).thenReturn(9);
        assertEquals(42, douglas.answer());
    }
}
