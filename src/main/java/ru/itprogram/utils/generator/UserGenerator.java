package ru.itprogram.utils.generator;

import ru.itprogram.entity.CityType;
import ru.itprogram.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserGenerator extends Generator {
    public static User getUser() {
        User user = new User(getRandomLong(), getRandomString(TARGET_STRING_LENGTH),
                getRandomAddress(), getRandomDate());
        return user;
    }

    public static List<User> getListUser() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_OBJECTS; i++) {
            users.add(getUser());
        }
        return users;
    }

    private static User.Address getRandomAddress() {
        User.Address address = new User.Address(getRandomString(TARGET_STRING_LENGTH),
                getRandomCityType(), getRandomString(TARGET_STRING_LENGTH));
        return address;
    }

    private static CityType getRandomCityType() {
        return CityType.values()[new Random().nextInt(CityType.values().length)];
    }
}
