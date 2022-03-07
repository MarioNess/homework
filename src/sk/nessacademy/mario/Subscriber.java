package sk.nessacademy.mario;

public class Subscriber {
    private String fistName;
    private String lastName;
    private SubscriberAddress adress;
    private String email;
    private int age;

    public Subscriber(String fistName, String lastName, SubscriberAddress adress, String email, int age) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.adress = adress;
        this.email = email;
        this.age = age;
    }
}
