package ru.itprogram.service;

import java.util.List;

public interface Service<T> {
    T getDto();
    List<T> getAllDto();
    void addDtoObject(T t);
    void addListDtoObject(List<T> tList);
}
