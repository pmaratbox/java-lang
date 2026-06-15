//DEPS org.squirrelframework:squirrel-foundation:0.3.10
import org.squirrelframework.foundation.fsm.*;
import org.squirrelframework.foundation.fsm.impl.AbstractUntypedStateMachine;

public class BasicTransition {
  public static class Turnstile extends AbstractUntypedStateMachine {}

  public static void main(String[] args) {
    UntypedStateMachineBuilder b = StateMachineBuilderFactory.create(Turnstile.class);
    b.externalTransition().from("locked").to("unlocked").on("coin");
    b.externalTransition().from("unlocked").to("locked").on("push");

    UntypedStateMachine fsm = b.newUntypedStateMachine("locked");
    fsm.start();
    fsm.fire("coin");

    System.out.println(fsm.getCurrentState().toString().toLowerCase());
  }
}
