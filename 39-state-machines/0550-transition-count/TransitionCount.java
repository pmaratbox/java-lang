//DEPS org.squirrelframework:squirrel-foundation:0.3.10
import org.squirrelframework.foundation.fsm.*;
import org.squirrelframework.foundation.fsm.impl.AbstractUntypedStateMachine;

public class TransitionCount {
  public static class Counter extends AbstractUntypedStateMachine {
    int count = 0;

    // Per-transition action: squirrel invokes this on EACH matching
    // transition with (from, to, event, context). It increments the counter.
    public void onStep(Object from, Object to, Object event, Object context) {
      count++;
    }
  }

  public static void main(String[] args) {
    UntypedStateMachineBuilder b = StateMachineBuilderFactory.create(Counter.class);
    b.externalTransition().from("a").to("b").on("go").callMethod("onStep");
    b.externalTransition().from("b").to("c").on("go").callMethod("onStep");
    b.externalTransition().from("c").to("d").on("go").callMethod("onStep");

    Counter fsm = (Counter) b.newUntypedStateMachine("a");
    fsm.start();
    fsm.fire("go");
    fsm.fire("go");
    fsm.fire("go");

    // The count comes from the per-transition action, not a literal.
    System.out.println(fsm.count);
  }
}
