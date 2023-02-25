import java.util.Arrays;
import java.util.Scanner;

public class Phone implements PhoneInterface {
    private String brand;
    private String name;
    private String password;
    private Contact[] contacts;

    public Phone(String brand, String name, String password, Contact[] contacts) {
        this.brand = brand;
        this.name = name;
        this.password = password;
        this.contacts = contacts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public String turnOn(String password) {
        if (getPassword().equals(password)) {
            return "Phone on";
        }
        return "Invalid password";
    }

    public void call(long number) {
        for (Contact phoneNumber : contacts) {
            if (phoneNumber.getPhoneNumber() == number) {
                System.out.println("     Calling...\n" + phoneNumber.getFullName() + "\n" + phoneNumber.getPhoneNumber() + "\n");
            }
        }

    }

    public void call(String fullName) {
        for (Contact name : contacts) {
            if (name.getFullName().toUpperCase().equals(fullName)) {
                System.out.println("    Calling...\n" + name.getFullName() + "\n" + name.getPhoneNumber() + "\n");
            }
        }
    }

    public String searchContact(String fullName) {
        for (Contact fullNameSearch : contacts) {
            if (fullNameSearch.getFullName().toUpperCase().equals(fullName)) {
                return fullNameSearch.toString();
            }
        }
        return "\n";
    }

    public void contactUpdate(String contact) {
        for (Contact contact1 : contacts) {
            if (contact1.getFullName().toUpperCase().equals(contact)) {
                System.out.println(contact1.toString());
                System.out.println("\nEnter new name");
                String a = new Scanner(System.in).nextLine();
                contact1.setFullName(a);
                System.out.println(contact1.toString());

            }
        }
    }

    @Override
    public String toString() {
        return "Phone: " +
                "\nbrand: " + brand +
                "\nName: " + name +
                "\nPassword: " + password +
                "\nContacts: " + Arrays.toString(contacts);
    }


}