package ru.itprogram.utils.generator;

import ru.itprogram.entity.CityType;
import ru.itprogram.entity.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Generator {
    protected static final int LEFT_LIMIT = 97;
    protected static final int RIGHT_LIMIT = 122;
    protected static final int TARGET_STRING_LENGTH = 12;
    protected static final int NUMBER_OF_OBJECTS = 5;

    protected static String getRandomString(int stringLength) {
        Random random = new Random();
        StringBuilder builder = new StringBuilder(stringLength);
        for (int i = 0; i < stringLength; i++) {
            int randomLimitedInt = LEFT_LIMIT + (int)
                    (random.nextFloat() * (RIGHT_LIMIT - LEFT_LIMIT + 1));
            builder.append((char) randomLimitedInt);
        }
        return builder.toString();
    }

    protected static long getRandomLong() {
        Random random = new Random();
        return Math.abs(random.nextLong() - 1);
    }

    protected static LocalDate getRandomDate() {
        Random random = new Random();
        int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2013, 1, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);
        LocalDate localDate = LocalDate.ofEpochDay(randomDay);
        return localDate;
    }
}
