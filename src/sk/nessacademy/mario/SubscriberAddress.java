package sk.nessacademy.mario;

public class SubscriberAddress {
    private String streetName;
    private int streetNumber;
    private String city;
    private String country;
    private int zipCode;

    public SubscriberAddress(String streetName, int streetNumber, String city, String country, int zipCode) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getCity() {
        return city;
    }

    public int getZipCode() {
        return zipCode;
    }
}
