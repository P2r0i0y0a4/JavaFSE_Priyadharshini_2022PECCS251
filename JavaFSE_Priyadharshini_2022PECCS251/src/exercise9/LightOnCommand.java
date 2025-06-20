package exercise9;

//Concrete Command: Implements the Command interface and binds a Receiver object
//to an action. It encapsulates the action and the receiver.
public class LightOnCommand implements Command {
 private Light light; // Reference to the Receiver

 public LightOnCommand(Light light) {
     this.light = light;
 }

 @Override
 public void execute() {
     light.turnOn(); // Delegates the call to the Receiver's specific method
 }
}