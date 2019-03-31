package ru.itprogram.utils.generator;

import ru.itprogram.dto.CityType;
import ru.itprogram.dto.UserDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserDtoGenerator extends Generator {
    public static UserDto getUser() {
        UserDto userDto = new UserDto(getRandomLong(), getRandomString(TARGET_STRING_LENGTH),
                getRandomAddress(), getRandomDate());
        return userDto;
    }

    public static List<UserDto> getListUser() {
        List<UserDto> userDtos = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_OBJECTS; i++) {
            userDtos.add(getUser());
        }
        return userDtos;
    }

    private static UserDto.Address getRandomAddress() {
        UserDto.Address address = new UserDto.Address(getRandomString(TARGET_STRING_LENGTH),
                getRandomCityType(), getRandomString(TARGET_STRING_LENGTH));
        return address;
    }

    private static CityType getRandomCityType() {
        return CityType.values()[new Random().nextInt(CityType.values().length)];
    }
}
