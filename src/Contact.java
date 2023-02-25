public class Contact {
    private long phoneNumber;
    private String fullName;

    public Contact(long phoneNumber, String fullName) {
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
    }

    public Contact() {
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    @Override
    public String toString() {
        return "Contact: " +
                "\nPhone number: " + phoneNumber +
                "\nFull name: " + fullName;
    }
}
