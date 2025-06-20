package exercise9;
//Concrete Command: Implements the Command interface for turning off the light.
public class LightOffCommand implements Command {
 private Light light; // Reference to the Receiver

 public LightOffCommand(Light light) {
     this.light = light;
 }

 @Override
 public void execute() {
     light.turnOff(); // Delegates the call to the Receiver's specific method
 }
}