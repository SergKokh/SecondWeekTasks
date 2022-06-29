package MethodsKlassObject.HashCode;

import MethodsKlassObject.HashCode.Contact;

public class TestContact {
    public static void main(String[] args) {
        Contact contact1 = new Contact(25, "Petr", "0991112233");
        Contact contact2 = new Contact(25, "Petr", "0991112233");

        System.out.println(contact1.hashCode());
        System.out.println(contact2.hashCode());
        System.out.println(contact1.equals(contact2));

    }
}
