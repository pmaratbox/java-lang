//JAVA 26
//DEPS org.squirrelframework:squirrel-foundation:0.3.10
import org.squirrelframework.foundation.fsm.*;
import org.squirrelframework.foundation.fsm.impl.AbstractUntypedStateMachine;

public static class ToggleFsm extends AbstractUntypedStateMachine {}

void main() {
  var b = StateMachineBuilderFactory.create(ToggleFsm.class);
  // A single "toggle" event flips between the two states.
  b.externalTransition().from("off").to("on").on("toggle");
  b.externalTransition().from("on").to("off").on("toggle");

  var fsm = b.newUntypedStateMachine("off");
  fsm.start();

  // Fire a fixed sequence: off -> on -> off -> on
  fsm.fire("toggle");
  fsm.fire("toggle");
  fsm.fire("toggle");

  IO.println(fsm.getCurrentState().toString().toLowerCase());
}
