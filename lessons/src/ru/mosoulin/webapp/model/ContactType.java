package ru.mosoulin.webapp.model;

/**
 * Created by Admin on 19.07.16.
 */
public enum ContactType {
    PHONE("Тел."),
    MOBILE("Мобильный тел."),
    HOME_PHONE("Домашний тел."),
    SKYPE("Skype"),
    MAIL("Почта"),
    ICQ("ICQ"),;

    private String title;

    ContactType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
