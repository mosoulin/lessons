package ru.mosoulin.webapp.storage;

import ru.mosoulin.webapp.model.Resume;

import java.util.Collection;

/**
 * Created by Admin on 20.07.16.
 */
public interface IStorage {
    void clear();

    void save(Resume r);

    void update(Resume r);

    Resume load(String uuid);

    void delete(String uuid);

    Collection<Resume> getAllSorted();

    int size();


}
