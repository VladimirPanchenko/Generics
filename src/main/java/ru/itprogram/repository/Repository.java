package ru.itprogram.repository;

import java.util.List;

public interface Repository<T> {
    T getEntity();
    List<T> getAllEntity();
    void saveEntity(T t);
    void saveAllEntity(List<T> tList);
}
