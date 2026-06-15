//DEPS org.squirrelframework:squirrel-foundation:0.3.10
import org.squirrelframework.foundation.fsm.*;
import org.squirrelframework.foundation.fsm.impl.AbstractUntypedStateMachine;

public class GuardedTransition {
  public static class Door extends AbstractUntypedStateMachine {}

  public static void main(String[] args) {
    UntypedStateMachineBuilder b = StateMachineBuilderFactory.create(Door.class);
    // The `open` event is ONLY valid from `unlocked`: it is defined as a
    // transition out of `unlocked` and nowhere else, so the door can be
    // opened only after it has been unlocked.
    b.externalTransition().from("locked").to("unlocked").on("unlock");
    b.externalTransition().from("unlocked").to("open").on("open");

    UntypedStateMachine fsm = b.newUntypedStateMachine("locked");
    fsm.start();
    fsm.fire("unlock");
    fsm.fire("open");

    System.out.println(fsm.getCurrentState().toString().toLowerCase());
  }
}
