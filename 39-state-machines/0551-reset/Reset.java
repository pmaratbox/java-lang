//DEPS org.squirrelframework:squirrel-foundation:0.3.10
import org.squirrelframework.foundation.fsm.*;
import org.squirrelframework.foundation.fsm.impl.AbstractUntypedStateMachine;

public class Reset {
  public static class Process extends AbstractUntypedStateMachine {}

  public static void main(String[] args) {
    UntypedStateMachineBuilder b = StateMachineBuilderFactory.create(Process.class);
    b.externalTransition().from("idle").to("running").on("start");
    b.externalTransition().from("running").to("idle").on("reset");

    UntypedStateMachine fsm = b.newUntypedStateMachine("idle");
    fsm.start();
    fsm.fire("start");
    fsm.fire("reset");
    System.out.println(fsm.getCurrentState().toString().toLowerCase());
  }
}
