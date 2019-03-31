package ru.itprogram.service;

import ru.itprogram.dto.UserDto;
import ru.itprogram.entity.User;
import ru.itprogram.repository.RepositoryUser;
import ru.itprogram.service.converter.ConverterDto;

import java.util.ArrayList;
import java.util.List;

public class ServiceDto implements Service<UserDto> {
    private RepositoryUser repositoryUser = new RepositoryUser();
    private ConverterDto converterDto = new ConverterDto();

    @Override
    public UserDto getDto() {
        User user = repositoryUser.getEntity();
        return converterDto.getDto(user);
    }

    @Override
    public List<UserDto> getAllDto() {
        List<User> users = repositoryUser.getAllEntity();
        List<UserDto> userDtos = new ArrayList<>();
        for (User user : users) {
            userDtos.add(converterDto.getDto(user));
        }
        return userDtos;
    }

    @Override
    public void addDtoObject(UserDto userDto) {
        repositoryUser.saveEntity(converterDto.getEntity(userDto));
    }

    @Override
    public void addListDtoObject(List<UserDto> userDtos) {
        List<User> users = new ArrayList<>();
        for (UserDto userDto : userDtos) {
            users.add(converterDto.getEntity(userDto));
        }
        repositoryUser.saveAllEntity(users);
    }
}
