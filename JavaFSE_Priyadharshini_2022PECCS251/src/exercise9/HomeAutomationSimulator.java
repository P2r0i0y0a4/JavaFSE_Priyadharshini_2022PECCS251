package exercise9;

public class HomeAutomationSimulator {
    public static void main(String[] args) {
        System.out.println("Demonstrating Command Pattern for Home Automation:\n");

        // 1. Create Receiver objects (the actual devices)
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

        // 2. Create Concrete Command objects, linking them to their respective Receivers
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);

        // 3. Create Invoker object (the remote control)
        RemoteControl remote = new RemoteControl();

        // 4. Load commands into the remote control slots/buttons
        System.out.println("--- Setting up Living Room Light commands ---");
        remote.setCommand(livingRoomLightOn);
        remote.pressButton(); // Turn on living room light

        remote.setCommand(livingRoomLightOff);
        remote.pressButton(); // Turn off living room light
        System.out.println("\n");

        System.out.println("--- Setting up Kitchen Light commands ---");
        remote.setCommand(kitchenLightOn);
        remote.pressButton(); // Turn on kitchen light

        remote.setCommand(kitchenLightOff);
        remote.pressButton(); // Turn off kitchen light
        System.out.println("\n");

        // You can also change commands dynamically
        System.out.println("--- Reassigning Living Room Light button to turn on Kitchen Light ---");
        remote.setCommand(kitchenLightOn); // Now, pressing the button turns on kitchen light
        remote.pressButton();
        System.out.println("\n");

        // Demonstrating an empty command slot
        System.out.println("--- Empty Command Slot ---");
        RemoteControl emptyRemote = new RemoteControl();
        emptyRemote.pressButton();
    }
}
