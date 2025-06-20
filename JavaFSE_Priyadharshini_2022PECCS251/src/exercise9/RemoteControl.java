package exercise9;

//Invoker: Holds a command and, at some point, asks the command to carry out a request.
public class RemoteControl {
 private Command command;

 // Set the command for a particular slot/button
 public void setCommand(Command command) {
     this.command = command;
 }

 // Execute the command (e.g., button pressed)
 public void pressButton() {
     if (command != null) {
         System.out.println("RemoteControl: Button pressed. Executing command...");
         command.execute(); // Calls the execute method on the stored command
     } else {
         System.out.println("RemoteControl: No command set for this button.");
     }
 }
}