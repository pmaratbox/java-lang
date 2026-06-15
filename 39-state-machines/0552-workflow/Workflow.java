//DEPS org.squirrelframework:squirrel-foundation:0.3.10
import org.squirrelframework.foundation.fsm.*;
import org.squirrelframework.foundation.fsm.impl.AbstractUntypedStateMachine;

public class Workflow {
  public static class WorkflowFsm extends AbstractUntypedStateMachine {}

  public static void main(String[] a) {
    UntypedStateMachineBuilder b = StateMachineBuilderFactory.create(WorkflowFsm.class);
    b.externalTransition().from("idle").to("pending").on("submit");
    b.externalTransition().from("pending").to("approved").on("approve");

    UntypedStateMachine fsm = b.newUntypedStateMachine("idle");
    fsm.start();
    fsm.fire("submit");
    fsm.fire("approve");
    System.out.println(fsm.getCurrentState().toString().toLowerCase());
  }
}
