package lesson2;

import ru.mosoulin.webapp.model.Link;

/**
 * Created by Admin on 12.07.16.
 */
public class Main {
    public static void main(String[] args) {
        Link link = new Link("Ololo", "yandex.ru");
        Link link2 = link;
        Link link3 = new Link(link);
        System.out.println(link.getClass()); // getClass возвращает тип класса
        System.out.println(link);
        System.out.println(link.equals(link2));
        System.out.println(link.equals(link3));
    }
}
