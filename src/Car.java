
public class Car {
    private String carBrand;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    // Геттеры и сеттеры, если нужно

    public Car() {
        this.engine = new Engine(); // Инициализация объекта Engine при создании Car
    }

    public void start() {
        if (engine != null) {
            engine.start();
            System.out.println("Car started");
        } else {
            System.out.println("Engine is not available");
        }
    }

    public void stop() {
        if (engine != null) {
            engine.stop();
            System.out.println("Car stopped");
        } else {
            System.out.println("Engine is not available");
        }
    }

    public static class Engine {
        private int power;
        private String manufacturer;

        public void start() {
            System.out.println("Engine started");
        }

        public void stop() {
            System.out.println("Engine stopped");
        }
    }

    public static class Driver {
        private String fullName;
        private int drivingExperience;

        public void drive() {
            System.out.println("Driver is driving");
        }
    }
}
