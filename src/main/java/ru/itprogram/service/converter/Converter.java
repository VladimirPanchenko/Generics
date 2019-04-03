package ru.itprogram.service.converter;

public interface Converter<T, V> {
    T convertion(V v);
}
