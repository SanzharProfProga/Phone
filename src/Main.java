import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** 2 класс тузунуз
         * Contact(phoneNumber, fullName)
         * Phone(brand, name, password, Contacts[] contacts)
         * PhoneInterface деген interface тузунуз, turnOn(); телефонду жандырат, пароль сурайт анан ошол пароль туура болсо "Телефон жанды" деп кайтарат метод.
         * call(); деген 2 метод бар бироосу параметрине телефон номер сурайт анан издейт эгер тапса номер менен ошол номерди жана ошол номер кандай атта сакталган болсо ошол аты менен чалып жатасыз деп кайтарып берет
         * call(); дагы бир методу атын жазасыз эгер ошол ат менен сакталган контакт табылса ошол контакттын атын жана ошол номерди кайтарып ушуга чалып жатасыз деп кайтарып берет
         * searchContact(); деген методдун жардамы менен контакттарды издейсиз параметрине бир контактын аты жазылат, ошол ат менен контакт табылса ошол контакты(Contact) кайтарып берет
         * Contact updateName(); бул методдун жардамы менен контакттын атын озгортсо болот, параметрине 2 соз алат ( эскиАты, жаныАты)
         * getAllContacts(); бул метод бир телефондун ичиндеги контактардын баарын алып берет
         * main - ден класстардын объееттерин тузуп программанызды иштетиниз*/

        Contact contact = new Contact(996700102030L, "Elon Musk");
        Contact contact1 = new Contact(996700102040L, "Mark Zuckerberg");
        Contact contact2 = new Contact(996700102050L, "Jeff Bezos");
        Contact contact3 = new Contact(996700102060L, "Hans Zimmer");
        Contact contact4 = new Contact(996700102070L, "Sanzhar Abdymomunov");
        Contact[] contacts = {contact, contact1, contact2, contact3, contact4};
        Phone phone = new Phone("Apple", "iPhone 14", "asd", contacts);


        boolean isTrue = true;
        while (isTrue) {
            System.out.println("""
                    1: Start system
                    2: Stop system""");
            int selectMode = new Scanner(System.in).nextInt();
            switch (selectMode) {
                case 1 -> {
                    System.out.println("Enter password");
                    System.out.println(phone.turnOn(new Scanner(System.in).nextLine()));
                    boolean isTrue1 = true;
                    while (isTrue1) {
                        System.out.println("""
                                1: Search name contact and call 
                                2: Search number and call
                                3: Search name
                                4: Update contact
                                5: End program
                                """);
                        int selectMode1 = new Scanner(System.in).nextInt();
                        switch (selectMode1) {
                            case 1 -> {
                                System.out.println("Enter name contact");
                                phone.call(new Scanner(System.in).nextLine().toUpperCase());

                            }
                            case 2 -> {
                                System.out.println("Enter number contact");
                                phone.call(new Scanner(System.in).nextLong());

                            }
                            case 3 -> {
                                System.out.println("Enter name");
                                System.out.println(phone.searchContact(new Scanner(System.in).nextLine().toUpperCase()));

                            }
                            case 4 -> {
                                System.out.println("Enter name");
                                phone.contactUpdate(new Scanner(System.in).nextLine().toUpperCase());
                            }
                            case 5 -> {
                                isTrue1 = false;
                            }

                        }

                    }
                }
                case 2 -> {
                    isTrue = false;
                }
            }
        }
    }
}