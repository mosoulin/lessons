package lesson2;

import ru.mosoulin.webapp.model.Link;

/**
 * Created by Admin on 12.07.16.
 */
public class Main {
    public static void main(String[] args) {
        Link link1 = new Link("Ololo", "yandex.ru");
        Link link2 = link1;
        Link link3 = new Link(link1);
        System.out.println(link1.getClass()); // getClass возвращает тип класса
        System.out.println(link1);
        System.out.println(link1.equals(link2));
        System.out.println(link1.equals(link3));
        System.out.println(link1.hashCode());
        System.out.println(link3.hashCode());
        System.out.println(Link.EMPTY); // правильная ссылка на статический член класса, создавать объект не надо
        System.out.println(Link.empty()); // ссылка на статический метод класса без создания экземпляра класса
        Integer obj = new Integer(5);
        printInt(obj);
    }

    static void printInt(Integer obj) {               // overload перегрузка, методы имеют одинаковое имя и разные типы или параметры
        System.out.println("object "+obj);
    }

    static void printInt(int i) {
        System.out.println(i);
    }
}
