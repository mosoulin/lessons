package ru.mosoulin.webapp.model;

/**
 * Created by Admin on 19.07.16.
 */
public class Contact {
    private final ContactType type;
    private final String value;

    public Contact(ContactType type, String value) {
        this.type = type;
        this.value = value;
    }

    public ContactType getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}
