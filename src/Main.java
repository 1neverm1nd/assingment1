

public class Main {
    public static void main(String[] args) {
        // Код создания объектов Phone, Person, Reader, Animal и вызов методов

        Phone phone1 = new Phone("123456789", "iPhone 12", 0.5);
        Phone phone2 = new Phone("987654321", "Samsung Galaxy", 0.7);
        Phone phone3 = new Phone("111222333", "Google Pixel" , 0.4);

        phone1.receiveCall("Kamila", "00091911");
        phone2.receiveCall("Bro", "999888777");

        System.out.println("Phone 1 number: " + phone1.getNumber());
        phone2.sendMessage(phone1.getNumber(), phone3.getNumber());

        // Person class usage
        Person person1 = new Person("Alice Smith", 30);
        Person person2 = new Person();

        person1.move();
        person2.talk();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Meet", "Yard", "Labrador");
        animals[1] = new Cat("Fish", "House", true);
        animals[2] = new Horse("Samsa S Syrom", "AITU", "kaifovyi");

        Veterinary vet = new Veterinary();

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }

        int A = 5;
        int B = 20;
        System.out.print("Your recursive numbers: ");
        RecursiveNumbers.printNumbers(5, 10);

        Car car = new Car();
        car.start();
        car.stop();
    }
}


