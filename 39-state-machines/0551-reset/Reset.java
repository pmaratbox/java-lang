//JAVA 26
//DEPS org.squirrelframework:squirrel-foundation:0.3.10
import org.squirrelframework.foundation.fsm.*;
import org.squirrelframework.foundation.fsm.impl.AbstractUntypedStateMachine;

public static class Process extends AbstractUntypedStateMachine {}

void main() {
  var b = StateMachineBuilderFactory.create(Process.class);
  b.externalTransition().from("idle").to("running").on("start");
  b.externalTransition().from("running").to("idle").on("reset");

  var fsm = b.newUntypedStateMachine("idle");
  fsm.start();
  fsm.fire("start");
  fsm.fire("reset");
  IO.println(fsm.getCurrentState().toString().toLowerCase());
}
