// The test half of the workload the AOT caches are recorded from. It mocks a
// collaborator and verifies a call on it, which is what pulls Mockito's mock
// maker and byte-buddy into the cache alongside JUnit's own classes.
//
// It passes, because a JVM writes a cache when it exits of its own accord and a
// green run is the simplest way to be sure of that.
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

class GreeterTest {

    @Test
    void tells_its_listener_what_it_said() {
        Greeter.Listener listener = mock(Greeter.Listener.class);
        new Greeter(listener).greet();
        verify(listener).heard("hello");
        verifyNoMoreInteractions(listener);
    }
}
