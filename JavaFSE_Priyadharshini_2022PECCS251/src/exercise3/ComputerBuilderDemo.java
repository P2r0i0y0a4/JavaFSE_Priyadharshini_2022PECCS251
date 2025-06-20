package exercise3;

public class ComputerBuilderDemo {
    public static void main(String[] args) {
        System.out.println("Demonstrating Builder Pattern for Computer configuration:\n");

        // Build a basic computer
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB DDR4", "256GB SSD")
                .build();
        System.out.println("Basic Computer:\n" + basicComputer);

        System.out.println("----------------------------------------\n");

        // Build a gaming computer with optional parts
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB DDR4", "1TB NVMe SSD")
                .withGraphicsCard("NVIDIA RTX 4080")
                .withOperatingSystem("Windows 11 Pro")
                .withMonitor("27-inch 4K Gaming Monitor")
                .withKeyboard("Mechanical Gaming Keyboard")
                .withMouse("RGB Gaming Mouse")
                .build();
        System.out.println("Gaming Computer:\n" + gamingComputer);

        System.out.println("----------------------------------------\n");

        // Build an office computer with specific optional parts
        Computer officeComputer = new Computer.Builder("AMD Ryzen 7", "16GB DDR4", "512GB SSD")
                .withOperatingSystem("Ubuntu Linux")
                .withMonitor("24-inch IPS Monitor")
                .build();
        System.out.println("Office Computer:\n" + officeComputer);

        System.out.println("----------------------------------------\n");

        // Example of building a computer with only required parts and one optional
        Computer customComputer = new Computer.Builder("Intel i7", "16GB DDR4", "1TB HDD")
                .withGraphicsCard("NVIDIA GTX 1660 Super")
                .build();
        System.out.println("Custom Computer:\n" + customComputer);
    }
}