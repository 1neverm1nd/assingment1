
public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+77771238374", "iPhone 12", 0.5);
        Phone phone2 = new Phone("+77052234566", "Samsung Galaxy S30", 0.7);
        Phone phone3 = new Phone("+77761234567", "Google Pixel", 0.83);

        phone1.receiveCall("Daria", "+77012222222");
        phone2.receiveCall("Kamila", "+77011233245");

        System.out.println("Nomer poslednyego zvonivshego vam abonenta " + phone1.getNumber());
        phone2.sendMessage(phone1.getNumber(), phone3.getNumber());

        Person person1 = new Person("Kamila Mukhammedova", 17);
        Person person2 = new Person("Kamila Serikpaeva", 18);

        person1.move();
        person2.talk();

        Reader reader1 = new Reader("Ukassov Daniel", 12345, "Cybersecurity", "01-01-2006", phone1);
        Reader reader2 = new Reader("Daria Amangeldy", 54321, "Media Technology", "05-05-2005", phone2);


        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Meet", "Yard", "Labrador");
        animals[1] = new Cat("Fish", "House", true);
        animals[2] = new Horse("Samsa S Syrom", "AITU", "kaifovyi");

        Veterinary vet = new Veterinary();


        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }

        int A = 5;
        int B = 10;
        System.out.print (" your recursive numbers: ") ;
        RecursiveNumbers.printNumbers(5, 10);
    }
}

