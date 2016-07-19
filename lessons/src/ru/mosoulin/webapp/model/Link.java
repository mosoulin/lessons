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

    /*@Override
    public boolean equals(Object obj) {
        return super.equals(obj); // super - ссылка на родителя
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Link link = (Link) o;

        if (name != null ? !name.equals(link.name) : link.name != null) return false;
        return url.equals(link.url);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + url.hashCode();
        return result;
    }
}
