package ru.itprogram.service.converter;

public interface Converter<T, V> {
    T getEntity(V v);
    V getDto(T t);
}
