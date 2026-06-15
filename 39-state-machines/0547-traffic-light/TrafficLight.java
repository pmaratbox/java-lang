//DEPS org.squirrelframework:squirrel-foundation:0.3.10
import org.squirrelframework.foundation.fsm.*;
import org.squirrelframework.foundation.fsm.impl.AbstractUntypedStateMachine;

public class TrafficLight {
  public static class Traffic extends AbstractUntypedStateMachine {}

  public static void main(String[] a) {
    UntypedStateMachineBuilder b = StateMachineBuilderFactory.create(Traffic.class);
    b.externalTransition().from("red").to("green").on("next");
    b.externalTransition().from("green").to("yellow").on("next");
    b.externalTransition().from("yellow").to("red").on("next");

    UntypedStateMachine fsm = b.newUntypedStateMachine("red");
    fsm.start();
    fsm.fire("next"); // red -> green
    fsm.fire("next"); // green -> yellow
    System.out.println(fsm.getCurrentState().toString().toLowerCase());
  }
}
