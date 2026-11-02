//JAVA 26
//DEPS org.squirrelframework:squirrel-foundation:0.3.10
import org.squirrelframework.foundation.fsm.*;
import org.squirrelframework.foundation.fsm.impl.AbstractUntypedStateMachine;

public static class WorkflowFsm extends AbstractUntypedStateMachine {}

void main() {
  var b = StateMachineBuilderFactory.create(WorkflowFsm.class);
  b.externalTransition().from("idle").to("pending").on("submit");
  b.externalTransition().from("pending").to("approved").on("approve");

  var fsm = b.newUntypedStateMachine("idle");
  fsm.start();
  fsm.fire("submit");
  fsm.fire("approve");
  System.out.println(fsm.getCurrentState().toString().toLowerCase());
}
