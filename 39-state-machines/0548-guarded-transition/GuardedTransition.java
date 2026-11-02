//JAVA 26
//DEPS org.squirrelframework:squirrel-foundation:0.3.10
import org.squirrelframework.foundation.fsm.*;
import org.squirrelframework.foundation.fsm.impl.AbstractUntypedStateMachine;

public static class Door extends AbstractUntypedStateMachine {}

void main() {
  var b = StateMachineBuilderFactory.create(Door.class);
  // The `open` event is ONLY valid from `unlocked`: it is defined as a
  // transition out of `unlocked` and nowhere else, so the door can be
  // opened only after it has been unlocked.
  b.externalTransition().from("locked").to("unlocked").on("unlock");
  b.externalTransition().from("unlocked").to("open").on("open");

  var fsm = b.newUntypedStateMachine("locked");
  fsm.start();
  fsm.fire("unlock");
  fsm.fire("open");

  IO.println(fsm.getCurrentState().toString().toLowerCase());
}
