package ru.itprogram.utils;

import ru.itprogram.dto.UserDto;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter {
    public static void sortById(List<UserDto> userDtos) {
        Collections.sort(userDtos, Comparator.comparing(UserDto::getId));
        System.out.println("Сортировка по полю ID");
        print(userDtos);
    }

    public static void sortByBirthDate(List<UserDto> userDtos) {
        Collections.sort(userDtos, Comparator.comparing(UserDto::getBirthDate).reversed());
        System.out.println("Сортировка по полю BirthDate");
        print(userDtos);
    }

    public static void sortByAddressStreet(List<UserDto> userDtos) {
        Collections.sort(userDtos, Comparator.comparing(userDto -> userDto.getAddress().
                getStreet()));
        System.out.println("Сортировка по полю Address -> Street");
        print(userDtos);
    }

    private static void print(List<UserDto> userDtos) {
        for (UserDto userDto : userDtos) {
            System.out.println(userDto);
        }
    }
}
