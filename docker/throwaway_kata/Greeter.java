// Part of the workload the AOT caches are recorded from. It has to exist before
// any learner's kata does, so what the caches hold are the compiler's classes
// and Mockito's rather than any kata's, and they speed up whatever a learner
// writes. It is shaped like a real kata all the same, a class calling a
// collaborator it is given, so that the same code paths are the ones that run.
public class Greeter {

    public interface Listener {
        void heard(String greeting);
    }

    public Greeter(Listener listener) {
        this.listener = listener;
    }

    public void greet() {
        listener.heard("hello");
    }

    private final Listener listener;
}
