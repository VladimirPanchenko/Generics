package ru.itprogram.service.converter;

import ru.itprogram.dto.UserDto;
import ru.itprogram.entity.User;

public class ConverterDto implements Converter<User, UserDto> {

    @Override
    public User getEntity(UserDto userDto) {
        User.Address address = new User.Address(userDto.getAddress().getEmail(),
                userDto.getAddress().getCityType().asCityType(),
                userDto.getAddress().getStreet());
        User user = new User(userDto.getId(), userDto.getName(), address,
                userDto.getBirthDate());

        return user;
    }

    @Override
    public UserDto getDto(User user) {
        UserDto.Address address = new UserDto.Address(user.getAddress().getEmail(),
                user.getAddress().getCityType().asCityType(), user.getAddress().getStreet());
        UserDto userDto = new UserDto(user.getId(), user.getName(), address,
                user.getBirthDate());
        return userDto;
    }
}
