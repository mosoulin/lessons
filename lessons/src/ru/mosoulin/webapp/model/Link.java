package ru.mosoulin.webapp.model;

/**
 * Created by Admin on 12.07.16.
 */
public class Link {
    private String name;
    private String url;

    public Link(String name, String url) {
        this.name = name;
        this.url = url;

    }

    public Link(Link link) { // конструктор копирования, вместо clone
        this.name = link.name;
        this.url = link.url;
    }
}
