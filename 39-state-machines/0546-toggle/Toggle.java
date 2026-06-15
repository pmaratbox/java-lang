//DEPS org.squirrelframework:squirrel-foundation:0.3.10
import org.squirrelframework.foundation.fsm.*;
import org.squirrelframework.foundation.fsm.impl.AbstractUntypedStateMachine;

public class Toggle {
  public static class ToggleFsm extends AbstractUntypedStateMachine {}

  public static void main(String[] a) {
    UntypedStateMachineBuilder b = StateMachineBuilderFactory.create(ToggleFsm.class);
    // A single "toggle" event flips between the two states.
    b.externalTransition().from("off").to("on").on("toggle");
    b.externalTransition().from("on").to("off").on("toggle");

    UntypedStateMachine fsm = b.newUntypedStateMachine("off");
    fsm.start();

    // Fire a fixed sequence: off -> on -> off -> on
    fsm.fire("toggle");
    fsm.fire("toggle");
    fsm.fire("toggle");

    System.out.println(fsm.getCurrentState().toString().toLowerCase());
  }
}
