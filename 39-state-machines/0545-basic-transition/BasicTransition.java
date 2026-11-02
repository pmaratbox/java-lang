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
  fsm.fire("coin");

  IO.println(fsm.getCurrentState().toString().toLowerCase());
}
