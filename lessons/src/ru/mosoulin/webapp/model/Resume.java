package ru.mosoulin.webapp.model;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Admin on 12.07.16.
 */
public class Resume {
    private String uuid;
    private String fullName;
    private String location;
    private String homePage;
    private List<Contact> contacts=new LinkedList<>();
    private List<Section> sections= new LinkedList<>();

    public Resume(String fullName, String location) {
        this(UUID.randomUUID().toString(),fullName,location);

    }

    public Resume(String uuid, String fullName, String location) {
        this.uuid = uuid;
        this.fullName = fullName;
        this.location = location;
    }

    public void addSection(Section section) {
        sections.add(section);
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public String getUuid() {
        return uuid;
    }

    public String getHomePage() {
        return homePage;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public List<Section> getSections() {
        return sections;
    }

    public String getLocation() {
        return location;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Resume resume = (Resume) o;

        return uuid.equals(resume.uuid);

    }

    public Resume(String uuid) {

    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }
}
