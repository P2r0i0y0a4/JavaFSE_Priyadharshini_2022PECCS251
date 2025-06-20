package exercise3;

public class Computer {
    // Required attributes
    private String cpu;
    private String ram;
    private String storage;

    // Optional attributes
    private String graphicsCard;
    private String operatingSystem;
    private String monitor;
    private String keyboard;
    private String mouse;

    // Private constructor to be used only by the Builder
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
        this.monitor = builder.monitor;
        this.keyboard = builder.keyboard;
        this.mouse = builder.mouse;
    }

    // Getters for all attributes
    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getMonitor() {
        return monitor;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Computer Configuration:\n");
        sb.append("  CPU: ").append(cpu).append("\n");
        sb.append("  RAM: ").append(ram).append("\n");
        sb.append("  Storage: ").append(storage).append("\n");
        if (graphicsCard != null) {
            sb.append("  Graphics Card: ").append(graphicsCard).append("\n");
        }
        if (operatingSystem != null) {
            sb.append("  Operating System: ").append(operatingSystem).append("\n");
        }
        if (monitor != null) {
            sb.append("  Monitor: ").append(monitor).append("\n");
        }
        if (keyboard != null) {
            sb.append("  Keyboard: ").append(keyboard).append("\n");
        }
        if (mouse != null) {
            sb.append("  Mouse: ").append(mouse).append("\n");
        }
        return sb.toString();
    }

    // 2. Implement the Builder Class (static nested)
    public static class Builder {
        // Required attributes (should ideally be passed to constructor or marked as required)
        private String cpu;
        private String ram;
        private String storage;

        // Optional attributes (initialized to null or default values)
        private String graphicsCard;
        private String operatingSystem;
        private String monitor;
        private String keyboard;
        private String mouse;

        // Constructor for required attributes
        public Builder(String cpu, String ram, String storage) {
            this.cpu = cpu;
            this.ram = ram;
            this.storage = storage;
        }

        // Methods to set optional attributes (return Builder for chaining)
        public Builder withGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder withOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Builder withMonitor(String monitor) {
            this.monitor = monitor;
            return this;
        }

        public Builder withKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder withMouse(String mouse) {
            this.mouse = mouse;
            return this;
        }

        // Build method that returns an instance of Computer
        public Computer build() {
            return new Computer(this);
        }
    }
}