package ru.mosoulin.webapp.model;

/**
 * Created by Admin on 12.07.16.
 */
public class Link {
    public static Link EMPTY = new Link("",null); // статический член класса, создается при запуске Java машины
    private final String name;
    private final String url;

    public Link() {
        this("", null);

    }

    public Link(String name, String url) {
        this.name = name;
        this.url = url;

    }

    public Link(Link link) { // конструктор копирования, вместо clone
        this(link.name, link.url);
    }

    /*@Override
    public boolean equals(Object obj) {
        return super.equals(obj); // super - ссылка на родителя
    }*/

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public static Link empty() {
        return EMPTY;
    }

    @Override                               // переопределение метода
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Link link = (Link) o;

        if (!name.equals(link.name)) return false;
        return url != null ? url.equals(link.url) : link.url == null;

    }

    @Override
    public int hashCode() { // число; кратко и уникально идентифицурует объект; если объекты равны между собой, у них должны быть равны хеш-коды; если хеши равны не обязательно объекты равны, надо делать equals
        // !!!!! если хеши равны - надо делать equals; если хеши не равны - equals делать не надо
        int result = name.hashCode();
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {   // Alt+Ins toString()
        return "Link{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
