

public class Main {
    public static void main(String[] args) {
        // Код создания объектов Phone, Person, Reader, Animal и вызов методов
        Phone phone1 = new Phone("123456789", "iPhone 12", 0.5);
        Phone phone2 = new Phone("987654321", "Samsung Galaxy", 0.7);
        Phone phone3 = new Phone("111222333", "Google Pixel", 0.4);

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

        {
            Matrix matrix1 = new Matrix(2, 2);
            matrix1.setElement(0, 0, 1);
            matrix1.setElement(0, 1, 2);
            matrix1.setElement(1, 0, 3);
            matrix1.setElement(1, 1, 4);

            Matrix matrix2 = new Matrix(2, 2);
            matrix2.setElement(0, 0, 5);
            matrix2.setElement(0, 1, 6);
            matrix2.setElement(1, 0, 7);
            matrix2.setElement(1, 1, 8);


            System.out.println("matrix 1:");
            matrix1.printMatrix();

            System.out.println("matrix 2:");
            matrix2.printMatrix();


            Matrix sum = matrix1.add(matrix2);
            if (sum != null) {
                System.out.println("summm of matrices:");
                sum.printMatrix();
            }


            Matrix multipliedByNumber = matrix1.multiply(2);
            System.out.println("matrix 1 multiplied by 2:");
            multipliedByNumber.printMatrix();


            Matrix multipliedMatrix = matrix1.multiply(matrix2);
            if (multipliedMatrix != null) {
                System.out.println("matrix 1 multiplied by Matrix 2:");
                multipliedMatrix.printMatrix();
            }
        }


    }

}



