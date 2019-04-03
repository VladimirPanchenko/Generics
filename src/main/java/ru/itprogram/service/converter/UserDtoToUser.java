package ru.itprogram.service.converter;

import ru.itprogram.dto.UserDto;
import ru.itprogram.entity.User;

public class UserDtoToUser implements Converter<User, UserDto> {
    @Override
    public User convertion(UserDto userDto) {
        User.Address address = new User.Address(userDto.getAddress().getEmail(),
                userDto.getAddress().getCityType().asCityType(),
                userDto.getAddress().getStreet());
        User user = new User(userDto.getId(), userDto.getName(), address,
                userDto.getBirthDate());

        return user;
    }
}
