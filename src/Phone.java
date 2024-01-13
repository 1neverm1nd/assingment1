public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone() {
        this.number = "";
        this.model = "";
        this.weight = 0.0;
    }

    public void receiveCall(String callerName) {

        System.out.println("vam zvonit " + callerName );
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println(callerName + " zvonit s " + callerNumber);
    }

    public String getNumber() {

        return number;
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.println("otpravka sms : ");
        for (String num : phoneNumbers) {
            System.out.println(num);
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}