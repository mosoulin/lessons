package lesson3;

import ru.mosoulin.webapp.model.Link;
import ru.mosoulin.webapp.model.Resume;

import java.util.Arrays;

/**
 * Created by Admin on 20.07.16.
 */
public class MainArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        System.out.println(array.length);
        System.out.println(array.getClass());
        System.out.println(Arrays.toString(array));
        Resume[] resumes= new Resume[10];
        System.out.println(resumes.length);
        System.out.println(resumes.getClass());

        Link link = new Link();
        //((Object[])resumes)[0]= link;
    }
}
