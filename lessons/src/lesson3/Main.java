package lesson3;

import ru.mosoulin.webapp.model.Contact;
import ru.mosoulin.webapp.model.ContactType;
import ru.mosoulin.webapp.model.Link;

import java.lang.reflect.Field;

/**
 * Created by Admin on 13.07.16.
 */
public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Contact contact = new Contact(ContactType.PHONE, "89272986779");

        Link link = new Link("asd","URL");
        Field f = Link.class.getDeclaredField("url"); // доступ к полю через отражение; reflection, используется как "хакерство"
        f.setAccessible(true);// доступ к полю
        System.out.println(f.get(link));
        System.out.println(link);
        System.out.println(link instanceof Link); // является ли объект link экземпляром класса Link
        System.out.println(Link.class.isInstance(link)); // является ли объект link экземпляром класса Link (Динамический аналог)
        // Строки



        String a = "Ja" + "va";
        String b = "Java";
        System.out.println(a==b); // пул стрингов


        String fill = "";// !!!!!!! String -  не изменяемый объект
        for (int i = 0; i <10 ; i++) { // !!!!! ТАК НЕЛЬЗЯ. каждый раз создается новый объект(строка), а не изменяется строка
            fill += "a";
        }
        System.out.println(fill);

        StringBuffer fill2 = new StringBuffer(); // не создает каждый раз новый объект, работает с многопоточностью. Нужно использовать только когда многопоточность
        for (int i = 0; i <10 ; i++) {
            fill2.append("a"); // в одном объекте добавляет "а"
        }
        System.out.println(fill2.toString());

        StringBuilder fill3 = new StringBuilder(); // не создает каждый раз новый объект, лучший вариант БЕЗ многопоточности
        for (int i = 0; i <10 ; i++) {
            fill3.append("a");
        }
        System.out.println(fill3.toString());
    }
}
