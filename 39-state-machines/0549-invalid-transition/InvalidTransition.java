//JAVA 26
//DEPS org.squirrelframework:squirrel-foundation:0.3.10
import org.squirrelframework.foundation.fsm.*;
import org.squirrelframework.foundation.fsm.impl.AbstractUntypedStateMachine;

public static class Turnstile extends AbstractUntypedStateMachine {}

void main() {
  var b = StateMachineBuilderFactory.create(Turnstile.class);
  b.externalTransition().from("locked").to("unlocked").on("coin");
  b.externalTransition().from("unlocked").to("locked").on("push");

  var fsm = b.newUntypedStateMachine("locked");
  fsm.start();

  // 'push' has NO transition from 'locked'; the machine rejects it and
  // stays in 'locked' rather than crashing.
  fsm.fire("push");

  System.out.println(fsm.getCurrentState().toString().toLowerCase());
}
