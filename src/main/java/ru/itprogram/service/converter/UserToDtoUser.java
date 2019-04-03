package ru.itprogram.service.converter;

import ru.itprogram.dto.UserDto;
import ru.itprogram.entity.User;

public class UserToDtoUser implements Converter<UserDto, User> {

    @Override
    public UserDto convertion(User user) {
        UserDto.Address address = new UserDto.Address(user.getAddress().getEmail(),
                user.getAddress().getCityType().asCityType(), user.getAddress().getStreet());
        UserDto userDto = new UserDto(user.getId(), user.getName(), address,
                user.getBirthDate());
        return userDto;
    }
}
